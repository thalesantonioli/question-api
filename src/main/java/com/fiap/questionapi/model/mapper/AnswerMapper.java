package com.fiap.questionapi.model.mapper;

import com.fiap.questionapi.model.dto.AnswerResponseDTO;
import com.fiap.questionapi.model.entity.Answer;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface AnswerMapper {
    List<AnswerResponseDTO> modelToDto(List<Answer> answerList);
}
