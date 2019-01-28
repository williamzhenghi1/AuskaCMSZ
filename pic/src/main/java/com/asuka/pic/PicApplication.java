package com.asuka.pic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PicApplication {

    public static void main(String[] args) {
        SpringApplication.run(PicApplication.class, args);
    }

}

