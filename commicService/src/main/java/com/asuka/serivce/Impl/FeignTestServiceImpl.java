package com.asuka.serivce.Impl;

import com.asuka.Pojo.CommicPic;
import com.asuka.Pojo.HeadPic;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@FeignClient(name = "PIC-SERVER")
public interface FeignTestServiceImpl {

    @RequestMapping(value = "ftest", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    HeadPic feignTest(Integer integer);

    @RequestMapping(value = "getDetailList",method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
    List<CommicPic> getCommicPic(@RequestParam String cid,@RequestParam String pid);
}
