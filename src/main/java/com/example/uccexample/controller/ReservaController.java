package com.example.uccexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.uccexample.domain.dto.ReservationDTO;
import com.example.uccexample.infraestructure.repository.ReservaRepository;

@RestController
@RequestMapping("/reservations")
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    @GetMapping
    public List<ReservationDTO> getAll() {
        return reservaRepository.getAll();
    }

    @GetMapping("/{idReservation}")
    public ReservationDTO findById(@PathVariable Long idReservation) {
        return reservaRepository.findById(idReservation);
    }

    @PostMapping
    public ReservationDTO save(@RequestBody ReservationDTO reservationDto) {
        return reservaRepository.save(reservationDto);
    }

    @DeleteMapping
    public void delete(@RequestBody ReservationDTO reservationDto) {
        reservaRepository.delete(reservationDto);
    }
}
