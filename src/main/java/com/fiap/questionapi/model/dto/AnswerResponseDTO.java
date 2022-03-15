package com.fiap.questionapi.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnswerResponseDTO {
    private Long id;
    private String patientId;
    private QuizResponseDTO quiz;
    private QuestionResponseDTO question;
    private String description;
    private LocalDate date;
    private Boolean answer;
}
