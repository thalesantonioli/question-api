package com.fiap.questionapi.service.impl;

import com.fiap.questionapi.exception.NotFoundException;
import com.fiap.questionapi.model.entity.Quiz;
import com.fiap.questionapi.repository.QuizRepository;
import com.fiap.questionapi.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Override
    public List<Quiz> findAll() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz findById(Long id) throws NotFoundException {
        return quizRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Quiz não encontrado."));
    }
}
