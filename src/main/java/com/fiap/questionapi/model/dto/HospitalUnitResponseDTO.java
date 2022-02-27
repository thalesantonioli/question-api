package com.fiap.questionapi.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HospitalUnitResponseDTO {
    private Long id;
    private String unit;
    private String address;
    private Integer adressNumber;
    private Integer zipCode;
    private String city;
    private String state;
}
