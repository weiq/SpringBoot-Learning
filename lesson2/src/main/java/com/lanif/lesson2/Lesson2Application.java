package com.lanif.lesson2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lanif.lesson2.dao")
public class Lesson2Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson2Application.class, args);
    }
}
