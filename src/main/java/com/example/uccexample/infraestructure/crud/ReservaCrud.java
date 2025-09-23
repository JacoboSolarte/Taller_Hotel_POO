package com.example.uccexample.infraestructure.crud;

import org.springframework.data.repository.CrudRepository;

import com.example.uccexample.infraestructure.model.Reserva;

public interface ReservaCrud extends CrudRepository<Reserva, Long> {
    
}
