package com.fiap.questionapi.service;

import com.fiap.questionapi.model.entity.Answer;

import java.util.List;

public interface AnswerService {
    List<Answer> findLastByPatient(String cpf);
}
