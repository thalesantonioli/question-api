package com.fiap.questionapi.service;

import com.fiap.questionapi.exception.NotFoundException;
import com.fiap.questionapi.model.entity.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> findByPatientId(Long idPatient);
    List<Ticket> findByHospitalUnitIdAndStatusIdOrderByEmergencyRoomDesc(Long idUnit);
    Ticket findById(Long id) throws NotFoundException;
    Ticket updateStatus(Long id) throws NotFoundException;
}
