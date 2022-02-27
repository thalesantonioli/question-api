package com.fiap.questionapi.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuizResponseDTO {
    private Long id;
    private Integer type;
    private String name;
}
