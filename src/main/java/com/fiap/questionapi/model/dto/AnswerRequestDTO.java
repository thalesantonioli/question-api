package com.fiap.questionapi.model.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnswerRequestDTO {
    private String patientId;
    private Long quizId;
    private List<AnswerDTO> answerDTOList;
}
