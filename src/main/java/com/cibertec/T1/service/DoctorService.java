package com.cibertec.T1.service;

import com.cibertec.T1.model.*;
import java.util.List;

public interface DoctorService {

    public List<Doctor> list();
    public Doctor add(Doctor o);
    public Doctor update(Doctor o);
    public void delete(Long id);

}
