package com.example.uccexample.infraestructure.mapper;

import com.example.uccexample.domain.dto.ReservationDTO;
import com.example.uccexample.model.Reserva;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
(componentModel = "spring", uses = {ClienteMapper.class, HabitacionMapper.class})
public interface ReservaMapper {

    // Entidad -> DTO
    @Mapping(source = "fechaInicio", target = "startDate")
    @Mapping(source = "fechaFin", target = "endDate")
    @Mapping(source = "cliente", target = "client")
    @Mapping(source = "habitacion", target = "room")
    ReservationDTO toReservationDTO(Reserva reserva);

    // DTO -> Entidad
    @Mapping(source = "startDate", target = "fechaInicio")
    @Mapping(source = "endDate", target = "fechaFin")
    @Mapping(source = "client", target = "cliente")
    @Mapping(source = "room", target = "habitacion")
    Reserva toReserva(ReservationDTO reservationDTO);
}
