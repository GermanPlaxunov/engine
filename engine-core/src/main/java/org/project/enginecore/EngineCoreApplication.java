package org.project.enginecore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@EnableEurekaClient
@SpringBootApplication
public class EngineCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(EngineCoreApplication.class, args);
    }

}
