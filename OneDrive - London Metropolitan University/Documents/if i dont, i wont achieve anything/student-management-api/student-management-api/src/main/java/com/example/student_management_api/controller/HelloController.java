package com.example.student_management_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot";
    }

    @GetMapping("/about")
    public String about(){
        return "Learning Spring Boot Day 1";
    }

    @GetMapping("/name")
    public String name(){
        return "Your Name";
    }
}
