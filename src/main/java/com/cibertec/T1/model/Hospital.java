package com.cibertec.T1.model;

import lombok.*;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "hospitals")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hospital_id")
    private Long hospitalId;

    @Column(name = "hospital_name")
    private String hospitalName;

    @Column(name = "hospital_address")
    private String hospitalAddress;

    @Column(name = "hospital_phone_number")
    private String hospitalPhoneNumber;

    @Column(name = "state")
    private String state;

    @Column(name = "zip_code")
    private String zipCode;

}

