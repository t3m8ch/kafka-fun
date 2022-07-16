package io.github.t3m8ch.kafkafun.config

import org.springframework.context.annotation.Configuration
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.messaging.simp.SimpMessagingTemplate

data class Message(
    val text: String,
)

@Configuration
class KafkaConfig(private val template: SimpMessagingTemplate) {
    @KafkaListener(id = "groupId", topics = ["example-topic"])
    fun listen(value: String?) {
        template.convertAndSend("/topic/example-topic", Message(value ?: "null"))
    }
}
