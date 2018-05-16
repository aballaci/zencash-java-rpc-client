package com.ballaci.zencash.json.rpc.client.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

/**
 * [\n"
 *             "  {\n"
 *             "    \"id\": n,                   (numeric) Peer index\n"
 *             "    \"addr\":\"host:port\",      (string) The ip address and port of the peer\n"
 *             "    \"addrlocal\":\"ip:port\",   (string) local address\n"
 *             "    \"services\":\"xxxxxxxxxxxxxxxx\",   (string) The services offered\n"
 *             "    \"tls_established\": true:false,     (boolean) Status of TLS connection\n"
 *             "    \"tls_verified\": true:false,        (boolean) Status of peer certificate. Will be true if a peer certificate can be verified with some trusted root certs \n"
 *             "    \"lastsend\": ttt,           (numeric) The time in seconds since epoch (Jan 1 1970 GMT) of the last send\n"
 *             "    \"lastrecv\": ttt,           (numeric) The time in seconds since epoch (Jan 1 1970 GMT) of the last receive\n"
 *             "    \"bytessent\": n,            (numeric) The total bytes sent\n"
 *             "    \"bytesrecv\": n,            (numeric) The total bytes received\n"
 *             "    \"conntime\": ttt,           (numeric) The connection time in seconds since epoch (Jan 1 1970 GMT)\n"
 *             "    \"timeoffset\": ttt,         (numeric) The time offset in seconds\n"
 *             "    \"pingtime\": n,             (numeric) ping time\n"
 *             "    \"pingwait\": n,             (numeric) ping wait\n"
 *             "    \"version\": v,              (numeric) The peer version, such as 170002\n"
 *             "    \"subver\": \"/MagicBean:x.y.z[-v]/\",  (string) The string version\n"
 *             "    \"inbound\": true|false,     (boolean) Inbound (true) or Outbound (false)\n"
 *             "    \"startingheight\": n,       (numeric) The starting height (block) of the peer\n"
 *             "    \"banscore\": n,             (numeric) The ban score\n"
 *             "    \"synced_headers\": n,       (numeric) The last header we have in common with this peer\n"
 *             "    \"synced_blocks\": n,        (numeric) The last block we have in common with this peer\n"
 *             "    \"inflight\": [\n"
 *             "       n,                        (numeric) The heights of blocks we're currently asking from this peer\n"
 *             "       ...\n"
 *             "    ]
 */
public class PeerInfo {

    // Peer index
    @JsonProperty
    private int id;

    // he ip address and port of the peer (ip:port)
    @JsonProperty
    private String address;

    // local address
    @JsonProperty
    private String localAddress;

    // the services offered
    @JsonProperty
    private String services;

    // Status of TLS connection
    @JsonProperty
    private boolean tlsEstablished;

    // Status of peer certificate. Will be true if a peer certificate
    // can be verified with some trusted root certs
    @JsonProperty
    private boolean tlsVerified;

    // The time in seconds since epoch (Jan 1 1970 GMT) of the last send
    @JsonProperty
    private long lastsend;

    // The time in seconds since epoch (Jan 1 1970 GMT) of the last receive
    @JsonProperty
    private long lastrecv;

    // The total bytes sent
    @JsonProperty
    private long bytessent;

    // The total bytes receive
    @JsonProperty
    private long bytesrecv;

    // tThe connection time in seconds since epoch (Jan 1 1970 GMT)
    @JsonProperty
    private long conntime;

     // The time offset in seconds
    @JsonProperty
    private String timeoffset;

    // ping time
    @JsonProperty
    private double pingtime;

    // ping wait
    @JsonProperty
    private double pingwait;

    // The peer version, such as 170002
    @JsonProperty
    private int version;

    // The string version
    @JsonProperty
    private String subver;

    // Inbound (true) or Outbound (false)
    @JsonProperty
    private boolean inbound;

    // The starting height (block) of the peer
    @JsonProperty
    private int startingheight;

    // The ban score
    @JsonProperty
    private int banscore;

    // The last header we have in common with this peer
    @JsonProperty
    private int syncedHeaders;

    // The last block we have in common with this peer
    @JsonProperty
    private int syncedBlocks;

     // The heights of blocks we're currently asking from this peer
    @JsonProperty
    private int[] inflight;

    // The heights of blocks we're currently asking from this peer
    @JsonProperty
    private boolean whitelisted;

    public PeerInfo(@JsonProperty("id") int id,
                    @JsonProperty("addr") String address,
                    @JsonProperty("addrlocal") String localAddress,
                    @JsonProperty("services") String services,
                    @JsonProperty("tls_verified") boolean tlsVerified,
                    @JsonProperty("tls_established") boolean tlsEstablished,
                    @JsonProperty("lastsend") long lastsend,
                    @JsonProperty("lastrecv") long lastrecv,
                    @JsonProperty("bytessent") long bytessent,
                    @JsonProperty("bytesrecv") long bytesrecv,
                    @JsonProperty("conntime") long conntime,
                    @JsonProperty("timeoffset") String timeoffset,
                    @JsonProperty("pingtime") double pingtime,
                    @JsonProperty("pingwait") double pingwait,
                    @JsonProperty("version") int version,
                    @JsonProperty("subver") String subver,
                    @JsonProperty("inbound") boolean inbound,
                    @JsonProperty("startingheight") int startingheight,
                    @JsonProperty("banscore") int banscore,
                    @JsonProperty("synced_headers") int syncedHeaders,
                    @JsonProperty("synced_blocks") int syncedBlocks,
                    @JsonProperty("inflight") int[] inflight,
                    @JsonProperty("whitelisted") boolean whitelisted
    ) {
        this.id = id;
        this.address = address;
        this.localAddress = localAddress;
        this.services = services;
        this.tlsEstablished = tlsEstablished;
        this.tlsVerified = tlsVerified;
        this.lastsend = lastsend;
        this.lastrecv = lastrecv;
        this.bytessent = bytessent;
        this.bytesrecv = bytesrecv;
        this.conntime = conntime;
        this.timeoffset = timeoffset;
        this.pingtime = pingtime;
        this.pingwait = pingwait;
        this.version = version;
        this.subver = subver;
        this.inbound = inbound;
        this.startingheight = startingheight;
        this.banscore = banscore;
        this.syncedHeaders = syncedHeaders;
        this.syncedBlocks = syncedBlocks;
        this.inflight = inflight;
        this.whitelisted = whitelisted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public boolean isTlsEstablished() {
        return tlsEstablished;
    }

    public void setTlsEstablished(boolean tlsEstablished) {
        this.tlsEstablished = tlsEstablished;
    }

    public boolean isTlsVerified() {
        return tlsVerified;
    }

    public void setTlsVerified(boolean tlsVerified) {
        this.tlsVerified = tlsVerified;
    }

    public long getLastsend() {
        return lastsend;
    }

    public void setLastsend(long lastsend) {
        this.lastsend = lastsend;
    }

    public long getLastrecv() {
        return lastrecv;
    }

    public void setLastrecv(long lastrecv) {
        this.lastrecv = lastrecv;
    }

    public long getBytessent() {
        return bytessent;
    }

    public void setBytessent(long bytessent) {
        this.bytessent = bytessent;
    }

    public long getBytesrecv() {
        return bytesrecv;
    }

    public void setBytesrecv(long bytesrecv) {
        this.bytesrecv = bytesrecv;
    }

    public long getConntime() {
        return conntime;
    }

    public void setConntime(long conntime) {
        this.conntime = conntime;
    }

    public String getTimeoffset() {
        return timeoffset;
    }

    public void setTimeoffset(String timeoffset) {
        this.timeoffset = timeoffset;
    }

    public double getPingtime() {
        return pingtime;
    }

    public void setPingtime(double pingtime) {
        this.pingtime = pingtime;
    }

    public double getPingwait() {
        return pingwait;
    }

    public void setPingwait(double pingwait) {
        this.pingwait = pingwait;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getSubver() {
        return subver;
    }

    public void setSubver(String subver) {
        this.subver = subver;
    }

    public boolean isInbound() {
        return inbound;
    }

    public void setInbound(boolean inbound) {
        this.inbound = inbound;
    }

    public int getStartingheight() {
        return startingheight;
    }

    public void setStartingheight(int startingheight) {
        this.startingheight = startingheight;
    }

    public int getBanscore() {
        return banscore;
    }

    public void setBanscore(int banscore) {
        this.banscore = banscore;
    }

    public int getSyncedHeaders() {
        return syncedHeaders;
    }

    public void setSyncedHeaders(int syncedHeaders) {
        this.syncedHeaders = syncedHeaders;
    }

    public int getSyncedBlocks() {
        return syncedBlocks;
    }

    public void setSyncedBlocks(int syncedBlocks) {
        this.syncedBlocks = syncedBlocks;
    }

    public int[] getInflight() {
        return inflight;
    }

    public void setInflight(int[] inflight) {
        this.inflight = inflight;
    }

    public boolean isWhitelisted() {
        return whitelisted;
    }

    public void setWhitelisted(boolean whitelisted) {
        this.whitelisted = whitelisted;
    }

    @Override
    public String toString() {
        return "PeerInfo{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", localAddress='" + localAddress + '\'' +
                ", services='" + services + '\'' +
                ", tlsEstablished=" + tlsEstablished +
                ", tlsVerified=" + tlsVerified +
                ", lastsend=" + lastsend +
                ", lastrecv=" + lastrecv +
                ", bytessent=" + bytessent +
                ", bytesrecv=" + bytesrecv +
                ", conntime=" + conntime +
                ", timeoffset='" + timeoffset + '\'' +
                ", pingtime=" + pingtime +
                ", pingwait=" + pingwait +
                ", version=" + version +
                ", subver='" + subver + '\'' +
                ", inbound=" + inbound +
                ", startingheight=" + startingheight +
                ", banscore=" + banscore +
                ", syncedHeaders=" + syncedHeaders +
                ", syncedBlocks=" + syncedBlocks +
                ", inflight=" + Arrays.toString(inflight) +
                ", whitelisted=" + whitelisted +
                '}';
    }
}
