package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Zeng Jie
 * @CreateTime 2021/7/21 16:05
 * @Version 1.0.0
 */
@SpringBootApplication
@MapperScan("com.demo.database.mapper")
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
