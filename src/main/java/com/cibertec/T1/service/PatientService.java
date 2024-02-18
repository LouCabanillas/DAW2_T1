package com.cibertec.T1.service;

import com.cibertec.T1.model.*;
import java.util.List;

public interface PatientService {

    public List<Patient> list();
    public Patient add(Patient o);
    public Patient update(Patient o);
    public void delete(Long id);

}
