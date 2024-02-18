package com.cibertec.T1.model;

import lombok.*;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private Long doctorId;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @Column(name = "doctor_fname")
    private String doctorFName;

    @Column(name = "doctor_lname")
    private String doctorLName;

    @Column(name = "doctor_phone_number")
    private String doctorPhoneNumber;

}

