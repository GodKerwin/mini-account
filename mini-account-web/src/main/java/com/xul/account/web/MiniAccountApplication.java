package com.xul.account.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MiniAccountApplication {

    private static final Logger log = LoggerFactory.getLogger(MiniAccountApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(MiniAccountApplication.class, args);
        String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
        for (String profile : activeProfiles) {
            log.info("Spring Boot 使用profile为:{}", profile);
        }
    }
}