package com.fiap.questionapi.service;

import com.fiap.questionapi.model.dto.AnswerRequestDTO;
import com.fiap.questionapi.model.entity.Answer;

import java.util.List;

public interface AnswerService {
    List<Answer> findLastByPatient(String cpf);
    List<Answer> create(AnswerRequestDTO answerRequestDTO) throws Exception;
}
