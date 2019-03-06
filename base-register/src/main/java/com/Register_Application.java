package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaServer
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Register_Application {

    public static void main(String[] args){
        SpringApplication.run(Register_Application.class,args);
    }
}
