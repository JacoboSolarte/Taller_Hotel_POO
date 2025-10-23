package com.example.uccexample.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uccexample.domain.dto.ClientDTO;
import com.example.uccexample.infraestructure.repository.ClienteRepository;

@Service
public class ClientService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClientDTO> getAll(){
        return clienteRepository.getAll();
    }

    public ClientDTO findById(Long id){
        return clienteRepository.findById(id);
    }

    public ClientDTO save(ClientDTO clientDto){
        return clienteRepository.save(clientDto);
    }

    public void delete(ClientDTO clientDto){
        clienteRepository.delete(clientDto);
    }

}
