package com.example.demo.consumers;

import com.example.demo.config.KafkaConfig;
import com.example.demo.events.ViewCountEvent;
import com.example.demo.repositories.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaEventConsumer {

    private final QuestionRepository questionRepository;

    @KafkaListener(
        topics = KafkaConfig.TOPIC_NAME,
        groupId = "view-count-consumer",
        containerFactory = "kafkaListenerContainerFactory"
    )

    public void handleViewCountEvent(ViewCountEvent viewCountEvent) {

                questionRepository.findById(viewCountEvent.getTargetId())
                .flatMap(question -> {
                    System.out.println("Incrementing view count for questions:" + question.getId());
                    Integer views = question.getViews();
                    question.setViews(views == null ? 1 : views + 1);
                    return questionRepository.save(question);
                })
                .subscribe(updatedQuestion -> {
                    System.out.println("View count increment for question: "+ updatedQuestion.getId());
                },error -> {
                    System.out.println("Error incrementing view count for question " + error.getMessage());
                });

    }

}

// interface ViewCountIncrStrategy
// QuestionViewCountIncrmentStrategy
// AnswerViewCountIncremntStrategy
// viewCountStrategyFactory
