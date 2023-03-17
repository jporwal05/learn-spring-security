package com.baeldung.lss.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.baeldung.lss")
public class LssApp6 {

    public static void main(String[] args) {
        SpringApplication.run(LssApp6.class, args);
    }

}
