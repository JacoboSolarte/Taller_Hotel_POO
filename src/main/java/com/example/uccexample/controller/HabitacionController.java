package com.example.uccexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.uccexample.domain.dto.RoomDTO;
import com.example.uccexample.domain.service.RoomService;

@RestController
@RequestMapping("/rooms")
public class HabitacionController {

    @Autowired
    private RoomService roomService;

    @GetMapping
    public List<RoomDTO> getAll() {
        return roomService.getAll();
    }

    @GetMapping("/{idRoom}")
    public RoomDTO findById(@PathVariable Long idRoom) {
        return roomService.findById(idRoom);
    }

    @PostMapping
    public RoomDTO save(@RequestBody RoomDTO roomDto) {
        return roomService.save(roomDto);
    }

    @DeleteMapping
    public void delete(@RequestBody RoomDTO roomDto) {
        roomService.delete(roomDto);
    }
}
