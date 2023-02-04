package com.example.demokafkaxulambis;

import io.confluent.developer.User;
import lombok.extern.apachecommons.CommonsLog;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@CommonsLog(topic = "Consumer logger")
public class Consumer {


    @KafkaListener(topics = "${topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(ConsumerRecord<String, User> record) {
        log.info(format("Consumed message -> %s", record.value()));

        User user = record.value();

        log.info(format("Name: %s Idade: %d", user.getName(), user.getAge()));
    }
}
