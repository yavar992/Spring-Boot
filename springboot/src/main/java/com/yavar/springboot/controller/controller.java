package com.yavar.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping(value = "/hello-world")
    public String helloworld() {
        return "welcome to my first api of spring boot!!";
    }
}

