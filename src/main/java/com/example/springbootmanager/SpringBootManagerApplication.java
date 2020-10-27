package com.example.springbootmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbootmanager.mapper")
public class SpringBootManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootManagerApplication.class, args);
    }

}
