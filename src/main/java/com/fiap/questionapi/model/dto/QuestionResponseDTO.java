package com.fiap.questionapi.model.dto;

import com.fiap.questionapi.model.entity.Quiz;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionResponseDTO {
    private Long id;
    private QuizResponseDTO quiz;
    private String question;
    private Boolean freeText;
    private List<QuestionComplementResponseDTO> questionComplement;
}
