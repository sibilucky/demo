package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // This annotation marks the class as a Spring Boot application
public class Application {

    public static void main(String[] args) {
        // This runs the Spring Boot application
        SpringApplication.run(Application.class, args);
    }
}
