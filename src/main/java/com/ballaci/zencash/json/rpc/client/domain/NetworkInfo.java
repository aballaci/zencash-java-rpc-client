package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Arrays;

/**
 *  Returns an object containing various state info regarding P2P networking.
 */

public class NetworkInfo implements Serializable {

    // the server version
    @JsonProperty
    private Integer version;

    //MagicBean:x.y.z[-v] the server subversion string
    @JsonProperty
    private String subversion;

    // format: xxxxx - the protocol version
    @JsonProperty
    private Integer protocolversion;

    // format:xxxxxxxxxxxxxxxx - the services we offer to the network
    @JsonProperty
    private Integer localservices;

    // format: xxxxx - time offset
    @JsonProperty
    private Integer timeoffset;

    // format: xxxxx - the number of connections
    @JsonProperty
    private Integer connections;

    // true if the certificate of the current node is verified
    @JsonProperty
    private Boolean tlsCertVerified;

    @JsonProperty
    private Network[] networks;

    // format: x.xxxxxxxx - minimum relay fee for non-free transactions in btc/kb
    @JsonProperty
    private Double relayfee;

    // list of local addresses
    @JsonProperty
    private NetworkAddress[] localaddresses;

    // any network warnings (such as alert messages)
    @JsonProperty
    private String warnings;

    public NetworkInfo(@JsonProperty("version") Integer version,
                       @JsonProperty("subversion") String subversion,
                       @JsonProperty("protocolversion") Integer protocolversion,
                       @JsonProperty("localservices") Integer localservices,
                       @JsonProperty("timeoffset") Integer timeoffset,
                       @JsonProperty("connections") Integer connections,
                       @JsonProperty("tls_cert_verified") Boolean tlsCertVerified,
                       @JsonProperty("networks") Network[] networks,
                       @JsonProperty("relayfee") Double relayfee,
                       @JsonProperty("localaddresses") NetworkAddress[] localaddresses,
                       @JsonProperty("warnings") String warnings) {
        this.version = version;
        this.subversion = subversion;
        this.protocolversion = protocolversion;
        this.localservices = localservices;
        this.timeoffset = timeoffset;
        this.connections = connections;
        this.tlsCertVerified = tlsCertVerified;
        this.networks = networks;
        this.relayfee = relayfee;
        this.localaddresses = localaddresses;
        this.warnings = warnings;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getSubversion() {
        return subversion;
    }

    public void setSubversion(String subversion) {
        this.subversion = subversion;
    }

    public Integer getProtocolversion() {
        return protocolversion;
    }

    public void setProtocolversion(Integer protocolversion) {
        this.protocolversion = protocolversion;
    }

    public Integer getLocalservices() {
        return localservices;
    }

    public void setLocalservices(Integer localservices) {
        this.localservices = localservices;
    }

    public Integer getTimeoffset() {
        return timeoffset;
    }

    public void setTimeoffset(Integer timeoffset) {
        this.timeoffset = timeoffset;
    }

    public Integer getConnections() {
        return connections;
    }

    public void setConnections(Integer connections) {
        this.connections = connections;
    }

    public Boolean getTlsCertVerified() {
        return tlsCertVerified;
    }

    public void setTlsCertVerified(Boolean tlsCertVerified) {
        this.tlsCertVerified = tlsCertVerified;
    }

    public Network[] getNetworks() {
        return networks;
    }

    public void setNetworks(Network[] networks) {
        this.networks = networks;
    }

    public Double getRelayfee() {
        return relayfee;
    }

    public void setRelayfee(Double relayfee) {
        this.relayfee = relayfee;
    }

    public NetworkAddress[] getLocaladdresses() {
        return localaddresses;
    }

    public void setLocaladdresses(NetworkAddress[] localaddresses) {
        this.localaddresses = localaddresses;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    @Override
    public String toString() {
        return "NetworkInfo{" +
                "version=" + version +
                ", subversion='" + subversion + '\'' +
                ", protocolversion=" + protocolversion +
                ", localservices=" + localservices +
                ", timeoffset=" + timeoffset +
                ", connections=" + connections +
                ", tlsCertVerified=" + tlsCertVerified +
                ", networks=" + Arrays.toString(networks) +
                ", relayfee=" + relayfee +
                ", localaddresses=" + Arrays.toString(localaddresses) +
                ", warnings='" + warnings + '\'' +
                '}';
    }
}
