package com.focusit.mathclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MathclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MathclientApplication.class, args);
    }

}
