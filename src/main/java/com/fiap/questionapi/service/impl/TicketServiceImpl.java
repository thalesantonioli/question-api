package com.fiap.questionapi.service.impl;

import com.fiap.questionapi.enumeration.StatusEnum;
import com.fiap.questionapi.exception.NotFoundException;
import com.fiap.questionapi.model.entity.Status;
import com.fiap.questionapi.model.entity.Ticket;
import com.fiap.questionapi.repository.TicketRepository;
import com.fiap.questionapi.service.StatusService;
import com.fiap.questionapi.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private StatusService statusService;

    @Override
    public List<Ticket> findByPatientId(Long idPatient) {
        return ticketRepository.findByAnswerPatientId(idPatient);
    }

    @Override
    public List<Ticket> findByHospitalUnitIdAndStatusIdOrderByEmergencyRoomDesc(Long idUnit) {
        return ticketRepository.findByHospitalUnitIdAndStatusIdOrderByEmergencyRoomDesc(idUnit, StatusEnum.OPENED.getKey());
    }

    @Override
    public Ticket findById(Long id) throws NotFoundException {
        return ticketRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Ticket não encontrado."));
    }

    @Override
    public Ticket updateStatus(Long id) throws NotFoundException {
        Ticket ticket = findById(id);
        Status status = statusService.findById(StatusEnum.FINISHED.getKey());
        ticket.setStatus(status);
        return ticketRepository.save(ticket);
    }
}
