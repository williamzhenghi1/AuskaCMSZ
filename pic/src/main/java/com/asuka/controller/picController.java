package com.asuka.controller;

import com.asuka.Pojo.CommicPic;
import com.asuka.Pojo.HeadPic;
import com.asuka.Pojo.RpcRequest;
import com.asuka.RpcService;
import com.asuka.serivce.CommicPicService;
import com.asuka.serivce.Impl.HeadPicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class picController {

    @Autowired
    HeadPicServiceImpl headPicService;


    @Autowired
    CommicPicService commicPicService;

    @GetMapping("/")
    public String a()
    {
        return "a";
    }


    @RequestMapping(value="/ftest",method= RequestMethod.POST)
    HeadPic aad()
    {
        return headPicService.getOneHeadPic("1");
    }

    @RequestMapping(value = "/getDetailList",method = RequestMethod.POST)
    List<CommicPic> getDetailList(@RequestParam("cid")String cid,@RequestParam("pid")String pid)
    {
       return commicPicService.getCommicPics(cid,pid);
    }

    @GetMapping("/test2")
    public String gettest(String a)
    {
        System.out.println(a);
        return "aasdasdas";
    }


}
