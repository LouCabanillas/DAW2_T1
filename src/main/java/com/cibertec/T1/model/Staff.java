package com.cibertec.T1.model;

import lombok.*;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "staffs")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    private Long staffId;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @Column(name = "staff_fname")
    private String staffFName;

    @Column(name = "staff_lname")
    private String staffLName;

    @Column(name = "staff_address")
    private String staffAddress;

    @Column(name = "staff_phone_number")
    private String staffPhoneNumber;

}
