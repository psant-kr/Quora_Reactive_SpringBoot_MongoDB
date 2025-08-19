package com.example.demo.repositories;

import com.example.demo.models.Question;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface QuestionRepository extends ReactiveMongoRepository<Question, String> {

// find by author id
//    Flux<Question> findByAuthorId(String authorId);
//
//    Mono<Long> countByAuthorId(String authorId);
}
