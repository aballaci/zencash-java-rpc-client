package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bip9SoftforkStatus {

    // one of "defined", "started", "lockedin", "active", "failed"
    @JsonProperty
    private String status;

    // the bit, 0-28, in the block version field used to signal this soft fork
    @JsonProperty
    private int bit;

    // the minimum median time past of a block at which the bit gains its meaning
    @JsonProperty
    private long startTime;

    // the median time past of a block at which the deployment is considered failed if not yet locked in
    @JsonProperty
    private int timeout;

    public Bip9SoftforkStatus(@JsonProperty("status") String status,
                              @JsonProperty("bit") int bit,
                              @JsonProperty("startTime") long startTime,
                              @JsonProperty("timeout") int timeout) {
        this.status = status;
        this.bit = bit;
        this.startTime = startTime;
        this.timeout = timeout;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    public String toString() {
        return "Bip9SoftforkStatus{" +
                "status='" + status + '\'' +
                ", bit=" + bit +
                ", startTime=" + startTime +
                ", timeout=" + timeout +
                '}';
    }
}
