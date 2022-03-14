package com.fiap.questionapi.service;

import com.fiap.questionapi.exception.NotFoundException;
import com.fiap.questionapi.model.entity.Quiz;

import java.util.List;

public interface QuizService {
    List<Quiz> findAll();
    Quiz findById(Long id) throws NotFoundException;
}
