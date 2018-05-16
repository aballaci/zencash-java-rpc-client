package com.ballaci.zencash.json.rpc.client.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * @author Armand Ballaci
 */
public class Softfork {

    // name of the softfork
    @JsonProperty
    private String id;

    // Peer index
    @JsonProperty
    private int version;

    // Peer index
    @JsonProperty
    private SoftforkStatus enforce;

    // Peer index
    @JsonProperty
    private SoftforkStatus reject;

    public Softfork(@JsonProperty("id") String id,
                    @JsonProperty("version") int version,
                    @JsonProperty("enforce") SoftforkStatus enforce,
                    @JsonProperty("reject") SoftforkStatus reject) {
        this.id = id;
        this.version = version;
        this.enforce = enforce;
        this.reject = reject;
    }

    @Override
    public String toString() {
        return "Softfork{" +
                "id='" + id + '\'' +
                ", version=" + version +
                ", enforce=" + enforce +
                ", reject=" + reject +
                '}';
    }
}
