package com.zzproo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class OsmV1BackgroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(OsmV1BackgroundApplication.class, args);
    }

}
