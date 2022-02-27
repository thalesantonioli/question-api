package com.fiap.questionapi.service;

import com.fiap.questionapi.exception.NotFoundException;
import com.fiap.questionapi.model.entity.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> findByPatientId(Long idPatient);
    Ticket findById(Long id) throws NotFoundException;
}
