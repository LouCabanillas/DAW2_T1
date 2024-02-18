package com.cibertec.T1.service.impl;

import com.cibertec.T1.model.Pharmacy;
import com.cibertec.T1.repo.PharmacyRepo;
import com.cibertec.T1.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PharmacyServiceImpl implements PharmacyService {

    @Autowired
    PharmacyRepo repository;

    @Override
    public List<Pharmacy> list() {
        return repository.findAll();
    }

    @Override
    public Pharmacy add(Pharmacy c) {
        return repository.save(c);
    }

    @Override
    public Pharmacy update(Pharmacy c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}