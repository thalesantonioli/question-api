package com.fiap.questionapi.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tb_patient")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    @Id
    @Column(name = "id_patient")
    private Long id;

    @Column(name = "cpf_patient")
    private String cpf;

    @Column(name = "nm_pacient")
    private String namePacient;

    @Column(name = "nm_mother")
    private String nameMother;

    @Column(name = "dt_birth")
    private LocalDate birthDate;

    @Column(name = "address_patient")
    private String address;

    @Column(name = "num_address")
    private Integer addressNumber;

    @Column(name = "zip_code")
    private Integer zipCode;

    @Column(name = "city_address")
    private String city;

    @Column(name = "state_address")
    private String state;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;
}
