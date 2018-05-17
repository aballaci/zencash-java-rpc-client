package com.ballaci.zencash.json.rpc.client;

import com.ballaci.zencash.json.rpc.client.domain.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class Example {

    public static void main(String[] args) {
        ZencashJsonRpcService client = new ZencashJsonRpcServiceImpl();

        Map<String,TxDetail> info = client.getRawMempoolVerbose();


        for(String key: info.keySet()) {
            System.out.println(key + ": " +  info.get(key).toString());
        }

    }
}
