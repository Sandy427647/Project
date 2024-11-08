package com.vlog.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @GetMapping("/")
    public String HomePage(){
        return "home";
    }

    @GetMapping("/signin")
    public String getMethodName() {
        return "signin";
    }
    
}
