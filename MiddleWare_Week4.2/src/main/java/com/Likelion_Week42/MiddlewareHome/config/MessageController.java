package com.Likelion_Week42.MiddlewareHome.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @GetMapping("/{message}")
    public void publish(@PathVariable("message") String message)
    {
        kafkaTemplate.send("likelion", message);
    }
}
