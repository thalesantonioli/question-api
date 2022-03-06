package com.fiap.questionapi.repository;

import com.fiap.questionapi.model.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByCpf(String cpf);
}
