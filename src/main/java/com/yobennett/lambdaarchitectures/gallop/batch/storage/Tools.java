package com.yobennett.lambdaarchitectures.gallop.batch.storage;

import cascading.tap.Tap;
import cascalog.ops.IdentityBuffer;
import cascalog.ops.RandLong;
import com.backtype.cascading.tap.PailTap;
import com.backtype.hadoop.pail.Pail;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.backtype.hadoop.pail.PailSpec;
import com.backtype.hadoop.pail.PailStructure;
import com.yobennett.lambdaarchitectures.gallop.schema.DataUnit;
import jcascalog.Api;
import jcascalog.Subquery;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Tools {

    /*
    Tells Hadoop to use both the Thrift serializer and the default Hadoop serializer.
    Hadoop will automatically determine the best option to use.
    This setting is global.
    */
    // TODO maybe turn this into a static initializer
    public static void setApplicationConf() {
        Map conf = new HashMap<String, String>();
        String serializers = "backtype.hadoop.ThriftSerialization," +
                                "org.apache.hadoop.io.serializer.WritableSerialization";
        conf.put("io.serializations", serializers);
        Api.setApplicationConf(conf);
    }

    /*
    Add new data to master.
     */
    public static void ingest(Pail masterPail, Pail newDataPail) throws IOException {
        FileSystem fs = FileSystem.get(new Configuration());
        fs.delete(new Path("/tmp/swa"), true);
        fs.mkdirs(new Path("/tmp/swa"));
        Pail snapshotPail = newDataPail.snapshot("/tmp/swa/newDataSnapshot");
        appendNewData(masterPail, snapshotPail);
        newDataPail.deleteSnapshot(snapshotPail);
    }

    public static void pailTapUsage() {
        Tap source = new PailTap("/tmp/swa/snapshot");
        new Subquery("?data").predicate(source, "_", "?data");
    }

    public static PailTap attributeTap(String path, final DataUnit._Fields... fields) {
        PailTap.PailTapOptions opts = new PailTap.PailTapOptions();
        opts.attrs = new List[] {
            new ArrayList<String>() {
                {
                    for(DataUnit._Fields field:fields) {
                        add("" + field.getThriftFieldId());
                    }
                }
            }
        };
        return new PailTap(path, opts);
    }

    public static PailTap splitDataTap(String path) {
        PailTap.PailTapOptions opts = new PailTap.PailTapOptions();
        opts.spec = new PailSpec(new SplitDataPailStructure());
        return new PailTap(path, opts);
    }

    public static Pail shred() throws IOException {
        PailTap source = new PailTap("/tmp/swa/snapshot");
        PailTap sink = splitDataTap("/tmp/swa/shredded");

        Subquery reduced = new Subquery("?rand", "?data")
                .predicate(source, "_", "?data-in")
                .predicate(new RandLong())
                    .out("?rand")
                .predicate(new IdentityBuffer(), "?data-in")
                    .out("?data");

        Api.execute(sink, new Subquery("?data").predicate(reduced, "_", "?data"));
        Pail shreddedPail = new Pail("/tmp/swa/shredded");
        shreddedPail.consolidate();
        return shreddedPail;
    }

    public static void appendNewData(Pail masterPail, Pail snapshotPail) throws IOException {
        Pail shreddedPail = shred();
        masterPail.absorb(shreddedPail);
    }

}
