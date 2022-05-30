package org.project.enginecore.mvc.controller;

import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import org.project.enginecore.kafka.CoreProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/core")
public class CoreController {

    @Value("${spring.application.name}")
    private String appName;
    private final CoreProducer producer;
    private final EurekaClient eurekaClient;


    @PostMapping(path = "/send")
    public void send(@RequestParam(name = "message") String message){
        producer.send(message);
    }

}
