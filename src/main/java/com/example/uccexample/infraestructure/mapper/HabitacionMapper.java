package com.example.uccexample.infraestructure.mapper;

import java.util.List;

import com.example.uccexample.domain.dto.RoomDTO;
import com.example.uccexample.infraestructure.model.Habitacion;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface HabitacionMapper {

    // Entidad -> DTO
    @Mapping(source = "idHabitacion",target = "idRoom")
    @Mapping(source = "numero", target = "number")
    @Mapping(source = "tipo", target = "type")
    @Mapping(source = "precio", target = "price")
    @Mapping(source = "disponible", target = "available")
    RoomDTO toRoomDTO(Habitacion habitacion);

    @Mapping(source = "idHabitacion",target = "idRoom")
    @Mapping(source = "numero", target = "number")
    @Mapping(source = "tipo", target = "type")
    @Mapping(source = "precio", target = "price")
    @Mapping(source = "disponible", target = "available")
    List<RoomDTO> toRoomDTOs(List<Habitacion> habitaciones);

    @Mapping(source = "idRoom", target = "idHabitacion")
    @Mapping(source = "number", target = "numero")
    @Mapping(source = "type", target = "tipo")
    @Mapping(source = "price", target = "precio")
    @Mapping(source = "available", target = "disponible")
    Habitacion toHabitacion(RoomDTO roomDTO);
}
