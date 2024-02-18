package com.cibertec.T1.service.impl;

import com.cibertec.T1.model.Room;
import com.cibertec.T1.repo.RoomRepo;
import com.cibertec.T1.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepo repository;

    @Override
    public List<Room> list() {
        return repository.findAll();
    }

    @Override
    public Room add(Room c) {
        return repository.save(c);
    }

    @Override
    public Room update(Room c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}