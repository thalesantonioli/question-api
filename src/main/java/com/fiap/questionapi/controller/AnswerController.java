package com.fiap.questionapi.controller;

import com.fiap.questionapi.model.dto.AnswerResponseDTO;
import com.fiap.questionapi.model.dto.TicketResponseDTO;
import com.fiap.questionapi.model.entity.Answer;
import com.fiap.questionapi.model.entity.Ticket;
import com.fiap.questionapi.model.mapper.AnswerMapper;
import com.fiap.questionapi.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @Autowired
    private AnswerMapper answerMapper;

    @GetMapping("patient/{cpf}")
    public ResponseEntity<List<AnswerResponseDTO>> findLastByPatient(@PathVariable("cpf") String cpf) {
        List<Answer> answerList = answerService.findLastByPatient(cpf);
        return ResponseEntity.ok().body(
                answerMapper.modelToDto(answerList)
        );
    }

}
