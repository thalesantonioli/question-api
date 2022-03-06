package com.fiap.questionapi.controller;

import com.fiap.questionapi.model.dto.PatientResponseDTO;
import com.fiap.questionapi.model.entity.Patient;
import com.fiap.questionapi.model.mapper.PatientMapper;
import com.fiap.questionapi.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientMapper patientMapper;

    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<PatientResponseDTO> findByCpf(@PathVariable("cpf") String cpf) {
        Patient patient = patientService.findByCpf(cpf);
        return ResponseEntity.ok().body(
                patientMapper.modelToDto(patient)
        );
    }
}
