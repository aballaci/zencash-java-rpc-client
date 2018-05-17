package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

/**
 * 17.05.2018
 *
 * @author Armand Ballaci
 **/
public class ScriptPubKey {

    @JsonProperty
    private String asm;

    @JsonProperty
    private String hex;

    // Number of required signatures
    @JsonProperty
    private int reqSigs;

    // The type, eg pubkeyhash
    @JsonProperty
    private String type;

    // array of zencash addresses
    @JsonProperty
    private String[] addresses;

    public ScriptPubKey(@JsonProperty("asm") String asm,
                        @JsonProperty("hex") String hex,
                        @JsonProperty("reqSigs") int reqSigs,
                        @JsonProperty("type") String type,
                        @JsonProperty("addresses") String[] addresses) {
        this.asm = asm;
        this.hex = hex;
        this.reqSigs = reqSigs;
        this.type = type;
        this.addresses = addresses;
    }

    public String getAsm() {
        return asm;
    }

    public void setAsm(String asm) {
        this.asm = asm;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public int getReqSigs() {
        return reqSigs;
    }

    public void setReqSigs(int reqSigs) {
        this.reqSigs = reqSigs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getAddresses() {
        return addresses;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "ScriptPubKey{" +
                "asm='" + asm + '\'' +
                ", hex='" + hex + '\'' +
                ", reqSigs=" + reqSigs +
                ", type='" + type + '\'' +
                ", addresses=" + Arrays.toString(addresses) +
                '}';
    }
}
