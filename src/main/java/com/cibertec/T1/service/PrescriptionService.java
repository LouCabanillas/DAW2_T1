package com.cibertec.T1.service;

import com.cibertec.T1.model.*;
import java.util.List;

public interface PrescriptionService {

    public List<Prescription> list();
    public Prescription add(Prescription o);
    public Prescription update(Prescription o);
    public void delete(Long id);

}
