package com.cibertec.T1.service.impl;

import com.cibertec.T1.model.Doctor;
import com.cibertec.T1.model.Hospital;
import com.cibertec.T1.repo.DoctorRepo;
import com.cibertec.T1.repo.HospitalRepo;
import com.cibertec.T1.service.DoctorService;
import com.cibertec.T1.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    HospitalRepo repository;

    @Override
    public List<Hospital> list() {
        return repository.findAll();
    }

    @Override
    public Hospital add(Hospital c) {
        return repository.save(c);
    }

    @Override
    public Hospital update(Hospital c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}