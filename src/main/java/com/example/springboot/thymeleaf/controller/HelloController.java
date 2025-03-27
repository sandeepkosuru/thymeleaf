package com.example.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
public String hello(){
    return "hello";
}
}
