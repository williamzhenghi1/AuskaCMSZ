package com.asuka;

@RpcService(value = CallService.class,version = "CallService1")
public class CallServiceImpl implements CallService {
    @Override
    public String helloCall(int a, int b) {
        System.out.println("function fund!!!!");
        return "this is a msg from PIC-SERVER";
    }
}
