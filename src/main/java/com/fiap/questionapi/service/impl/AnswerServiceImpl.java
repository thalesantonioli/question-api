package com.fiap.questionapi.service.impl;

import com.fiap.questionapi.exception.NotFoundException;
import com.fiap.questionapi.model.dto.AnswerDTO;
import com.fiap.questionapi.model.dto.AnswerRequestDTO;
import com.fiap.questionapi.model.entity.Answer;
import com.fiap.questionapi.model.entity.Question;
import com.fiap.questionapi.model.entity.Quiz;
import com.fiap.questionapi.repository.AnswerRepository;
import com.fiap.questionapi.service.AnswerService;
import com.fiap.questionapi.service.QuestionService;
import com.fiap.questionapi.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuizService quizService;

    @Autowired
    private QuestionService questionService;

    @Override
    public List<Answer> findLastByPatient(String cpf) {
        return answerRepository.findLastByPatient(cpf);
    }

    @Override
    public List<Answer> create(AnswerRequestDTO answerRequestDTO) throws Exception {
        Quiz quiz = quizService.findById(answerRequestDTO.getQuizId());
        List<Answer> answerList = new ArrayList<>();
        for(AnswerDTO answerDTO : answerRequestDTO.getAnswerDTOList()){
            Question question = questionService.findById(answerDTO.getQuestionId());
            Answer answer = Answer.builder()
                    .answer(answerDTO.getAnswer())
                    .question(question)
                    .date(LocalDate.now())
                    .description(answerDTO.getDescription())
                    .patientId(answerRequestDTO.getPatientId())
                    .quiz(quiz)
                    .build();
            answerList.add(answer);
        }
        return answerRepository.saveAll(answerList);
    }
}
