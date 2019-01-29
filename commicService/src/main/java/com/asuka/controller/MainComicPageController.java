package com.asuka.controller;

import com.asuka.Pojo.Comic;
import com.asuka.serivce.CommicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class MainComicPageController {


    @Autowired
    CommicService commicService;

    @RequestMapping(value = "/cPage/{id}",method = RequestMethod.GET)
    String commicGetMainPage(@PathVariable Integer id, HttpSession httpSession, Model modelAndView)
    {
        //todo 本地获得漫画信息

        Comic comic =commicService.getOneById(id);
        System.out.println(comic.getHeadPicUrl());
        modelAndView.addAttribute("commicInfo",comic);

        //todo 请求广告服务的Banner

        return "comic";
    }
}
