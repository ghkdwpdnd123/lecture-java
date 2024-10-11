package com.haji.demo.thymeleaf_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    // @ResponseBody
    // @GetMapping("/hello")
    // public String hello() {
    //     return "hello!";
    // }
    // @GetMapping("/hello2")
    // public String hello2() {
    //     return "index.html";
    // }
    @GetMapping("/ecommerce")
    public String ecommerce() {
        return "pages/ecommerce/overview.html";
    }

    @GetMapping("/addLemps")
    public String addViewLemp() {
        return "addViewLemp"; 
    }
}