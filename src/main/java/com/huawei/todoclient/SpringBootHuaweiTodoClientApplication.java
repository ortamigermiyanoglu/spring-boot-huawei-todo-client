package com.huawei.todoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class SpringBootHuaweiTodoClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHuaweiTodoClientApplication.class, args);
    }

}
