package com.fiap.questionapi.model.dto;

import com.fiap.questionapi.model.entity.HospitalUnit;
import com.fiap.questionapi.model.entity.Status;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketResponseDTO {
    private Long id;
    private AnswerResponseDTO answer;
    private EmergencyRoomResponseDTO emergencyRoom;
    private HospitalUnitResponseDTO hospitalUnit;
    private LocalDate creationDate;
    private StatusResponseDTO status;
    private LocalDate statusDate;
}
