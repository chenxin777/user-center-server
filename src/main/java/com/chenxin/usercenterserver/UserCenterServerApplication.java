package com.chenxin.usercenterserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.chenxin.usercenterserver.mapper")
@EnableScheduling
public class UserCenterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterServerApplication.class, args);
    }

}
