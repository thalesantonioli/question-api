package com.fiap.questionapi.service.impl;

import com.fiap.questionapi.model.entity.Answer;
import com.fiap.questionapi.repository.AnswerRepository;
import com.fiap.questionapi.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public List<Answer> findLastByPatient(String cpf) {
        return answerRepository.findLastByPatient(cpf);
    }
}
