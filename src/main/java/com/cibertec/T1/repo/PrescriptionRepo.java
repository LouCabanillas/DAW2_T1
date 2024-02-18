package com.cibertec.T1.repo;

import com.cibertec.T1.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrescriptionRepo extends JpaRepository<Prescription, Long> {

    List<Prescription> findByPatient_PatientId(Long patientId);

}