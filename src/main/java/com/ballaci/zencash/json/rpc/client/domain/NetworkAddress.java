package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


public class NetworkAddress implements Serializable {

    @JsonProperty
    private String address;

    @JsonProperty
    private Integer port;

    @JsonProperty
    private Integer score;

    public NetworkAddress(@JsonProperty("address") String address, @JsonProperty("port") Integer port,
                          @JsonProperty("score") Integer score) {
        this.address = address;
        this.port = port;
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "NetworkAddress{" +
                "address='" + address + '\'' +
                ", port=" + port +
                ", score=" + score +
                '}';
    }
}
