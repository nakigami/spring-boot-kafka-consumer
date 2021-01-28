package com.dotnettp.springconsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@EnableKafka
public class KafkaConsumer {
    @KafkaListener(topics="tp_dot_net_spring", groupId="tp_dot_net_consumers")
    public void onMessage(ConsumerRecord<String, String> message)
    {
        System.out.println("Key : " + message.key() + " | Value : " + message.value());
    }
}
