package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Arrays;

/**
 *     "getnetworkinfo\n"
 *  *             "Returns an object containing various state info regarding P2P networking.\n"
 *  *             "\nResult:\n"
 *  *             "{\n"
 *  *             "  \"version\": xxxxx,                      (numeric) the server version\n"
 *  *             "  \"subversion\": \"/MagicBean:x.y.z[-v]/\",     (string) the server subversion string\n"
 *  *             "  \"protocolversion\": xxxxx,              (numeric) the protocol version\n"
 *  *             "  \"localservices\": \"xxxxxxxxxxxxxxxx\", (string) the services we offer to the network\n"
 *  *             "  \"timeoffset\": xxxxx,                   (numeric) the time offset\n"
 *  *             "  \"connections\": xxxxx,                  (numeric) the number of connections\n"
 *  *             "  \"tls_cert_verified\": true|flase,       (boolean) true if the certificate of the current node is verified\n"
 *  *             "  \"networks\": [                          (array) information per network\n"
 *  *             "  {\n"
 *  *             "    \"name\": \"xxx\",                     (string) network (ipv4, ipv6 or onion)\n"
 *  *             "    \"limited\": true|false,               (boolean) is the network limited using -onlynet?\n"
 *  *             "    \"reachable\": true|false,             (boolean) is the network reachable?\n"
 *  *             "    \"proxy\": \"host:port\"               (string) the proxy that is used for this network, or empty if none\n"
 *  *             "  }\n"
 *  *             "  ,...\n"
 *  *             "  ],\n"
 *  *             "  \"relayfee\": x.xxxxxxxx,                (numeric) minimum relay fee for non-free transactions in btc/kb\n"
 *  *             "  \"localaddresses\": [                    (array) list of local addresses\n"
 *  *             "  {\n"
 *  *             "    \"address\": \"xxxx\",                 (string) network address\n"
 *  *             "    \"port\": xxx,                         (numeric) network port\n"
 *  *             "    \"score\": xxx                         (numeric) relative score\n"
 *  *             "  }\n"
 *  *             "  ,...\n"
 *  *             "  ]\n"
 *  *             "  \"warnings\": \"...\"                    (string) any network warnings (such as alert messages) \n"
 *  *             "}\n"
 *  *             "\nExamples:\n"
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
    private Boolean tls_cert_verified;

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
                       @JsonProperty("tls_cert_verified") Boolean tls_cert_verified,
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
        this.tls_cert_verified = tls_cert_verified;
        this.networks = networks;
        this.relayfee = relayfee;
        this.localaddresses = localaddresses;
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
                ", tls_cert_verified=" + tls_cert_verified +
                ", networks=" + Arrays.toString(networks) +
                ", relayfee=" + relayfee +
                ", localaddresses=" + Arrays.toString(localaddresses) +
                ", warnings='" + warnings + '\'' +
                '}';
    }
}
