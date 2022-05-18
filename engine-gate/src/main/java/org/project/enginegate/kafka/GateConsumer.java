package org.project.enginegate.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
public class GateConsumer {

    @KafkaListener(topics = "core-gate", groupId = "engine-group")
    public void consume(String message){
        log.info("Gate consumed: \"{}\" from topic \"{}\"", message, "core-gate");
    }

}
