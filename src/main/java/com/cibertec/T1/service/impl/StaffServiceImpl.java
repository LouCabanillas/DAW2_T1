package com.cibertec.T1.service.impl;

import com.cibertec.T1.model.Staff;
import com.cibertec.T1.repo.StaffRepo;
import com.cibertec.T1.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    StaffRepo repository;

    @Override
    public List<Staff> list() {
        return repository.findAll();
    }

    @Override
    public Staff add(Staff c) {
        return repository.save(c);
    }

    @Override
    public Staff update(Staff c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}