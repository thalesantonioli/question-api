package com.fiap.questionapi.repository;

import com.fiap.questionapi.model.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByAnswerPatientId(Long idPatient);
}
