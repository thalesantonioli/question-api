package com.fiap.questionapi.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionComplementResponseDTO {
    private Long id;
    private String complement;
}
