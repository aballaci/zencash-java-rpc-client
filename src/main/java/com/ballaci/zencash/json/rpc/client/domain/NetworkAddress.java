package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 *  *             "  {\n"
 *  *             "    \"address\": \"xxxx\",                 (string) network address\n"
 *  *             "    \"port\": xxx,                         (numeric) network port\n"
 *  *             "    \"score\": xxx                         (numeric) relative score\n"
 *  *             "  }\n"
 */
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

    @Override
    public String toString() {
        return "NetworkAddress{" +
                "address='" + address + '\'' +
                ", port=" + port +
                ", score=" + score +
                '}';
    }
}
