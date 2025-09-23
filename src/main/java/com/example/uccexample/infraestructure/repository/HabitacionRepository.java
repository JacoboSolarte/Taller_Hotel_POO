package com.example.uccexample.infraestructure.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.uccexample.domain.dto.RoomDTO;
import com.example.uccexample.infraestructure.crud.HabitacionCrud;
import com.example.uccexample.infraestructure.mapper.HabitacionMapper;
import com.example.uccexample.infraestructure.model.Habitacion;

@Repository
public class HabitacionRepository {

    @Autowired
    private HabitacionCrud habitacionCrud;

    @Autowired
    private HabitacionMapper habitacionMapper;

    public List<RoomDTO> getAll() {
        List<Habitacion> habitaciones = (List<Habitacion>) habitacionCrud.findAll();
        return habitacionMapper.toRoomDTOs(habitaciones);
    }


    public RoomDTO save(RoomDTO roomDto) {
        Habitacion habitacion = habitacionMapper.toHabitacion(roomDto);
        return habitacionMapper.toRoomDTO(habitacionCrud.save(habitacion));
    }


    public void delete(RoomDTO roomDto) {
        Habitacion habitacion = habitacionMapper.toHabitacion(roomDto);
        habitacionCrud.delete(habitacion);
    }

    public RoomDTO findById(Long idRoom) {
        Optional<Habitacion> habitacion = habitacionCrud.findById(idRoom);
        return habitacion.map(h -> habitacionMapper.toRoomDTO(h)).orElse(null);
    }
    
}
