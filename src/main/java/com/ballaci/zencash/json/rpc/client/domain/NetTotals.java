package com.ballaci.zencash.json.rpc.client.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 *Returns information about network traffic, including bytes in, bytes out
 * and current time
 */
public class NetTotals implements Serializable {

    // total bytes recieved
    @JsonProperty
    private Long totalbytesrecv;

    // total bytes sent
    @JsonProperty
    private Long totalbytessent;

    // time in miliseconds
    @JsonProperty
    private Long timemillis;

    public NetTotals(@JsonProperty("totalbytesrecv") Long totalbytesrecv,
                     @JsonProperty("totalbytessent") Long totalbytessent,
                     @JsonProperty("timemillis") Long timemillis) {
        this.totalbytesrecv = totalbytesrecv;
        this.totalbytessent = totalbytessent;
        this.timemillis = timemillis;
    }

    public Long getTotalbytesrecv() {
        return totalbytesrecv;
    }

    public void setTotalbytesrecv(Long totalbytesrecv) {
        this.totalbytesrecv = totalbytesrecv;
    }

    public Long getTotalbytessent() {
        return totalbytessent;
    }

    public void setTotalbytessent(Long totalbytessent) {
        this.totalbytessent = totalbytessent;
    }

    public Long getTimemillis() {
        return timemillis;
    }

    public void setTimemillis(Long timemillis) {
        this.timemillis = timemillis;
    }

    @Override
    public String toString() {
        return "NetTotals{" +
                "totalbytesrecv=" + totalbytesrecv +
                ", totalbytessent=" + totalbytessent +
                ", timemillis=" + timemillis +
                '}';
    }
}
