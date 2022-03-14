package com.fiap.questionapi.controller;

import com.fiap.questionapi.exception.NotFoundException;
import com.fiap.questionapi.model.dto.QuizResponseDTO;
import com.fiap.questionapi.model.entity.Quiz;
import com.fiap.questionapi.model.mapper.QuizMapper;
import com.fiap.questionapi.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @Autowired
    private QuizMapper quizMapper;

    @GetMapping("{id}")
    public ResponseEntity<QuizResponseDTO> findById(@PathVariable("id") Long id) throws NotFoundException {
        Quiz quiz = quizService.findById(id);
        return ResponseEntity.ok().body(
                quizMapper.modelToDto(quiz)
        );
    }

    @GetMapping
    public ResponseEntity<List<QuizResponseDTO>> findAll(){
        List<Quiz> quizList = quizService.findAll();
        return ResponseEntity.ok().body(
                quizMapper.modelToDto(quizList)
        );
    }
}
