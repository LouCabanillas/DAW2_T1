package com.cibertec.T1.service.impl;

import com.cibertec.T1.model.Prescription;
import com.cibertec.T1.repo.PrescriptionRepo;
import com.cibertec.T1.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    @Autowired
    PrescriptionRepo repository;

    @Override
    public List<Prescription> list() {
        return repository.findAll();
    }

    @Override
    public Prescription add(Prescription c) {
        return repository.save(c);
    }

    @Override
    public Prescription update(Prescription c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}