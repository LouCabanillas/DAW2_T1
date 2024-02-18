package com.cibertec.T1.service.impl;

import com.cibertec.T1.model.Invoice;
import com.cibertec.T1.repo.InvoiceRepo;
import com.cibertec.T1.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    InvoiceRepo repository;

    @Override
    public List<Invoice> list() {
        return repository.findAll();
    }

    @Override
    public Invoice add(Invoice c) {
        return repository.save(c);
    }

    @Override
    public Invoice update(Invoice c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}