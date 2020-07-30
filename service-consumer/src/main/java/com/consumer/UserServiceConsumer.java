package com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceConsumer {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceConsumer.class, args);
    }
}
