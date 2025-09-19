package com.example.uccexample.domain.irepository;

import java.util.List;

import com.example.uccexample.domain.dto.ClientDTO;

public interface  IClientRepository {

    List<ClientDTO> getAll();
    ClientDTO save(ClientDTO clientDto);
    void delete(ClientDTO clientDto);
    ClientDTO findById(Long id);
}
