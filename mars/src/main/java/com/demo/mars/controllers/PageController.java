package com.demo.mars.controllers;

import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "AABBA";
    }

    @GetMapping("/test")
    @ResponseBody
    public String homeB() {
        return "Test Home B";
    }
}
