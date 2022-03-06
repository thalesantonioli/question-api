package com.fiap.questionapi.repository;

import com.fiap.questionapi.model.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    @Query(value = "SELECT * FROM tb_answer t " +
            "INNER JOIN tb_patient p ON p.id_patient = t.id_patient " +
            "WHERE p.cpf_patient = :cpf " +
            "AND t.dt_answer = " +
            "( " +
                "SELECT MAX(aux.dt_answer) FROM tb_answer aux " +
                "WHERE aux.id_patient = p.id_patient" +
            ")"
            , nativeQuery = true)
    List<Answer> findLastByPatient(String cpf);
}
