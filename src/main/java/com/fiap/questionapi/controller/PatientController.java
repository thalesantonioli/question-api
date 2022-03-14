package com.fiap.questionapi.controller;

import com.fiap.questionapi.model.dto.PatientResponseDTO;
import com.fiap.questionapi.model.entity.Patient;
import com.fiap.questionapi.model.mapper.PatientMapper;
import com.fiap.questionapi.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patient")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientMapper patientMapper;

    @GetMapping("/email/{email}")
    public ResponseEntity<PatientResponseDTO> findByEmail(@PathVariable("email") String email) {
        Patient patient = patientService.findByEmail(email);
        return ResponseEntity.ok().body(
                patientMapper.modelToDto(patient)
        );
    }
}
