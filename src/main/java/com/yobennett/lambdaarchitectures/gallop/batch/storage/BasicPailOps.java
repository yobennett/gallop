package com.yobennett.lambdaarchitectures.gallop.batch.storage;


import java.io.IOException;

import com.backtype.hadoop.pail.Pail;
import com.backtype.hadoop.pail.Pail.TypedRecordOutputStream;

public class BasicPailOps {

    public static void simpleIO() throws IOException {
        Pail pail = Pail.create("/tmp/mypail");
        TypedRecordOutputStream os = pail.openWrite();
        os.writeObject(new byte[] {1, 2, 3});
        os.writeObject(new byte[] {1, 2, 3, 4});
        os.writeObject(new byte[] {1, 2, 3, 4, 5});
        os.close();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Starting...");
        simpleIO();
        System.out.println("Done.");
    }

}
