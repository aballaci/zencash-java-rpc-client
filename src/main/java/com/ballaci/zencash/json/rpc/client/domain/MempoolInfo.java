package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 17.05.2018
 *
 * @author Armand Ballaci
 **/
public class MempoolInfo {

    // Current tx count
    @JsonProperty
    private long size;

    // Sum of all tx sizes
    @JsonProperty
    private long bytes;

    // Total memory usage for the mempool
    @JsonProperty
    private long usage;

    public MempoolInfo(@JsonProperty("size") long size,
                       @JsonProperty("bytes") long bytes,
                       @JsonProperty("usage") long usage) {
        this.size = size;
        this.bytes = bytes;
        this.usage = usage;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getBytes() {
        return bytes;
    }

    public void setBytes(long bytes) {
        this.bytes = bytes;
    }

    public long getUsage() {
        return usage;
    }

    public void setUsage(long usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "MempoolInfo{" +
                "size=" + size +
                ", bytes=" + bytes +
                ", usage=" + usage +
                '}';
    }
}
