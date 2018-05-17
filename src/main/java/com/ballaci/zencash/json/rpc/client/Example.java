package com.ballaci.zencash.json.rpc.client;

import com.ballaci.zencash.json.rpc.client.domain.BlockHeader;
import com.ballaci.zencash.json.rpc.client.domain.BlockchainInfo;
import com.ballaci.zencash.json.rpc.client.domain.Chaintip;
import com.ballaci.zencash.json.rpc.client.domain.NetworkInfo;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
        ZencashJsonRpcService client = new ZencashJsonRpcServiceImpl();

        double info = client.getDifficulty();


        System.out.println(info);

    }
}
