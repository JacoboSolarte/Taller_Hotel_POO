package com.example.uccexample.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.uccexample.domain.dto.ClientDTO;
import com.example.uccexample.infraestructure.repository.ClienteRepository;

@RestController

public class HolaController {

    @Autowired
    public ClienteRepository clienteRepository;

    @GetMapping("/")
    public List<ClientDTO> getAll() {
        return clienteRepository.getAll();
    }

    @GetMapping("/{id}")
    public ClientDTO FindById(@PathVariable Long id) {
        return clienteRepository.findById(id);
    }

    @PostMapping("/")
    public ClientDTO save(@RequestBody ClientDTO clientDto) {
        return clienteRepository.save(clientDto);
    }

    @DeleteMapping("/")
    public void delete(@RequestBody ClientDTO clientDto) {
         clienteRepository.delete(clientDto);
    }
    
    
}