package com.fiap.questionapi.controller;

import com.fiap.questionapi.model.dto.AnswerRequestDTO;
import com.fiap.questionapi.model.dto.AnswerResponseDTO;
import com.fiap.questionapi.model.dto.TicketResponseDTO;
import com.fiap.questionapi.model.entity.Answer;
import com.fiap.questionapi.model.entity.Ticket;
import com.fiap.questionapi.model.mapper.AnswerMapper;
import com.fiap.questionapi.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("answer")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @Autowired
    private AnswerMapper answerMapper;

    @GetMapping("patient/{id}")
    public ResponseEntity<List<AnswerResponseDTO>> findLastByPatient(@PathVariable("id") String id) {
        List<Answer> answerList = answerService.findLastByPatient(id);
        return ResponseEntity.ok().body(
                answerMapper.modelToDto(answerList)
        );
    }

    @PostMapping
    public ResponseEntity<List<AnswerResponseDTO>> create(@RequestBody AnswerRequestDTO answerRequestDTO) throws Exception {
        List<Answer> answerList = answerService.create(answerRequestDTO);
        return ResponseEntity.ok().body(
                answerMapper.modelToDto(answerList)
        );
    }
}
