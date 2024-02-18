package com.cibertec.T1.service.impl;

import com.cibertec.T1.model.Appointment;
import com.cibertec.T1.repo.AppointmentRepo;
import com.cibertec.T1.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    AppointmentRepo repository;

    @Override
    public List<Appointment> list() {
        return repository.findAll();
    }

    @Override
    public Appointment add(Appointment c) {
        return repository.save(c);
    }

    @Override
    public Appointment update(Appointment c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }



}
