package com.ballaci.zencash.json.rpc.client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 17.05.2018
 *
 * @author Armand Ballaci
 **/
public class UTXOsetInfo {


    /**
     *  "height": 309970,
     *   "bestblock": "00000000057884c488677751eeaedf2b363e0774f171189e5dc5f2e0e8ccd422",
     *   "transactions": 382765,
     *   "txouts": 2632600,
     *   "bytes_serialized": 177155528,
     *   "hash_serialized": "05443c49b8bd26c3f379ca6e68ce353ef3b12d4b64ceacd59e79be6a27e51e9f",
     *   "total_amount": 3732325.18933754
     */
    // The current block height (index)
    @JsonProperty
    private long height;

    // the best block hash hex
    @JsonProperty
    private String bestblock;

    // The number of transactions
    @JsonProperty
    private long transactions;

    // The number of output transactions
    @JsonProperty
    private long txouts;

    // The serialized size
    @JsonProperty
    private long bytesSerialized;

    // The serialized hash
    @JsonProperty
    private String hashSerialized;

    // The total amount
    @JsonProperty
    private double totalAmount;

    public UTXOsetInfo(@JsonProperty("height") long height,
                       @JsonProperty("bestblock") String bestblock,
                       @JsonProperty("transactions") long transactions,
                       @JsonProperty("txouts") long txouts,
                       @JsonProperty("bytes_serialized") long bytesSerialized,
                       @JsonProperty("hash_serialized") String hashSerialized,
                       @JsonProperty("total_amount") int totalAmount) {
        this.height = height;
        this.bestblock = bestblock;
        this.transactions = transactions;
        this.txouts = txouts;
        this.bytesSerialized = bytesSerialized;
        this.hashSerialized = hashSerialized;
        this.totalAmount = totalAmount;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public String getBestblock() {
        return bestblock;
    }

    public void setBestblock(String bestblock) {
        this.bestblock = bestblock;
    }

    public long getTransactions() {
        return transactions;
    }

    public void setTransactions(long transactions) {
        this.transactions = transactions;
    }

    public long getTxouts() {
        return txouts;
    }

    public void setTxouts(long txouts) {
        this.txouts = txouts;
    }

    public long getBytesSerialized() {
        return bytesSerialized;
    }

    public void setBytesSerialized(long bytesSerialized) {
        this.bytesSerialized = bytesSerialized;
    }

    public String getHashSerialized() {
        return hashSerialized;
    }

    public void setHashSerialized(String hashSerialized) {
        this.hashSerialized = hashSerialized;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "UTXOsetInfo{" +
                "height=" + height +
                ", bestblock='" + bestblock + '\'' +
                ", transactions=" + transactions +
                ", txouts=" + txouts +
                ", bytesSerialized=" + bytesSerialized +
                ", hashSerialized='" + hashSerialized + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
