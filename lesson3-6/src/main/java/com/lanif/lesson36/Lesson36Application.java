package com.lanif.lesson36;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Lesson36Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson36Application.class, args);
    }
}
