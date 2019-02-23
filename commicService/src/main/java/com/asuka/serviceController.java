package com.asuka;


import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class serviceController {


    RestTemplate restTemplate =new RestTemplate();

    @Autowired
    RpcProxy rpcProxy;

    @GetMapping("/call")
    String call()
    {

        CallService callService =  rpcProxy.create(CallService.class,"1");
        String a =callService.helloCall(1,2);
        log.info(a);

        return a;
    }

    @GetMapping("/call2")
    String call2()
    {
        ResponseEntity<String> responseEntity =restTemplate.postForEntity("http://localhost:8666/test2","123",String.class);
        return responseEntity.getBody();
    }

}
