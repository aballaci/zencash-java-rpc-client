package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Arrays;


/**
 * @author Armand Ballaci
 */

public class NodeAddress implements Serializable {

    // The bitcoin server host and port
    @JsonProperty
    private String address;

    //connection, inbound or outbound
    @JsonProperty
    private String connected;



    public NodeAddress(@JsonProperty("address") String address,
                       @JsonProperty("connected") String connected) {
        this.address = address;
        this.connected = connected;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getConnected() {
        return connected;
    }

    public void setConnected(String connected) {
        this.connected = connected;
    }

    @Override
    public String toString() {
        return "NodeAddress{" +
                "address='" + address + '\'' +
                ", connected='" + connected + '\'' +
                '}';
    }
}
