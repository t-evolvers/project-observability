package com.mpuertao.demootel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoOtelApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoOtelApplication.class, args);
    }

//    private static final Logger log = LoggerFactory.getLogger(SisteController.class);
//    @GetMapping(value = "/hello")
//    public String sayHello() {
//        log.info("The application is saying Hello");
//        return "Hello";
//    }

}
