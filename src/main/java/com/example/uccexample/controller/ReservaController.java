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

import com.example.uccexample.domain.dto.ReservationDTO;
import com.example.uccexample.domain.service.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservaController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public List<ReservationDTO> getAll() {
        return reservationService.getAll();
    }

    @GetMapping("/{idReservation}")
    public ReservationDTO findById(@PathVariable Long idReservation) {
        return reservationService.findById(idReservation);
    }

    @PostMapping
    public ReservationDTO save(@RequestBody ReservationDTO reservationDto) {
        return reservationService.save(reservationDto);
    }

    @DeleteMapping
    public void delete(@RequestBody ReservationDTO reservationDto) {
        reservationService.delete(reservationDto);
    }
}
