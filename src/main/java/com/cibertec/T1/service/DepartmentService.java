package com.cibertec.T1.service;

import com.cibertec.T1.model.*;
import java.util.List;

public interface DepartmentService {

    public List<Department> list();
    public Department add(Department o);
    public Department update(Department o);
    public void delete(Long id);

}
