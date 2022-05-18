package org.project.enginegate.mvc.controller;

import lombok.RequiredArgsConstructor;
import org.project.enginegate.kafka.GateProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/gate")
public class GateController {

    private final GateProducer producer;

    @PostMapping(path = "/send")
    public void send(@RequestParam(name = "message") String message){
        producer.send(message);
    }

}
