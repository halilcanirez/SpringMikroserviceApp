package com.halil.secondhandapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
public class SecondHandAdvertisementApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecondHandAdvertisementApplication.class,args);
    }
}
