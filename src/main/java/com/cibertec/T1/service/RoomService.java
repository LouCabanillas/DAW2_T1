package com.cibertec.T1.service;

import com.cibertec.T1.model.*;
import java.util.List;

public interface RoomService {

    public List<Room> list();
    public Room add(Room o);
    public Room update(Room o);
    public void delete(Long id);

}
