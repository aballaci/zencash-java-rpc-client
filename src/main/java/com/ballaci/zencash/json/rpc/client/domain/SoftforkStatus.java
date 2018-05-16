package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Armand Ballaci
 */
public class SoftforkStatus {

    // one of "defined", "started", "lockedin", "active", "failed"
    // true if threshold reached
    @JsonProperty
    private boolean status;

    // number of blocks with the new version found
    @JsonProperty
    private int found;

    // number of blocks required to trigger
    @JsonProperty
    private int required;

    // maximum size of examined window of recent blocks
    @JsonProperty
    private int window;

    public SoftforkStatus(@JsonProperty("status") boolean status,
                          @JsonProperty("found") int found,
                          @JsonProperty("required") int required,
                          @JsonProperty("window") int window) {
        this.status = status;
        this.found = found;
        this.required = required;
        this.window = window;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getFound() {
        return found;
    }

    public void setFound(int found) {
        this.found = found;
    }

    public int getRequired() {
        return required;
    }

    public void setRequired(int required) {
        this.required = required;
    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "SoftforkStatus{" +
                "status=" + status +
                ", found=" + found +
                ", required=" + required +
                ", window=" + window +
                '}';
    }
}
