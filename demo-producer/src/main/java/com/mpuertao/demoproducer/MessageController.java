package com.mpuertao.demoproducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    @GetMapping("/message")
    public String message() {
        logger.info("LOG SERVICE-B");
        return "HELLO SERVICE-B";
    }
}
