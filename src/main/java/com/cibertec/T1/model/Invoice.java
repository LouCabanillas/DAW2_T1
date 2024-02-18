package com.cibertec.T1.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_num")
    private Long invoiceNum;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @Column(name = "service_description")
    private String serviceDescription;

    @Column(name = "cost")
    private double cost;

    @Column(name = "total")
    private double total;

}
