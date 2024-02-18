package com.cibertec.T1.service.impl;

import com.cibertec.T1.model.Department;
import com.cibertec.T1.repo.DepartmentRepo;
import com.cibertec.T1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepo repository;

    @Override
    public List<Department> list() {
        return repository.findAll();
    }

    @Override
    public Department add(Department c) {
        return repository.save(c);
    }

    @Override
    public Department update(Department c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}