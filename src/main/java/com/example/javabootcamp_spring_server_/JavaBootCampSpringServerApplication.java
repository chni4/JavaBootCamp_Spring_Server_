package com.example.javabootcamp_spring_server_;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaBootCampSpringServerApplication {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello world";
    }
    public static void main(String[] args) {
        SpringApplication.run(JavaBootCampSpringServerApplication.class, args);


    }
}
