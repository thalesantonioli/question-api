package com.fiap.questionapi.model.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_ticket")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    @Id
    @Column(name = "id_ticket")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_answer", referencedColumnName = "id_answer")
    private Answer answer;

    @ManyToOne
    @JoinColumn(name = "id_emerg_room", referencedColumnName = "id_emerg_room")
    private EmergencyRoom emergencyRoom;

    @ManyToOne
    @JoinColumn(name = "id_hosp_unit", referencedColumnName = "id_hosp_unit")
    private HospitalUnit hospitalUnit;

    @Column(name = "dt_created")
    private LocalDate creationDate;

    @ManyToOne
    @JoinColumn(name = "id_status", referencedColumnName = "id_status")
    private Status status;

    @Column(name = "dt_status")
    private LocalDate statusDate;
}
