package com.cibertec.T1.model;

import lombok.*;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "appointments")
public class Appointment {

    @EmbeddedId
    private AppointmentId id;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false, insertable = false, updatable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false, insertable = false, updatable = false)
    private Doctor doctor;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private String time;

    @Data
    @Embeddable
    public static class AppointmentId implements Serializable {
        @Column(name = "patient_id")
        private Long patientId;

        @Column(name = "doctor_id")
        private Long doctorId;
    }
}
