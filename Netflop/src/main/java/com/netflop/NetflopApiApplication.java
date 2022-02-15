package com.netflop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.netflop.*")
@SpringBootApplication
public class NetflopApiApplication {

    public static void main(String[] args) {
        System.out.println("Starting");
        SpringApplication.run(NetflopApiApplication.class, args);
        System.out.println("Started");
    }

}
