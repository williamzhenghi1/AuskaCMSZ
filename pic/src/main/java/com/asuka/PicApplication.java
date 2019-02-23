package com.asuka;

import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.imageio.spi.ServiceRegistry;

@SpringBootApplication
@EnableDiscoveryClient(autoRegister = false)
@EnableJpaRepositories("com.asuka.Repositry")
@EntityScan("com.asuka.pojo")
public class PicApplication {

@Autowired
RpcServer rpcServer;


    public static void main(String[] args) {
        SpringApplication.run(PicApplication.class, args);


    }

}

