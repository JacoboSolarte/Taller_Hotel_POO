package com.example.uccexample.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uccexample.domain.dto.ReservationDTO;
import com.example.uccexample.infraestructure.repository.ReservaRepository;

@Service
public class ReservationService {
    
    @Autowired
    private ReservaRepository reservaRepository;

    public List<ReservationDTO> getAll(){
        return reservaRepository.getAll();
    }

    public ReservationDTO findById(Long id){
        return reservaRepository.findById(id);
    }

    public ReservationDTO save(ReservationDTO reservationDto){
        return reservaRepository.save(reservationDto);
    }

    public void delete(ReservationDTO reservationDto){
        reservaRepository.delete(reservationDto);
    }

}