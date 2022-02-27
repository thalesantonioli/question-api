package com.fiap.questionapi.model.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_answer")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Answer {

    @Id
    @Column(name = "id_answer")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_patient", referencedColumnName = "id_patient")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "id_quiz", referencedColumnName = "id_quiz")
    private Quiz quiz;

    @ManyToOne
    @JoinColumn(name = "id_question", referencedColumnName = "id_question")
    private Question question;

    @Column(name = "desc_answer")
    private String description;

    @Column(name = "dt_answer")
    private LocalDate date;

    @Column(name = "answer")
    private Boolean answer;
}
