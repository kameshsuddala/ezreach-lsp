package com.ezyreach.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ezyreach.*"})
public class BootstrapApp {


    public static void main(String[] args) {
        SpringApplication.run(BootstrapApp.class, args);
    }

}
