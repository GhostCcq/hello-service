package com.ghost.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello Ghost";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

}
