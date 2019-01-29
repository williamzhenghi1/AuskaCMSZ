package com.asuka.controller;

import com.asuka.serivce.CommicService;
import com.asuka.serivce.Impl.FeignTestServiceImpl;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class feignTestController {



    @Autowired
    FeignTestServiceImpl feignTestService;

    @Autowired
    CommicService commicService;

    @GetMapping("/m")
    String feignTest()
    {
        String a ="ad";
       return feignTestService.feignTest(1).toString();
    }

    @GetMapping("/getByCommicId")
    CommicService getByCommicId(@RequestParam Integer id)
    {
        commicService.getOneById(id);
        return commicService;
    }


    @GetMapping("/test")
    String sad()
    {
        return "ada";
    }
}
