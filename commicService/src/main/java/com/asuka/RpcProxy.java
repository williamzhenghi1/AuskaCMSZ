package com.asuka;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.UUID;

@SuppressWarnings("unchecked")
@Service
@Slf4j
public class RpcProxy {

    @Autowired
    private DiscoveryClient discoveryClient;



    String serviceVersion;



    public <T> T create(final Class<?> interfaceClass) {
        return create(interfaceClass, "");
    }

    public  <T> T create(final Class<?> interfaceClass, String version) {
        return (T) Proxy.newProxyInstance(
                interfaceClass.getClassLoader(),
                new Class[]{interfaceClass},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //todo 创建RPC请求，json化，扔进队列，hashmap记录 等待回复管道回复，回复getResponse对象

                        RpcRequest rpcRequest =new RpcRequest();
                        rpcRequest.setRequestId(UUID.randomUUID().toString());
                        rpcRequest.setInterfaceName(method.getDeclaringClass().getName());
                        rpcRequest.setServiceVersion(version);
                        rpcRequest.setParameterTypes(method.getParameterTypes());
                        rpcRequest.setParameters(args);
                        rpcRequest.setMethodName(method.getName());
                        String a =JSON.toJSONString(rpcRequest);

                        List<ServiceInstance> instances = discoveryClient.getInstances("PIC-SERVER");
                        for(ServiceInstance serviceInstance :instances)
                        {
                          log.info(serviceInstance.getHost());
                          System.out.println(serviceInstance.getHost());
                          System.out.println(serviceInstance.getPort());
                          System.out.println( serviceInstance.getUri());
                        }
                        RpcClient rpcClient = new RpcClient("localhost",8666);

                        RpcResponse rpcResponse = rpcClient.send(rpcRequest);
                        log.info("send!");

                        return rpcResponse.getResult();
                    }
                }
        );
    }


}
