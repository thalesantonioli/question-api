package com.fiap.questionapi.controller;

import com.fiap.questionapi.model.dto.QuestionResponseDTO;
import com.fiap.questionapi.model.entity.Question;
import com.fiap.questionapi.model.mapper.QuestionMapper;
import com.fiap.questionapi.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuestionMapper questionMapper;

    @GetMapping("/quiz/{id}")
    public ResponseEntity<List<QuestionResponseDTO>> findByQuizId(@PathVariable("id") Long quizId) {
        List<Question> questionList = questionService.findByQuizId(quizId);
        return ResponseEntity.ok().body(
                questionMapper.modelToDto(questionList)
        );
    }
}
