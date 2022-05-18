package org.project.enginecore.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;

@Slf4j
public class CoreConsumer {

    @KafkaListener(topics = "gate-core", groupId = "engine-group")
    public void consume(String message){
        log.info("Core consumed: \"{}\", from topic: \"{}\"", message, "gate-core");
    }

}
