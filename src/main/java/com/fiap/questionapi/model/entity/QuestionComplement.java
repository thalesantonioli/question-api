package com.fiap.questionapi.model.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_question_complement")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionComplement {

    @Id
    @Column(name = "id_question_complement")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_question", referencedColumnName = "id_question")
    private Question question;

    @Column(name = "complement")
    private String complement;
}
