package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnswerResponseDTO {

    private String Id;

    private String content;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
