package com.cibertec.T1.service;

import com.cibertec.T1.model.*;
import java.util.List;

public interface StaffService {

    public List<Staff> list();
    public Staff add(Staff o);
    public Staff update(Staff o);
    public void delete(Long id);

}
