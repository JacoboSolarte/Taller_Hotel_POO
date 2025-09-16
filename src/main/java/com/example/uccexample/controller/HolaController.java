package com.example.uccexample.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.uccexample.infraestructure.crud.ClienteCrud;
import com.example.uccexample.model.Cliente;

@RestController

public class HolaController {

    private ClienteCrud clienteCrud;

    public HolaController(ClienteCrud clienteCrud) {
        this.clienteCrud = clienteCrud;
    }

    @GetMapping("/")
    public List<Cliente> getAll() {
        return (List<Cliente>) this.clienteCrud.findAll();
    }
    
}