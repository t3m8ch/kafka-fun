package io.github.t3m8ch.kafkafun.controllers

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("kafka")
class KafkaController(private val kafkaTemplate: KafkaTemplate<String, String>) {
    @PostMapping("sendMessage")
    fun sendMessage(@RequestParam text: String, @RequestParam topic: String): String {
        kafkaTemplate.send(topic, text)
        return "Message send"
    }
}
