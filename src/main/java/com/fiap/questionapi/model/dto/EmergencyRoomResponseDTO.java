package com.fiap.questionapi.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmergencyRoomResponseDTO {
    private Long id;
    private String room;
}
