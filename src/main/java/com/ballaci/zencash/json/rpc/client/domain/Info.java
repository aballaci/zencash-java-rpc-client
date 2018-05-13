package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Info {

    @JsonProperty
    private Long version;
    @JsonProperty
    private Long protocolversion;
    @JsonProperty
    private Long walletversion;
    @JsonProperty
    private Double balance;
    @JsonProperty
    private Long blocks;
    @JsonProperty
    private Integer timeoffset;
    @JsonProperty
    private int connections;
    @JsonProperty
    private String proxy;
    @JsonProperty
    private Double difficulty;
    @JsonProperty
    private Boolean testnet;
    @JsonProperty
    private Long keypoololdest;
    @JsonProperty
    private Long keypoolsize;
    @JsonProperty
    private Double paytxfee;
    @JsonProperty
    private Double relayfee;
    @JsonProperty
    private String errors;

    @JsonCreator
    public Info(@JsonProperty("version") Long version, @JsonProperty("protocolversion") Long protocolversion,
                @JsonProperty("walletversion") Long walletversion, @JsonProperty("balance") Double balance,
                @JsonProperty("blocks") Long blocks, @JsonProperty("timeoffset") Integer timeoffset,
                @JsonProperty("connections") int connections, @JsonProperty("proxy") String proxy,
                @JsonProperty("difficulty") Double difficulty, @JsonProperty("testnet") Boolean testnet,
                @JsonProperty("keypoololdest") Long keypoololdest, @JsonProperty("keypoolsize") Long keypoolsize,
                @JsonProperty("paytxfee") Double paytxfee, @JsonProperty("relayfee") Double relayfee,
                @JsonProperty("errors") String errors) {
        this.version = version;
        this.protocolversion = protocolversion;
        this.walletversion = walletversion;
        this.balance = balance;
        this.blocks = blocks;
        this.timeoffset = timeoffset;
        this.connections = connections;
        this.proxy = proxy;
        this.difficulty = difficulty;
        this.testnet = testnet;
        this.keypoololdest = keypoololdest;
        this.keypoolsize = keypoolsize;
        this.paytxfee = paytxfee;
        this.relayfee = relayfee;
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "Info{" +
                "version=" + version +
                ", protocolversion=" + protocolversion +
                ", walletversion=" + walletversion +
                ", balance=" + balance +
                ", blocks=" + blocks +
                ", timeoffset=" + timeoffset +
                ", connections=" + connections +
                ", proxy='" + proxy + '\'' +
                ", difficulty=" + difficulty +
                ", testnet=" + testnet +
                ", keypoololdest=" + keypoololdest +
                ", keypoolsize=" + keypoolsize +
                ", paytxfee=" + paytxfee +
                ", relayfee=" + relayfee +
                ", errors='" + errors + '\'' +
                '}';
    }
}
