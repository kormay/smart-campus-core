package com.intellif.smartcampus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.intellif.smartcampus.mapper")
public class SmartCampusCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartCampusCoreApplication.class, args);
    }

}
