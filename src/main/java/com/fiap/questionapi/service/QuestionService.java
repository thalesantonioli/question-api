package com.fiap.questionapi.service;

import com.fiap.questionapi.exception.NotFoundException;
import com.fiap.questionapi.model.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> findByQuizId(Long idQuiz);
    Question findById(Long id) throws NotFoundException;
}
