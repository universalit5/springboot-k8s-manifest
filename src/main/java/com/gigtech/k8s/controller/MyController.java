package com.gigtech.k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {
    @GetMapping("/greet")
    public String test(){
        return "I love it.. as long as I don't have to do hands on. This is a POC for springboot application deployment on  kubernetes !!!";
    }
}
