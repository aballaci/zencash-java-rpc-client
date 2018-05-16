package com.ballaci.zencash.json.rpc.client.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * \"name\": \"xxx\",                     (string) network (ipv4, ipv6 or onion)\n"
 *  *             "    \"limited\": true|false,               (boolean) is the network limited using -onlynet?\n"
 *  *             "    \"reachable\": true|false,             (boolean) is the network reachable?\n"
 *  *             "    \"proxy\": \"host:port\"               (string) the proxy that is used for this network, or empty if none\n"
 */
public class Network implements Serializable {

    //network (ipv4, ipv6 or onion)
    @JsonProperty
    private String name;

    //is the network limited using -onlynet?
    @JsonProperty
    private Boolean limited;

    //is the network reachable?
    @JsonProperty
    private Boolean reachable;

    //the proxy that is used for this network, or empty if none
    @JsonProperty
    private String proxy;

    //the proxy that is used for this network, or empty if none
    @JsonProperty
    private boolean proxyRandomizeCredentials;

    public Network(@JsonProperty("name") String name,
                   @JsonProperty("limited") Boolean limited,
                   @JsonProperty("reachable") Boolean reachable,
                   @JsonProperty("proxy") String proxy,
                   @JsonProperty("proxy_randomize_credentials") boolean proxyRandomizeCredentials) {
        this.name = name;
        this.limited = limited;
        this.reachable = reachable;
        this.proxy = proxy;
        this.proxyRandomizeCredentials = proxyRandomizeCredentials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getLimited() {
        return limited;
    }

    public void setLimited(Boolean limited) {
        this.limited = limited;
    }

    public Boolean getReachable() {
        return reachable;
    }

    public void setReachable(Boolean reachable) {
        this.reachable = reachable;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public boolean isProxyRandomizeCredentials() {
        return proxyRandomizeCredentials;
    }

    public void setProxyRandomizeCredentials(boolean proxyRandomizeCredentials) {
        this.proxyRandomizeCredentials = proxyRandomizeCredentials;
    }

    @Override
    public String toString() {
        return "Network{" +
                "name='" + name + '\'' +
                ", limited=" + limited +
                ", reachable=" + reachable +
                ", proxy='" + proxy + '\'' +
                ", proxyRandomizeCredentials=" + proxyRandomizeCredentials +
                '}';
    }
}
