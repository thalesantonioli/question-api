package com.fiap.questionapi.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnswerDTO {
    private Long questionId;
    private String description;
    private Boolean answer;
}
