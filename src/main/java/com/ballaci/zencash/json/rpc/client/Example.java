package com.ballaci.zencash.json.rpc.client;

import com.ballaci.zencash.json.rpc.client.domain.UTXODetail;

import java.util.Optional;


public class Example {

    public static void main(String[] args) {
        ZencashJsonRpcService client = new ZencashJsonRpcServiceImpl();

        //UTXODetail detail = client.getTxOut("603631050d9a6c05756ed926c4204b3bb21ece045138549eb3185ce80898f3fa", 1);
        Optional<UTXODetail> detail = client.getTxOut("866c30367a7e3555d4251d289dff333c00209b730a86194862ed5ebe8b904377", 1);

        System.out.println(detail.isPresent());

    }
}
