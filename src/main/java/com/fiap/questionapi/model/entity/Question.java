package com.fiap.questionapi.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_question")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    @Id
    @Column(name = "id_question")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_quiz", referencedColumnName = "id_quiz")
    private Quiz quiz;

    @Column(name = "question")
    private String question;

    @Column(name = "ind_free_text")
    private Boolean freeText;

    @OneToMany(mappedBy = "question")
    private List<QuestionComplement> questionComplement;
}
