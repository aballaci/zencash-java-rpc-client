package com.ballaci.zencash.json.rpc.client;

import com.ballaci.zencash.json.rpc.client.domain.BlockchainInfo;
import com.ballaci.zencash.json.rpc.client.domain.NetworkInfo;

public class Example {

    public static void main(String[] args) {
        ZencashJsonRpcService client = new ZencashJsonRpcServiceImpl();

        BlockchainInfo info = client.getBlockchainInfo();


        System.out.println(info);

    }
}
