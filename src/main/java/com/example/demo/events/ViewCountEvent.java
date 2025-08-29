package com.example.demo.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ViewCountEvent {

    private String targetId;

    private String targetType;

    private LocalDateTime timestamp;

}
