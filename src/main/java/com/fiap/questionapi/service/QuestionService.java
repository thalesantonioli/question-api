package com.fiap.questionapi.service;

import com.fiap.questionapi.model.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> findByQuizId(Long idQuiz);
}
