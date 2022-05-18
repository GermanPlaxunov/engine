package org.project.enginecore.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;

@Slf4j
@RequiredArgsConstructor
public class CoreProducer {

    private final String topic;
    private final KafkaTemplate<String, String> template;

    public void send(String message){
        template.send(topic, message);
        log.info("Core send: \"{}\", to topic: \"{}\"", message, topic);
    }

}
