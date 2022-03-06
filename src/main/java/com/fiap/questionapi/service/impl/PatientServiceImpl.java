package com.fiap.questionapi.service.impl;

import com.fiap.questionapi.model.entity.Patient;
import com.fiap.questionapi.repository.PatientRepository;
import com.fiap.questionapi.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient findByCpf(String cpf) {
        return patientRepository.findByCpf(cpf);
    }
}
