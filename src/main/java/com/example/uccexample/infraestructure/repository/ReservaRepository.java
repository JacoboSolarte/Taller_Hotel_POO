package com.example.uccexample.infraestructure.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.uccexample.domain.dto.ReservationDTO;
import com.example.uccexample.domain.irepository.IReservationRepository;
import com.example.uccexample.infraestructure.crud.ReservaCrud;
import com.example.uccexample.infraestructure.mapper.ReservaMapper;
import com.example.uccexample.infraestructure.model.Reserva;

@Repository
public class ReservaRepository implements IReservationRepository {

    @Autowired
    private ReservaCrud reservaCrud;

    @Autowired
    private ReservaMapper reservaMapper;

    @Override
    public List<ReservationDTO> getAll() {
        List<Reserva> reservas = (List<Reserva>) reservaCrud.findAll();
        return reservaMapper.toReservationDTOs(reservas);
    }

    @Override
    public ReservationDTO save(ReservationDTO reservationDto) {
        Reserva reserva = reservaMapper.toReserva(reservationDto);
        return reservaMapper.toReservationDTO(reservaCrud.save(reserva));
    }

    @Override
    public void delete(ReservationDTO reservationDto) {
        Reserva reserva = reservaMapper.toReserva(reservationDto);
        reservaCrud.delete(reserva);
    }

    @Override
    public ReservationDTO findById(Long id) {
        Optional<Reserva> reserva = reservaCrud.findById(id);
        return reserva.map(r -> reservaMapper.toReservationDTO(r)).orElse(null);
    }
}
