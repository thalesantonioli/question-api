package com.fiap.questionapi.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_quiz")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {

    @Id
    @Column(name = "id_quiz")
    private Long id;

    @Column(name = "tp_quiz")
    private Integer type;

    @Column(name = "nm_quiz")
    private String name;
}
