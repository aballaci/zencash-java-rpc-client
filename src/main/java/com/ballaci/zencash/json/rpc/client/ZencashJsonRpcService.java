package com.ballaci.zencash.json.rpc.client;

import com.ballaci.zencash.json.rpc.client.domain.*;
import com.github.arteam.simplejsonrpc.core.annotation.JsonRpcMethod;
import com.github.arteam.simplejsonrpc.core.annotation.JsonRpcParam;
import com.github.arteam.simplejsonrpc.core.annotation.JsonRpcService;

import java.util.Map;
import java.util.Optional;

/**
 * The ZencashJsonRpc service Interface
 *
 * @author Armand Ballaci
 */
@JsonRpcService
public interface ZencashJsonRpcService {

    /**
     * Returns an object containing various state info
     * @return {@link Info}
     */
    @JsonRpcMethod
    Info getInfo();


    /**
     * Returns an object containing various state info regarding P2P networking
     * @return {@link NetworkInfo}
     */
    @JsonRpcMethod
    NetworkInfo getNetworkInfo();

    /**
     *
     * @return Returns information about network traffic, including bytes in, bytes out
     *         and current time
     */
    @JsonRpcMethod
    NetTotals getNetTotals();

    /**
     * Returns information about the given added node, or all added nodes
     * (note that onetry addnodes are not listed here)
     * If dns is false, only a list of added nodes will be provided,
     * otherwise connected information will also be available.
     * @param dns If false, only a list of added nodes will be provided, otherwise connected information will also be available.
     * @param node If provided, return information about this specific node, otherwise all nodes are returned. eg "192.168.0.201"
     * @return an array of { @link NodeInfo[] } that can be empty
     */
    @JsonRpcMethod
    NodeInfo[] getAddedNodeInfo (@JsonRpcParam("dns") Boolean dns, @JsonRpcParam("node") Optional<String> node);

    /**
     * Returns data about each connected network node as a json array of objects
     * @return {@link PeerInfo[]}
     */
    @JsonRpcMethod
    PeerInfo[] getPeerInfo();

    /**
     * Returns the number of connections to other nodes.
     * @return int
     */
    @JsonRpcMethod
    int getConnectionCount();

    /**
     * stops the Zen server
     * @return {@link String} "Zen server stopping"
     */
    @JsonRpcMethod
    String stop();

    /**
     * Returns an object containing various state info regarding block chain processing.
     * @return {@link BlockchainInfo}
     */
    @JsonRpcMethod
    BlockchainInfo getBlockchainInfo();

    /**
     * Returns the hash of the best (tip) block in the longest block chain.
     * @return  the block hash hex encoded
     */
    @JsonRpcMethod
    String getBestBlockhash();

    /**
     * Returns the number of blocks in the longest block chain.
     * @return  The current block count
     */
    @JsonRpcMethod
    int getBlockcount();

    /**
     * Returns hash of block in best-block-chain at index provided.
     * @return  The block hash
     */
    @JsonRpcMethod
    String getBlockhash(@JsonRpcParam("index") int index);

    /**
     * Returns a string that is serialized, hex-encoded data for blockheader 'hash'
     * @param hash
     * @return   hex-encoded data for block
     */
    @JsonRpcMethod
    String getBlockHeader(@JsonRpcParam("hash") String hash);

    /**
     * Returns a string that is serialized, hex-encoded data for blockheader 'hash'
     * @param hash
     * @return   hex-encoded data for block
     */
    @JsonRpcMethod
    BlockHeader getBlockHeaderVerbose(@JsonRpcParam("hash") String hash);

    /**
     * Return information about all known tips in the block tree,
     * including the main chain as well as orphaned branches.
     * @return   {@link Chaintip[]}
     */
    @JsonRpcMethod
    Chaintip[] getChaintips();

    /**
     * Returns the proof-of-work difficulty as a multiple of the minimum difficulty.
     * @return   n.nnn
     */
    @JsonRpcMethod
    double getDifficulty();

    /**
     * Returns details on the active state of the TX memory pool.
     * @return   an MempoolInfo object
     */
    @JsonRpcMethod
    MempoolInfo getMempoolInfo();

    /**
     * Returns all transaction ids in memory pool as a json array of string transaction ids.
     * @return   an MempoolInfo object
     */
    @JsonRpcMethod
    String[] getRawMempool();

    /**
     * Returns all transaction in memory pool as a Map<txId, TxDetail>.
     * @return   an MempoolInfo object
     */
    @JsonRpcMethod
    Map<String,TxDetail> getRawMempoolVerbose();

    /**
     * Returns details about an unspent transaction output.
     *
     *  @param txid  The transaction id\n"
     *  @param vout vout value
     *  @return   Optional<UTXODetail>
     */
    @JsonRpcMethod
    Optional<UTXODetail> getTxOut(@JsonRpcParam("txid") String txid, @JsonRpcParam("vout") int vout);
}
