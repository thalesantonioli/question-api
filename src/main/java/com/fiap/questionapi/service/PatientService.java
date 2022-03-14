package com.fiap.questionapi.service;

import com.fiap.questionapi.model.entity.Patient;

public interface PatientService {
    Patient findByEmail(String email);
}
