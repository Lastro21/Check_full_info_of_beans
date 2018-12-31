package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
final public class DevController {

    @Value("${spring.message}")
    private String message;

    @RequestMapping("/dev")
    public String hello(){
        return message;
    }

}
