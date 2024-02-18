package com.cibertec.T1.model;

import lombok.*;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long patientId;

    @ManyToOne
    @JoinColumn(name = "pharmacy_id", nullable = false)
    private Pharmacy pharmacy;

    @Column(name = "patient_fname")
    private String patientFName;

    @Column(name = "patient_lname")
    private String patientLName;

    @Column(name = "patient_address")
    private String patientAddress;

    @Column(name = "patient_phone_number")
    private String patientPhoneNumber;

    @Transient
    private double totalPrescriptionCost;

}
