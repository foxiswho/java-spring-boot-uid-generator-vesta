package com.foxwho.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoApplication.class).run(args);
    }
}
