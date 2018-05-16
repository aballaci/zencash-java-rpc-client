package com.ballaci.zencash.json.rpc.client.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

/**
 * @author Armand Ballaci
 */

public class BlockchainInfo {

    // current network name as defined in BIP70 (main, test, regtest)
    @JsonProperty
    private String chain;

    //  the current number of blocks processed in the server
    @JsonProperty
    private long blocks;

    // the current number of headers we have validated
    @JsonProperty
    private int headers;

    // the hash of the currently best block
    @JsonProperty
    private String bestblockhash;

    // the current difficulty
    @JsonProperty
    private double difficulty;

    // estimate of verification progress [0..1]
    @JsonProperty
    private double verificationprogress;

    // total amount of work in active chain, in hexadecimal
    @JsonProperty
    private String chainwork;

    // True if we're running in -prune mode.
    @JsonProperty
    private boolean pruned;

    // the current number of note commitments in the commitment tree
    @JsonProperty
    private int commitments;

    // status of softforks in progress
    @JsonProperty
    private Softfork[] softforks;

    // status of BIP9 softforks in progress
    @JsonProperty
    private Bip9SoftforkStatus bip9Softforks;

    public BlockchainInfo(@JsonProperty("chain") String chain,
                          @JsonProperty("blocks") long blocks,
                          @JsonProperty("headers") int headers,
                          @JsonProperty("bestblockhash") String bestblockhash,
                          @JsonProperty("difficulty") double difficulty,
                          @JsonProperty("verificationprogress") double verificationprogress,
                          @JsonProperty("chainwork") String chainwork,
                          @JsonProperty("pruned") boolean pruned,
                          @JsonProperty("commitments") int commitments,
                          @JsonProperty("softforks") Softfork[] softforks,
                          @JsonProperty("bip9_softforks") Bip9SoftforkStatus bip9Softforks) {
        this.chain = chain;
        this.blocks = blocks;
        this.headers = headers;
        this.bestblockhash = bestblockhash;
        this.difficulty = difficulty;
        this.verificationprogress = verificationprogress;
        this.chainwork = chainwork;
        this.pruned = pruned;
        this.commitments = commitments;
        this.softforks = softforks;
        this.bip9Softforks = bip9Softforks;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public long getBlocks() {
        return blocks;
    }

    public void setBlocks(long blocks) {
        this.blocks = blocks;
    }

    public int getHeaders() {
        return headers;
    }

    public void setHeaders(int headers) {
        this.headers = headers;
    }

    public String getBestblockhash() {
        return bestblockhash;
    }

    public void setBestblockhash(String bestblockhash) {
        this.bestblockhash = bestblockhash;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public double getVerificationprogress() {
        return verificationprogress;
    }

    public void setVerificationprogress(double verificationprogress) {
        this.verificationprogress = verificationprogress;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public boolean isPruned() {
        return pruned;
    }

    public void setPruned(boolean pruned) {
        this.pruned = pruned;
    }

    public int getCommitments() {
        return commitments;
    }

    public void setCommitments(int commitments) {
        this.commitments = commitments;
    }

    public Softfork[] getSoftforks() {
        return softforks;
    }

    public void setSoftforks(Softfork[] softforks) {
        this.softforks = softforks;
    }

    public Bip9SoftforkStatus getBip9Softforks() {
        return bip9Softforks;
    }

    public void setBip9Softforks(Bip9SoftforkStatus bip9Softforks) {
        this.bip9Softforks = bip9Softforks;
    }

    @Override
    public String toString() {
        return "BlockchainInfo{" +
                "chain=" + chain +
                ", blocks=" + blocks +
                ", headers=" + headers +
                ", bestblockhash='" + bestblockhash + '\'' +
                ", difficulty=" + difficulty +
                ", verificationprogress=" + verificationprogress +
                ", chainwork='" + chainwork + '\'' +
                ", pruned=" + pruned +
                ", commitments=" + commitments +
                ", softforks=" + Arrays.toString(softforks) +
                ", bip9Softforks=" + bip9Softforks +
                '}';
    }
}
