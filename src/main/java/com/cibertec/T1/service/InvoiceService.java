package com.cibertec.T1.service;

import com.cibertec.T1.model.*;
import java.util.List;

public interface InvoiceService {

    public List<Invoice> list();
    public Invoice add(Invoice o);
    public Invoice update(Invoice o);
    public void delete(Long id);

}
