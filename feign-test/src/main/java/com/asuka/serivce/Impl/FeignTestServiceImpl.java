package com.asuka.serivce.Impl;

import com.asuka.Pojo.HeadPic;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "pic-server")
public interface FeignTestServiceImpl {

    @GetMapping("/feignTest")
    HeadPic feignTest(Integer integer);
}
