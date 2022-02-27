package com.fiap.questionapi.repository;

import com.fiap.questionapi.model.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByQuizId(Long idQuiz);
}
