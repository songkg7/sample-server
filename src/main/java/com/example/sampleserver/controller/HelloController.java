package com.example.sampleserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        return "Hello, World!";
    }
}
