package com.example.demo.producers;

import com.example.demo.config.KafkaConfig;
import com.example.demo.events.ViewCountEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaEventProducer {

    private KafkaTemplate<String, Object> kafkaTemplate;

    public void publishViewCountEvent(ViewCountEvent viewCountEvent) {

        kafkaTemplate.send(KafkaConfig.TOPIC_NAME, viewCountEvent.getTargetId(), viewCountEvent)
                .whenComplete((result, error) -> {
                    if (error != null) {
                        System.out.println("Error publishing view count event " + error.getMessage());
                    }
                });
    }
}
