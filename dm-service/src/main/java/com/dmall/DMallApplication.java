package com.dmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dmall.mapper")
@SpringBootApplication
public class DMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(DMallApplication.class, args);
    }
}