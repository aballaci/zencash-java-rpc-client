package com.ballaci.zencash.json.rpc.client;

import com.ballaci.zencash.json.rpc.client.domain.*;
import com.ballaci.zencash.json.rpc.client.util.Config;
import com.github.arteam.simplejsonrpc.client.Transport;
import com.github.arteam.simplejsonrpc.client.generator.AtomicLongIdGenerator;
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
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Base64;
import java.util.Optional;

public class ZencashJsonRpcServiceImpl implements ZencashJsonRpcService {

    private static final Logger logger = Logger.getLogger(ZencashJsonRpcServiceImpl.class);

    public static final int RPC_GENERIC_ERROR = -33000;

    public static final String PROP_RPC_USER = "rpcuser";
    public static final String PROP_RPC_PASSWORD = "rpcpassword";
    public static final String PROP_RPC_CONNECT_TIMEOUT = "connectTimeout";
    public static final String PROP_RPC_CONNECTION_REQUEST_TIMEOUT = "connectionRequestTimeout";
    public static final String PROP_RPC_SOCKET_TIMEOUT = "socketTimeout";
    public static final String PROP_SERVER_URL = "serverurl";

    private JsonRpcClient client;

    private AtomicLongIdGenerator idGenerator;

    public ZencashJsonRpcServiceImpl() {
        init();
    }


    @Override
    public Info getInfo() {
        return client.createRequest()
                .method("getinfo")
                .id(idGenerator.generate())
                .returnAs(Info.class)
                .execute();
    }

    @Override
    public NetworkInfo getNetworkInfo() {
        return client.createRequest()
                .method("getnetworkinfo")
                .id(idGenerator.generate())
                .returnAs(NetworkInfo.class)
                .execute();
    }

    @Override
    public NetTotals getNetTotals()  {
        return client.createRequest()
                .method("getnettotals")
                .id(idGenerator.generate())
                .returnAs(NetTotals.class)
                .execute();
    }

    @Override
    public NodeInfo[] getAddedNodeInfo(Boolean dns, Optional<String> node)  {
        return client.createRequest()
                .method("getaddednodeinfo")
                .params(false)
                .id(idGenerator.generate())
                .returnAsArray(NodeInfo.class)
                .execute();
    }

    @Override
    public PeerInfo[] getPeerInfo(){
            return client.createRequest()
                    .method("getpeerinfo")
                    .id(idGenerator.generate())
                    .returnAsArray(PeerInfo.class)
                    .execute();
    }

    @Override
    public int getConnectionCount() {
        return client.createRequest()
                .method("getconnectioncount")
                .id(idGenerator.generate())
                .returnAs(Integer.class)
                .execute();
    }

    @Override
    public String stop() {
        return client.createRequest()
                .method("stop")
                .returnAs(String.class)
                .execute();
    }

    @Override
    public BlockchainInfo getBlockchainInfo() {
        return client.createRequest()
                .method("getblockchaininfo")
                .returnAs(BlockchainInfo.class)
                .execute();
    }

    @Override
    public String getBestBlockhash() {
        return client.createRequest()
                .method("getbestblockhash")
                .returnAs(String.class)
                .execute();
    }

    @Override
    public int getBlockcount() {
        return client.createRequest()
                .method("getblockcount")
                .returnAs(Integer.class)
                .execute();

    }

    @Override
    public String getBlockhash(int index) {
        return client.createRequest()
                .method("getblockhash")
                .params(index)
                .returnAs(String.class)
                .execute();

    }

    @Override
    public String getBlockHeader(String hash) {
        return client.createRequest()
                .method("getblockheader")
                .params(hash)
                .returnAs(String.class)
                .execute();
    }

    @Override
    public BlockHeader getBlockHeaderVerbose(String hash) {
        return client.createRequest()
                .method("getblockheader")
                .params(hash, true)
                .returnAs(BlockHeader.class)
                .execute();
    }

    @Override
    public Chaintip[] getChaintips() {
        return client.createRequest()
                .method("getchaintips")
                .returnAsArray(Chaintip.class)
                .execute();
    }

    @Override
    public double getDifficulty() {
        return client.createRequest()
                .method("getdifficulty")
                .returnAs(Double.class)
                .execute();
    }

    private void init() {

        Config config = Config.getInstance();
        final String rpcuser = config.getProperty(PROP_RPC_USER);
        final String rpcpassword = config.getProperty(PROP_RPC_PASSWORD);
        final Integer connectTimeout = config.getIntProperty(PROP_RPC_CONNECT_TIMEOUT);
        final Integer connectionRequestTimeout = config.getIntProperty(PROP_RPC_CONNECTION_REQUEST_TIMEOUT);
        final Integer socketTimeout = config.getIntProperty(PROP_RPC_SOCKET_TIMEOUT);

        final String auth = Base64.getEncoder()
                .encodeToString(new StringBuilder(rpcuser)
                        .append(":")
                        .append(rpcpassword)
                        .toString().getBytes());

        idGenerator = new AtomicLongIdGenerator();

        this.client = new JsonRpcClient(new Transport() {

        private final RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(connectTimeout)
                .setConnectionRequestTimeout(connectionRequestTimeout)
                .setSocketTimeout(socketTimeout)
                .build();

        CloseableHttpClient httpClient = HttpClients.createDefault();

        @NotNull
        @Override
        public String pass(@NotNull String request) throws IOException {

            HttpPost post = new HttpPost(config.getProperty(PROP_SERVER_URL));
            post.setHeader("Authorization", "Basic " + auth);
            post.setConfig(requestConfig);
            post.setEntity(new StringEntity(request, Charsets.UTF_8));
            post.setHeader(HttpHeaders.CONTENT_TYPE, MediaType.JSON_UTF_8.toString());
            try (CloseableHttpResponse httpResponse = httpClient.execute(post)) {
                return EntityUtils.toString(httpResponse.getEntity(), Charsets.UTF_8);
            }
        }
        });


    }
}

/**
 * resp: {"result":null,"error":{"code":-28,"message":"Activating best chain..."},"id":"curltest"}
 * {"result":null,"error":{"code":-28,"message":"Rescanning..."},"id":"curltest"}
 */
