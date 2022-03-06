package com.fiap.questionapi.controller;

import com.fiap.questionapi.exception.NotFoundException;
import com.fiap.questionapi.model.dto.TicketResponseDTO;
import com.fiap.questionapi.model.entity.Ticket;
import com.fiap.questionapi.model.mapper.TicketMapper;
import com.fiap.questionapi.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private TicketMapper ticketMapper;

    @GetMapping("{id}")
    public ResponseEntity<TicketResponseDTO> findById(@PathVariable("id") Long id) throws NotFoundException {
        Ticket ticket = ticketService.findById(id);
        return ResponseEntity.ok().body(
                ticketMapper.modelToDto(ticket)
        );
    }

    @GetMapping("answer/patient/{id}")
    public ResponseEntity<List<TicketResponseDTO>> findByPatientId(@PathVariable("id") Long idPatient) {
        List<Ticket> ticketList = ticketService.findByPatientId(idPatient);
        return ResponseEntity.ok().body(
                ticketMapper.modelToDto(ticketList)
        );
    }

    @GetMapping("hospitalUnit/{id}")
    public ResponseEntity<List<TicketResponseDTO>> findByHospitalUnitIdAndStatusIdOrderByEmergencyRoomDesc(@PathVariable("id") Long idUnit) {
        List<Ticket> ticketList = ticketService.findByHospitalUnitIdAndStatusIdOrderByEmergencyRoomDesc(idUnit);
        return ResponseEntity.ok().body(
                ticketMapper.modelToDto(ticketList)
        );
    }

    @PutMapping("{id}")
    public ResponseEntity<TicketResponseDTO> updateStatus(@PathVariable("id") Long id) throws NotFoundException {
        Ticket ticket = ticketService.updateStatus(id);
        return ResponseEntity.ok().body(
                ticketMapper.modelToDto(ticket)
        );
    }

}
