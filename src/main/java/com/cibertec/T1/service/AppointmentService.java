package com.cibertec.T1.service;

import com.cibertec.T1.model.*;
import java.util.List;

public interface AppointmentService {

    public List<Appointment> list();
    public Appointment add(Appointment o);
    public Appointment update(Appointment o);
    public void delete(Long id);

}
