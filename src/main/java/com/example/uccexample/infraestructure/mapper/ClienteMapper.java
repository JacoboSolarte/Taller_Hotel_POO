package com.example.uccexample.infraestructure.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.uccexample.domain.dto.ClientDTO;
import com.example.uccexample.infraestructure.model.Cliente;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    
    // Entidad -> DTO
    @Mapping(source = "nombre", target = "name")
    @Mapping(source = "identificacion", target = "identification")
    @Mapping(source = "telefono", target = "phone")
    ClientDTO toClientDTO(Cliente cliente);

    @Mapping(source = "nombre", target = "name")
    @Mapping(source = "identificacion", target = "identification")
    @Mapping(source = "telefono", target = "phone")
    List<ClientDTO> toClientDTOs(List<Cliente> clientes);

    // DTO -> Entidad
    @Mapping(source = "name", target = "nombre")
    @Mapping(source = "identification", target = "identificacion")
    @Mapping(source = "phone", target = "telefono")
    Cliente toCliente(ClientDTO clientDTO);
    List<Cliente> toClientes(List<ClientDTO> clientDTOs);
}
