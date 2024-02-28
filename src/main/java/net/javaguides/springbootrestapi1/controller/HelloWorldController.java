package net.javaguides.springbootrestapi1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/Hello")
    public String helloWorld(){
        return "Hello World";
    }

}
