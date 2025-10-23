package com.example.uccexample.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  

import com.example.uccexample.domain.dto.RoomDTO;
import com.example.uccexample.infraestructure.repository.HabitacionRepository;

@Service
public class RoomService {
    
    @Autowired
    private HabitacionRepository habitacionRepository;

    public List<RoomDTO> getAll(){
        return habitacionRepository.getAll();
    }

    public RoomDTO findById(Long id){
        return habitacionRepository.findById(id);
    }

    public RoomDTO save(RoomDTO roomDto){
        return habitacionRepository.save(roomDto);
    }

    public void delete(RoomDTO roomDto){
        habitacionRepository.delete(roomDto);
    }

}