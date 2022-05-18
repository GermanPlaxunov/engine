package org.project.enginecore.mvc.controller;

import lombok.RequiredArgsConstructor;
import org.project.enginecore.kafka.CoreProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/core")
public class CoreController {

    private final CoreProducer producer;

    @PostMapping(path = "/send")
    public void send(@RequestParam(name = "message") String message){
        producer.send(message);
    }

}
