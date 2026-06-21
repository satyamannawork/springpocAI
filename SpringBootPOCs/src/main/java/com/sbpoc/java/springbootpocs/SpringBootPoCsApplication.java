package com.sbpoc.java.springbootpocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPoCsApplication {

    public static void main(String[] args) {
        System.out.println("This is Spring boot App");
        SpringApplication.run(SpringBootPoCsApplication.class, args);
    }

}
