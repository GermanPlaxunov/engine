package org.project.enginecore.config;

import org.project.enginecore.kafka.CoreConsumer;
import org.project.enginecore.kafka.CoreProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class CoreConfig {

    @Bean
    public CoreConsumer consumer(){
        return new CoreConsumer();
    }

    @Bean
    public CoreProducer producer(KafkaTemplate<String, String> template){
        return new CoreProducer("core-gate", template);
    }

}
