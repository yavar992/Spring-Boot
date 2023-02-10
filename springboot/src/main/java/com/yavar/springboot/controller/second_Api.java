package com.yavar.springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class second_Api {

    @GetMapping(value = "/nextpage")
    String welcome() {
        return "you're doing very good keep learning until you get ur work done";
    }
}

