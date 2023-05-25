package com.example.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/main")
@RestController
public class TestController {

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }
}
