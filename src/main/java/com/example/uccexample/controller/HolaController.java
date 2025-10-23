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
import com.example.uccexample.domain.service.ClientService;

@RestController

public class HolaController {

    @Autowired
    public ClientService clientService;

    @GetMapping("/")
    public List<ClientDTO> getAll() {
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public ClientDTO FindById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @PostMapping("/")
    public ClientDTO save(@RequestBody ClientDTO clientDto) {
        return clientService.save(clientDto);
    }

    @DeleteMapping("/")
    public void delete(@RequestBody ClientDTO clientDto) {
         clientService.delete(clientDto);
    }
}