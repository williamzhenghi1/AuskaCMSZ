package com.asuka.Pojo;

import lombok.Data;

@Data
public class RpcResponse {
    private String requestId;
    private Exception exception;
    private Object result;
}
