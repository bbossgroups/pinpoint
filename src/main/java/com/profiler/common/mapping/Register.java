package com.profiler.common.mapping;

/**
 *
 */
public interface Register {
    public static final String[] NULL = new String[]{};

    void register(ApiMappingTable apiMappingTable, int startRange, int endRange);

}
