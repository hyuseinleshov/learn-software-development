package com.testcontainers.demo;

import org.springframework.boot.SpringApplication;

public class TestTestcontainersSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.from(TestcontainersSpringBootApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
