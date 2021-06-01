package com.example.ingsofmondb.service;

import com.example.ingsofmondb.dao.personaRepository;
import com.example.ingsofmondb.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
public class PersonaServiceImpl implements  PersonaService{

    @Autowired
    private com.example.ingsofmondb.dao.personaRepository personaRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Page<Persona> findAll(Pageable pageable) {
        return personaRepository.findAll(pageable);
    }

    @Override
    public Optional<Persona> findById(Long id) {
        return personaRepository.findById(id);
    }

    @Override
    public Persona save(Persona user) {
        return personaRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        personaRepository.deleteById(id);
    }
}
