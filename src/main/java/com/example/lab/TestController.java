package com.example.lab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class TestController {

    @GetMapping
    public String sayHello(){
        return "Hello , this is my first spring boot app";
    }
}