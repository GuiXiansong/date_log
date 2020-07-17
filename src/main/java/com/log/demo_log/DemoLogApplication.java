package com.log.demo_log;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.log.demo_log.mapper")
@SpringBootApplication
public class DemoLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoLogApplication.class, args);
    }

}
