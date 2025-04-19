package com.springboot.starter.firstWork;

import org.springframework.web.bind.annotation.*;

@RestController
public class firstAPI {

    @GetMapping("/hello/{name}")
    public Responses nameParam(@PathVariable String name){
        return new Responses ("Hello, " + name);
    }


    @GetMapping("/hello")
    public Responses hello(){
        return new Responses("Hello world!");
    }

    @PostMapping("/hello")
    public Responses helloPost(@RequestBody String name){
        return new Responses("Hello " + name + "!");
    }
}
