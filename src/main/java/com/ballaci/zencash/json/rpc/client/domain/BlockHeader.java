package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Armand Ballaci
 */
public class BlockHeader {

    // the block hash (same as provided)
    @JsonProperty
    private String hash;

    // The number of confirmations, or -1 if the block is not on the main chain
    @JsonProperty
    private int confirmations;

    // he block height or index
    @JsonProperty
    private int height;

    // The block version
    @JsonProperty
    private int version;

    // The merkle root
    @JsonProperty
    private String merkleroot;

    // The block time in seconds since epoch (Jan 1 1970 GMT)
    @JsonProperty
    private long time;

    // The nonce
    @JsonProperty
    private String nonce;

    // e.g:"1d00ffff"  The bits
    @JsonProperty
    private String bits;

    // The difficulty
    @JsonProperty
    private double difficulty;

    // The difficulty
    @JsonProperty
    private String chainwork;

    // The hash of the previous block
    @JsonProperty
    private String previousblockhash;

    // The hash of the next block
    @JsonProperty
    private String nextblockhash;

    // The solution
    @JsonProperty
    private String solution;

    public BlockHeader(@JsonProperty("hash") String hash,
                       @JsonProperty("confirmations") int confirmations,
                       @JsonProperty("height") int height,
                       @JsonProperty("version") int version,
                       @JsonProperty("merkleroot") String merkleroot,
                       @JsonProperty("time") long time,
                       @JsonProperty("nonce") String nonce,
                       @JsonProperty("bits") String bits,
                       @JsonProperty("difficulty") double difficulty,
                       @JsonProperty("chainwork") String chainwork ,
                       @JsonProperty("previousblockhash") String previousblockhash,
                       @JsonProperty("nextblockhash") String nextblockhash,
                       @JsonProperty("solution") String solution) {
        this.hash = hash;
        this.confirmations = confirmations;
        this.height = height;
        this.version = version;
        this.merkleroot = merkleroot;
        this.time = time;
        this.nonce = nonce;
        this.bits = bits;
        this.difficulty = difficulty;
        this.previousblockhash = previousblockhash;
        this.nextblockhash = nextblockhash;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getMerkleroot() {
        return merkleroot;
    }

    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getBits() {
        return bits;
    }

    public void setBits(String bits) {
        this.bits = bits;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public String getPreviousblockhash() {
        return previousblockhash;
    }

    public void setPreviousblockhash(String previousblockhash) {
        this.previousblockhash = previousblockhash;
    }

    public String getNextblockhash() {
        return nextblockhash;
    }

    public void setNextblockhash(String nextblockhash) {
        this.nextblockhash = nextblockhash;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    @Override
    public String toString() {
        return "BlockHeader{" +
                "hash='" + hash + '\'' +
                ", confirmations=" + confirmations +
                ", height=" + height +
                ", version=" + version +
                ", merkleroot='" + merkleroot + '\'' +
                ", time=" + time +
                ", nonce='" + nonce + '\'' +
                ", bits='" + bits + '\'' +
                ", difficulty=" + difficulty +
                ", chainwork='" + chainwork + '\'' +
                ", previousblockhash='" + previousblockhash + '\'' +
                ", nextblockhash='" + nextblockhash + '\'' +
                ", solution='" + solution + '\'' +
                '}';
    }
}
