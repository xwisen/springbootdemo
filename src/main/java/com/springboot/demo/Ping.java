package com.springboot.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Ping {
    @RequestMapping("/ping")
    String ping() {
        return "It's ok !";
    }
}
