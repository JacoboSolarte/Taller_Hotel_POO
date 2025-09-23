package com.example.uccexample.infraestructure.crud;

import org.springframework.data.repository.CrudRepository;

import com.example.uccexample.infraestructure.model.Habitacion;

public interface  HabitacionCrud extends CrudRepository<Habitacion, Long> {

    
}
