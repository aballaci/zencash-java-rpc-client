package com.ballaci.zencash.json.rpc.client.exceptions;

import org.jetbrains.annotations.NotNull;

public class ZenRpcException extends RuntimeException {

    /**
     * Actual error message
     */
    private int code;

    @NotNull
    private String message;

    public ZenRpcException(@NotNull int code, String message, Throwable throwable){
        super(message, throwable);
        this.code = code;
        this.message = message;
    }


    public ZenRpcException(@NotNull int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @Override
    @NotNull
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        String cause = "";
        if(super.getCause() != null){
            cause = super.getCause().getMessage();
        }
        return "ZenRpcException{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", cause='" + cause + '\'' +
                '}';
    }
}
