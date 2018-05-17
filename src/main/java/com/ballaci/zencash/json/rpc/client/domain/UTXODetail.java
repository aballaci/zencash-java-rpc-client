package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 17.05.2018
 *
 * @author Armand Ballaci
 **/
public class UTXODetail {

    // the block hash
    @JsonProperty
    private String bestblock;

    // The number of confirmations
    @JsonProperty
    private int confirmations;

    // The transaction value in zencash
    @JsonProperty
    private String value;

    // Script Public Key
    @JsonProperty
    private ScriptPubKey scriptPubKey;

    // The version
    @JsonProperty
    private int version;

    // Coinbase or not
    @JsonProperty
    private boolean coinbase;

    public UTXODetail(@JsonProperty("bestblock") String hash,
                      @JsonProperty("confirmations") int confirmations,
                      @JsonProperty("value") String value,
                      @JsonProperty("scriptPubKey") ScriptPubKey scriptPubKey,
                      @JsonProperty("version") int version,
                      @JsonProperty("coinbase") boolean coinbase) {
        this.bestblock = hash;
        this.confirmations = confirmations;
        this.value = value;
        this.scriptPubKey = scriptPubKey;
        this.version = version;
        this.coinbase = coinbase;
    }

    public String getBestblock() {
        return bestblock;
    }

    public void setBestblock(String bestblock) {
        this.bestblock = bestblock;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ScriptPubKey getScriptPubKey() {
        return scriptPubKey;
    }

    public void setScriptPubKey(ScriptPubKey scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isCoinbase() {
        return coinbase;
    }

    public void setCoinbase(boolean coinbase) {
        this.coinbase = coinbase;
    }

    @Override
    public String toString() {
        return "UTXODetail{" +
                "bestblock='" + bestblock + '\'' +
                ", confirmations=" + confirmations +
                ", value='" + value + '\'' +
                ", scriptPubKey=" + scriptPubKey +
                ", version=" + version +
                ", coinbase=" + coinbase +
                '}';
    }
}
