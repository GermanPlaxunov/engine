package org.project.enginegate.config;

import org.project.enginegate.kafka.GateConsumer;
import org.project.enginegate.kafka.GateProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class GateConfig {

    @Bean
    public GateConsumer consumer(){
        return new GateConsumer();
    }

    @Bean
    public GateProducer producer(KafkaTemplate<String, String> template){
        return new GateProducer("gate-core", template);
    }

}
