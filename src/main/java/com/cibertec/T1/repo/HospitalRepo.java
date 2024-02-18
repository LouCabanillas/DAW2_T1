package com.cibertec.T1.repo;

import com.cibertec.T1.model.Appointment;
import com.cibertec.T1.model.Department;
import com.cibertec.T1.model.Doctor;
import com.cibertec.T1.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepo extends JpaRepository<Hospital, Long> {

}