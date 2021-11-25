package com.dotjoin.firstserivce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FirstSerivceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSerivceApplication.class, args);
    }

}
