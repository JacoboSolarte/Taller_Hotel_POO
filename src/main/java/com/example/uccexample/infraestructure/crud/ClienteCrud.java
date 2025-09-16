package com.example.uccexample.infraestructure.crud;

import org.springframework.data.repository.CrudRepository;

import com.example.uccexample.model.Cliente;

public interface ClienteCrud extends CrudRepository<Cliente, Long> {
    
}
