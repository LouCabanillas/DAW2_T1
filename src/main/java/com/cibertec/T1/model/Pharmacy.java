package com.cibertec.T1.model;

import lombok.*;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "pharmacies")
public class Pharmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pharmacy_id")
    private Long pharmacyId;

    @Column(name = "pharmacy_name")
    private String pharmacyName;

    @Column(name = "pharmacy_address")
    private String pharmacyAddress;

    @Column(name = "pharmacy_phone_number")
    private String pharmacyPhoneNumber;

}

