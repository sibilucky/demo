package com.example.controller;

import com.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String sayHello() {
        return helloService.getGreeting();
    }
}
