package com.fiap.questionapi.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PatientResponseDTO {
    private Long id;
    private String cpf;
    private String namePacient;
    private String nameMother;
    private LocalDate birthDate;
    private String address;
    private Integer addressNumber;
    private Integer zipCode;
    private String city;
    private String state;
    private String phone;
    private String email;
}
