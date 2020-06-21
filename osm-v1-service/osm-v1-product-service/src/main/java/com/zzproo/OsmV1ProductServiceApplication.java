package com.zzproo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.zzproo.mapper")
public class OsmV1ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OsmV1ProductServiceApplication.class, args);
    }

}
