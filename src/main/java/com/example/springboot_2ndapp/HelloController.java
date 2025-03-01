package com.example.springboot_2ndapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // SLF4J Logger create karo
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        // Log messages
        logger.info("Hello API called with name: {}", name);
        logger.debug("This is a debug message");
        logger.error("This is an error message (just for demonstration)");

        return "Hello, " + name + " from BridgeLabz! 🚀";
    }
}