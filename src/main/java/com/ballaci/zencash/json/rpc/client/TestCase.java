package com.ballaci.zencash.json.rpc.client;

import com.ballaci.zencash.json.rpc.client.domain.Info;
import com.ballaci.zencash.json.rpc.client.domain.NetTotals;
import com.ballaci.zencash.json.rpc.client.domain.NetworkInfo;
import com.ballaci.zencash.json.rpc.client.domain.NodeInfo;
import com.ballaci.zencash.json.rpc.client.util.Config;
import com.github.arteam.simplejsonrpc.client.JsonRpcClient;
import com.github.arteam.simplejsonrpc.client.Transport;
import com.google.common.net.MediaType;
import org.apache.commons.codec.Charsets;
import org.apache.http.HttpHeaders;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class TestCase {

    public static final String PROP_RPC_USER = "rpcuser";
    public static final String PROP_RPC_PASSWORD = "rpcpassword";
    public static final String PROP_RPC_CONNECT_TIMEOUT = "connectTimeout";
    public static final String PROP_RPC_CONNECTION_REQUEST_TIMEOUT = "connectionRequestTimeout";
    public static final String PROP_RPC_SOCKET_TIMEOUT = "socketTimeout";

    public static void main(String[] args) {

        Config config = Config.getInstance();
        final String rpcuser = config.getProperty(PROP_RPC_USER);
        final String rpcpassword = config.getProperty(PROP_RPC_PASSWORD);
        final Integer connectTimeout = config.getIntProperty(PROP_RPC_CONNECT_TIMEOUT);
        final Integer connectionRequestTimeout = config.getIntProperty(PROP_RPC_CONNECTION_REQUEST_TIMEOUT);
        final Integer socketTimeout = config.getIntProperty(PROP_RPC_SOCKET_TIMEOUT);

        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication (rpcuser, rpcpassword.toCharArray());
            }
        });



        JsonRpcClient client = new JsonRpcClient(new Transport() {




            private final RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectTimeout(connectTimeout)
                    .setConnectionRequestTimeout(connectionRequestTimeout)
                    .setSocketTimeout(socketTimeout)
                    .build();

            CloseableHttpClient httpClient = HttpClients.createDefault();

            @NotNull
            @Override
            public String pass(@NotNull String request) throws IOException {
                // Used Apache HttpClient 4.3.1 as an example
                HttpPost post = new HttpPost("http://127.0.0.1:8231");
                post.setHeader("Authorization", "Basic VXNlcjE5NzY3OTgxNzpQYXNzNzk3MDI3NjYwOTYxMDA3NDE1NjE3NzMyNDA4" /* + Base64.getEncoder().encodeToString("User197679817:Pass797027660961007415617732408".getBytes())*/);
                post.setConfig(requestConfig);
                post.setEntity(new StringEntity(request, Charsets.UTF_8));
                post.setHeader(HttpHeaders.CONTENT_TYPE, MediaType.JSON_UTF_8.toString());
                try (CloseableHttpResponse httpResponse = httpClient.execute(post)) {
                    return EntityUtils.toString(httpResponse.getEntity(), Charsets.UTF_8);
                }
            }
        });

        Info info = client.createRequest()
                .method("getinfo")
                .id("curltest")
                .returnAs(Info.class)
                .execute();
        System.out.println("Response: " + info.toString() );

        NetworkInfo networkInfo = client.createRequest()
                .method("getnetworkinfo")
                .id("curltest")
                .returnAs(NetworkInfo.class)
                .execute();
        System.out.println("Response: " + networkInfo.toString() );

        NetTotals netTotals = client.createRequest()
                .method("getnettotals")
                .id("curltest")
                .returnAs(NetTotals.class)
                .execute();
        System.out.println("Response: " + netTotals.toString() );

        NodeInfo nodeInfo = client.createRequest()
                .method("getaddednodeinfo")
                .params("false")
                .id("curltest")
                .returnAs(NodeInfo.class)
                .execute();
        System.out.println("Response: " + nodeInfo.toString() );
    }
}

/**
 * resp: {"result":null,"error":{"code":-28,"message":"Activating best chain..."},"id":"curltest"}
 * {"result":null,"error":{"code":-28,"message":"Rescanning..."},"id":"curltest"}
 */
