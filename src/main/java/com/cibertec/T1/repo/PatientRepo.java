package com.cibertec.T1.repo;

import com.cibertec.T1.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient, Long> {

}