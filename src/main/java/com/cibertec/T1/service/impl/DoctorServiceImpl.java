package com.cibertec.T1.service.impl;

import com.cibertec.T1.model.Doctor;
import com.cibertec.T1.repo.DoctorRepo;
import com.cibertec.T1.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepo repository;

    @Override
    public List<Doctor> list() {
        return repository.findAll();
    }

    @Override
    public Doctor add(Doctor c) {
        return repository.save(c);
    }

    @Override
    public Doctor update(Doctor c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}