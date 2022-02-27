package com.fiap.questionapi.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StatusResponseDTO {
    private Long id;
    private String status;
}
