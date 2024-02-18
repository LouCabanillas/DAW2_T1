package com.cibertec.T1.repo;

import com.cibertec.T1.model.Appointment;
import com.cibertec.T1.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Long> {

}