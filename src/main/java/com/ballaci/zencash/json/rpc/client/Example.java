package com.ballaci.zencash.json.rpc.client;

import com.ballaci.zencash.json.rpc.client.domain.BlockHeader;
import com.ballaci.zencash.json.rpc.client.domain.BlockchainInfo;
import com.ballaci.zencash.json.rpc.client.domain.NetworkInfo;

public class Example {

    public static void main(String[] args) {
        ZencashJsonRpcService client = new ZencashJsonRpcServiceImpl();

        BlockHeader info = client.getBlockHeaderVerbose("000000311c66325218753433b49ec25150dc220af017fe1198e33f5ad4f71a51");


        System.out.println(info);

    }
}
