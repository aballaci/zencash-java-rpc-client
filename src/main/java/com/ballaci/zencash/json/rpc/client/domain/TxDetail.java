package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

/**
 * 17.05.2018
 *
 * @author Armand Ballaci
 **/
public class TxDetail {

    // transaction size in bytes
    @JsonProperty
    private int size;

    // transaction fee in zencash
    @JsonProperty
    private double fee;

    //  local time transaction entered pool in seconds since 1 Jan 1970 GMT
    @JsonProperty
    private long time;

    // block height when transaction entered pool
    @JsonProperty
    private int height;

    // priority when transaction entered pool
    @JsonProperty
    private double startingpriority;

    // transaction priority now
    @JsonProperty
    private double currentpriority;

    // unconfirmed transactions used as inputs for this transaction (parent transaction id)
    @JsonProperty
    private String[] depends;

    public TxDetail(@JsonProperty("size") int size,
                    @JsonProperty("fee") double fee,
                    @JsonProperty("time") long time,
                    @JsonProperty("height") int height,
                    @JsonProperty("startingpriority") double startingpriority,
                    @JsonProperty("currentpriority") double currentpriority,
                    @JsonProperty("depends") String[] depends) {
        this.size = size;
        this.fee = fee;
        this.time = time;
        this.height = height;
        this.startingpriority = startingpriority;
        this.currentpriority = currentpriority;
        this.depends = depends;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getStartingpriority() {
        return startingpriority;
    }

    public void setStartingpriority(double startingpriority) {
        this.startingpriority = startingpriority;
    }

    public double getCurrentpriority() {
        return currentpriority;
    }

    public void setCurrentpriority(double currentpriority) {
        this.currentpriority = currentpriority;
    }

    public String[] getDepends() {
        return depends;
    }

    public void setDepends(String[] depends) {
        this.depends = depends;
    }

    @Override
    public String toString() {
        return "TxDetail{" +
                "size=" + size +
                ", fee=" + fee +
                ", time=" + time +
                ", height=" + height +
                ", startingpriority=" + startingpriority +
                ", currentpriority=" + currentpriority +
                ", depends=" + Arrays.toString(depends) +
                '}';
    }
}
