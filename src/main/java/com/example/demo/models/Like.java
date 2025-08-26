package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "likes")
public class Like {

    @Id
    private String id;

    private String targetId;

    // TODO : Add enum for thr target type
    private String targetType; // Questions, Answers, Comments, etc

    private Boolean isLike;

    @CreatedDate
    private LocalDateTime createdAt;

}
