package com.fiap.questionapi.model.mapper;

import com.fiap.questionapi.model.dto.QuestionResponseDTO;
import com.fiap.questionapi.model.entity.Question;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface QuestionMapper {
    List<QuestionResponseDTO> modelToDto(List<Question> questionList);
}
