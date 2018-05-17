package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 17.05.2018
 *
 * @author Armand Ballaci
 **/
public class Chaintip {

    // height of the chain tip
    @JsonProperty
    private int height;

    // block hash of the tip
    @JsonProperty
    private String hash;

    // zero for main chain | length of branch connecting the tip to the main chain
    @JsonProperty
    private int branchlen;

    /**
     * status of the chain (active, valid-fork, valid-headers, headers-only, invalid)
     *             1.  "invalid"               This branch contains at least one invalid block
     *             2.  "headers-only"          Not all blocks for this branch are available, but the headers are valid
     *             3.  "valid-headers"         All blocks are available for this branch, but they were never fully validated
     *             4.  "valid-fork"            This branch is not part of the active chain, but is fully validated
     *             5.  "active"                This is the tip of the active main chain, which is certainly valid
     */
    @JsonProperty
    private String status;

    public Chaintip(@JsonProperty("height") int height,
                    @JsonProperty("hash") String hash,
                    @JsonProperty("branchlen") int branchlen,
                    @JsonProperty("status") String status) {
        this.height = height;
        this.hash = hash;
        this.branchlen = branchlen;
        this.status = status;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getBranchlen() {
        return branchlen;
    }

    public void setBranchlen(int branchlen) {
        this.branchlen = branchlen;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Chaintip{" +
                "height=" + height +
                ", hash='" + hash + '\'' +
                ", branchlen=" + branchlen +
                ", status='" + status + '\'' +
                '}';
    }
}
