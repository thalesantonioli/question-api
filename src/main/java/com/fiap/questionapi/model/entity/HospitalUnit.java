package com.fiap.questionapi.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_hosp_unit")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HospitalUnit {

    @Id
    @Column(name = "id_hosp_unit")
    private Long id;

    @Column(name = "hosp_unit")
    private String unit;

    @Column(name = "address")
    private String address;

    @Column(name = "num_address")
    private Integer adressNumber;

    @Column(name = "zip_code")
    private Integer zipCode;

    @Column(name = "city_address")
    private String city;

    @Column(name = "state_address")
    private String state;
}
