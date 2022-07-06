package com.example.demo_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringApplication {

    public static void main(String[] args) {

        System.out.print("hello world");
        SpringApplication.run(DemoSpringApplication.class, args);
    }

}
