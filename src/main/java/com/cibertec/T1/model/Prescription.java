package com.cibertec.T1.model;

import lombok.*;
import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "prescriptions")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prescription_num")
    private Long prescriptionNum;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @Column(name = "medication_name")
    private String medicationName;

    @Column(name = "prescription_date")
    private Date prescriptionDate;

    @Column(name = "prescription_cost")
    private double prescriptionCost;

}