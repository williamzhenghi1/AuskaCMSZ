package com.asuka.controller;

import com.asuka.Pojo.HeadPic;
import com.asuka.serivce.Impl.HeadPicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class picController {

    @Autowired
    HeadPicServiceImpl headPicService;

    @GetMapping("/test")
    public String a()
    {
        return "a";
    }


    @RequestMapping(value="/ftest",method= RequestMethod.POST)
    HeadPic aad()
    {
        return new HeadPic();
    }

}
