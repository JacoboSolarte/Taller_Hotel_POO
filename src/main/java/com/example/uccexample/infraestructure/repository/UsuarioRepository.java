package com.example.uccexample.infraestructure.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.uccexample.infraestructure.crud.UsuarioCrud;
import com.example.uccexample.infraestructure.model.Usuario;

@Repository
public class UsuarioRepository {

    @Autowired
    private UsuarioCrud usuarioCrud;

    public List<Usuario> getAll() {
        return StreamSupport.stream(usuarioCrud.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Usuario save(Usuario usuario) {
        return usuarioCrud.save(usuario);
    }

    public void delete(Usuario usuario) {
        usuarioCrud.delete(usuario);
    }

    public Usuario findById(Long id) {
        Optional<Usuario> usuario = usuarioCrud.findById(id);
        return usuario.orElse(null);
    }

    public Usuario findByUsername(String username) {
        Optional<Usuario> usuario = usuarioCrud.findByUsername(username);
        return usuario.orElse(null);
    }
}