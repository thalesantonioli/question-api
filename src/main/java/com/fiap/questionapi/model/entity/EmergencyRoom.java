package com.fiap.questionapi.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_emerg_room")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmergencyRoom {

    @Id
    @Column(name = "id_emerg_room")
    private Long id;

    @Column(name = "emerg_room")
    private String room;
}
