package com.asuka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class picController {

    @GetMapping("tesst")
    public String a()
    {
        return "a";
    }
}