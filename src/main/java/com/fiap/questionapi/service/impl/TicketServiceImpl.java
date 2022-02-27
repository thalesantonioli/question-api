package com.fiap.questionapi.service.impl;

import com.fiap.questionapi.exception.NotFoundException;
import com.fiap.questionapi.model.entity.Ticket;
import com.fiap.questionapi.repository.TicketRepository;
import com.fiap.questionapi.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> findByPatientId(Long idPatient) {
        return ticketRepository.findByAnswerPatientId(idPatient);
    }

    @Override
    public Ticket findById(Long id) throws NotFoundException {
        return ticketRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Ticket não encontrado."));
    }
}
