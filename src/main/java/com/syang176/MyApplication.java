package com.syang176;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Syang176
 * @date 2024/12/2 21:32
 **/

@SpringBootApplication
@MapperScan(basePackages = "com.syang176.dao.*")
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
