package com.cibertec.T1.repo;

import com.cibertec.T1.model.Appointment;
import com.cibertec.T1.model.Department;
import com.cibertec.T1.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor, Long> {

}