package com;


import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import com.ctrip.framework.apollo.*;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableApolloConfig
@MapperScan("com.member.dao")
public class Produce_Application {
    public static void main(String[] args) {
        SpringApplication.run(Produce_Application.class, args);
    }

}
