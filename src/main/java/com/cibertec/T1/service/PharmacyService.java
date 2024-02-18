package com.cibertec.T1.service;

import com.cibertec.T1.model.*;
import java.util.List;

public interface PharmacyService {

    public List<Pharmacy> list();
    public Pharmacy add(Pharmacy o);
    public Pharmacy update(Pharmacy o);
    public void delete(Long id);

}
