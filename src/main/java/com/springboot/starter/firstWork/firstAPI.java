package com.springboot.starter.firstWork;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstAPI {
    @GetMapping("/hello")
    public String hello(){
        return "Hello world!";
    }

    @PostMapping("/hello")
    public String helloPost(@RequestBody String name){
        return "Hello " + name + "!";
    }
}
