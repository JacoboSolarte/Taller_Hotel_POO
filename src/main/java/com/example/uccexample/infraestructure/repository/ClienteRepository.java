package com.example.uccexample.infraestructure.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.uccexample.domain.dto.ClientDTO;
import com.example.uccexample.domain.irepository.IClientRepository;
import com.example.uccexample.infraestructure.crud.ClienteCrud;
import com.example.uccexample.infraestructure.mapper.ClienteMapper;
import com.example.uccexample.infraestructure.model.Cliente;


@Repository
public class ClienteRepository implements IClientRepository {

    @Autowired
    private ClienteCrud clienteCrud;

    @Autowired
    private ClienteMapper clienteMapper;

    @Override
    public List<ClientDTO> getAll() {
        List<Cliente> clientes = (List<Cliente>) clienteCrud.findAll();
        return clienteMapper.toClientDTOs(clientes);
    }
    
    @Override
    public ClientDTO save(ClientDTO clientDto) {
        Cliente cliente = clienteMapper.toCliente(clientDto);
        return clienteMapper.toClientDTO(clienteCrud.save(cliente));
    }

    @Override
    public void delete(ClientDTO clientDto) {
        Cliente cliente = clienteMapper.toCliente(clientDto);
        clienteCrud.delete(cliente);
    }

    @Override
    public ClientDTO findById(Long id) {
        Optional<Cliente> cliente = clienteCrud.findById(id);
        return cliente.map(c -> clienteMapper.toClientDTO(c)).orElse(null);
    }
}