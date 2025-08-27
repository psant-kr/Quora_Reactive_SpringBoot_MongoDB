package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnswerRequestDTO {

    @NotBlank(message = "Content is required")
    @Size(min = 10, max = 100, message = "Content must be between 10 and 100 characters")
    private String content;

    @NotBlank(message = "Question ID is required")
    private String questionId;
}
