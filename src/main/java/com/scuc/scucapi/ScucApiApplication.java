package com.scuc.scucapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@PropertySource(value = { "classpath:secret.properties" })
@SpringBootApplication
@EnableJpaAuditing
public class ScucApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScucApiApplication.class, args);
    }

}
