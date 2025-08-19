package com.example.demo.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class QuestionResponseDTO {

    private String id;

    private String title;

    private String content;

    private LocalDateTime createdAt;
}
