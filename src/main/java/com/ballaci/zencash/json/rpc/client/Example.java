package com.ballaci.zencash.json.rpc.client;

import com.ballaci.zencash.json.rpc.client.domain.*;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
        ZencashJsonRpcService client = new ZencashJsonRpcServiceImpl();

        MempoolInfo info = client.getMempoolInfo();


        System.out.println(info);

    }
}
