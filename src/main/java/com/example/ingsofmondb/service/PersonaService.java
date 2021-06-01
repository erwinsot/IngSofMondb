package com.example.ingsofmondb.service;

import com.example.ingsofmondb.model.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface PersonaService {
    public Iterable<Persona> findAll();
    public Page<Persona> findAll(Pageable pageable);
    public Optional<Persona> findById(Long id);
    public Persona save(Persona user);
    public  void deleteById(Long id);

}
