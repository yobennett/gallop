package com.yobennett.lambdaarchitectures.gallop.batch.storage;

import java.util.Collections;
import java.util.List;

import com.yobennett.lambdaarchitectures.gallop.schema.Data;

public class DataPailStructure extends ThriftPailStructure<Data> {

    public Class getType() {
        return Data.class;
    }

    protected Data createThriftObject() {
        return new Data();
    }

    public List<String> getTarget(Data object) {
        return Collections.EMPTY_LIST;
    }

    public boolean isValidTarget(String... dirs) {
        return true;
    }

}
