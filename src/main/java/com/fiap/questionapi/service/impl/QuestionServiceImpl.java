package com.fiap.questionapi.service.impl;


import com.fiap.questionapi.exception.NotFoundException;
import com.fiap.questionapi.model.entity.Question;
import com.fiap.questionapi.repository.QuestionRepository;
import com.fiap.questionapi.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> findByQuizId(Long idQuiz) {
        return questionRepository.findByQuizId(idQuiz);
    }

    @Override
    public Question findById(Long id) throws NotFoundException {
        return questionRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Pergunta não encontrada."));
    }
}
