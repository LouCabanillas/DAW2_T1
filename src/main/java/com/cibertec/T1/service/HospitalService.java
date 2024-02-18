package com.cibertec.T1.service;

import com.cibertec.T1.model.*;
import java.util.List;

public interface HospitalService {

    public List<Hospital> list();
    public Hospital add(Hospital o);
    public Hospital update(Hospital o);
    public void delete(Long id);

}
