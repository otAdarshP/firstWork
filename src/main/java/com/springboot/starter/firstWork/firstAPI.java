package com.springboot.starter.firstWork;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstAPI {
    @GetMapping("/hello")
    public Responses hello(){
        return new Responses("Hello world!");
    }

    @PostMapping("/hello")
    public Responses helloPost(@RequestBody String name){
        return new Responses("Hello " + name + "!");
    }
}
