package com.fiap.questionapi.model.mapper;

import com.fiap.questionapi.model.dto.TicketResponseDTO;
import com.fiap.questionapi.model.entity.Ticket;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface TicketMapper {
    List<TicketResponseDTO> modelToDto(List<Ticket> ticketList);
    TicketResponseDTO modelToDto(Ticket ticket);
}
