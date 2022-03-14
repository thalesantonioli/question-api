package com.fiap.questionapi.model.mapper;

import com.fiap.questionapi.model.dto.QuizResponseDTO;
import com.fiap.questionapi.model.entity.Quiz;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface QuizMapper {
    List<QuizResponseDTO> modelToDto(List<Quiz> quizList);
    QuizResponseDTO modelToDto(Quiz quiz);
}
