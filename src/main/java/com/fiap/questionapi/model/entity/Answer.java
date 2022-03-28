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
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="answer_id_seq")
    @SequenceGenerator(name="answer_id_seq", sequenceName="answer_id_seq", allocationSize = 1)
    @Column(name = "id_answer")
    private Long id;

    @Column(name = "id_patient")
    private String patientId;

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
