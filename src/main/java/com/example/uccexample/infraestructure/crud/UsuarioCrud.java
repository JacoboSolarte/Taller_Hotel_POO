package com.example.uccexample.infraestructure.crud;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.uccexample.infraestructure.model.Usuario;

@Repository
public interface UsuarioCrud extends CrudRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
}