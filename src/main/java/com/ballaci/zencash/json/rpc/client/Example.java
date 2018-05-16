package com.ballaci.zencash.json.rpc.client;

public class Example {

    public static void main(String[] args) {
        ZencashJsonRpcService client = new ZencashJsonRpcServiceImpl();

        int info = client.getConnectionCount();


        System.out.println(info);

    }
}
