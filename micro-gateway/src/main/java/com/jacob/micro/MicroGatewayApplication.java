package com.jacob.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroGatewayApplication.class, args);
    }

}
