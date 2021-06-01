package com.example.ingsofmondb.dao;

import com.example.ingsofmondb.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface personaRepository extends MongoRepository<Persona,Long> {

}
