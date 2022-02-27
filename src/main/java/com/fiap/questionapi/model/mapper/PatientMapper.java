package com.fiap.questionapi.model.mapper;

import com.fiap.questionapi.model.dto.PatientResponseDTO;
import com.fiap.questionapi.model.entity.Patient;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientResponseDTO modelToDto(Patient patient);
}
