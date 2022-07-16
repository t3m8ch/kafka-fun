package io.github.t3m8ch.kafkafun

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaFunApplication


fun main(args: Array<String>) {
    runApplication<KafkaFunApplication>(*args)
}
