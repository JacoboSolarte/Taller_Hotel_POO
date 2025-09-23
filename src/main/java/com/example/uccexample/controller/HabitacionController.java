package com.example.uccexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.uccexample.domain.dto.RoomDTO;
import com.example.uccexample.infraestructure.repository.HabitacionRepository;

@RestController
@RequestMapping("/rooms")
public class HabitacionController {

    @Autowired
    private HabitacionRepository habitacionRepository;

    @GetMapping
    public List<RoomDTO> getAll() {
        return habitacionRepository.getAll();
    }

    @GetMapping("/{idRoom}")
    public RoomDTO findById(@PathVariable Long idRoom) {
        return habitacionRepository.findById(idRoom);
    }

    @PostMapping
    public RoomDTO save(@RequestBody RoomDTO roomDto) {
        return habitacionRepository.save(roomDto);
    }

    @DeleteMapping
    public void delete(@RequestBody RoomDTO roomDto) {
        habitacionRepository.delete(roomDto);
    }
}
