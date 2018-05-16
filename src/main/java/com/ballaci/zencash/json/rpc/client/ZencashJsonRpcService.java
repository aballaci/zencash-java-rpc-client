package com.ballaci.zencash.json.rpc.client;

import com.ballaci.zencash.json.rpc.client.domain.*;
import com.ballaci.zencash.json.rpc.client.exceptions.ZenRpcException;
import com.github.arteam.simplejsonrpc.core.annotation.JsonRpcMethod;
import com.github.arteam.simplejsonrpc.core.annotation.JsonRpcParam;
import com.github.arteam.simplejsonrpc.core.annotation.JsonRpcService;

import java.util.Optional;

/**
 * The ZencashJsonRpc service Interface
 */
@JsonRpcService
public interface ZencashJsonRpcService {

    @JsonRpcMethod
    Info getInfo();

    @JsonRpcMethod
    NetworkInfo getNetworkInfo();

    /**
     *
     * @return Returns information about network traffic, including bytes in, bytes out
     *         and current time
     * @throws ZenRpcException
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
     * @return an array of {@link []NodeInfo} that can be empty
     * @throws ZenRpcException
     */
    @JsonRpcMethod
    NodeInfo[] getAddedNodeInfo (@JsonRpcParam("dns") Boolean dns, @JsonRpcParam("node") Optional<String> node);

    /**
     * Returns data about each connected network node as a json array of objects
     * @return {@link PeerInfo[]}
     * @throws ZenRpcException
     */
    @JsonRpcMethod
    PeerInfo[] getPeerInfo();

    /**
     * Returns the number of connections to other nodes.
     * @return int
     */
    @JsonRpcMethod
    int getConnectionCount();
}
