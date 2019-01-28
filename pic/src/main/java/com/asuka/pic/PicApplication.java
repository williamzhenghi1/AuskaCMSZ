package com.asuka.pic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.asuka.*"})
@EnableJpaRepositories("com.asuka.Repositry")
@EntityScan("com.asuka.pojo")
public class PicApplication {

    public static void main(String[] args) {
        SpringApplication.run(PicApplication.class, args);
    }

}

