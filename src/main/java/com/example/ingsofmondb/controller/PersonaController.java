package com.example.ingsofmondb.controller;


import com.example.ingsofmondb.model.Persona;
import com.example.ingsofmondb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Home/Eatadisticas")
@CrossOrigin("*")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping
    public ResponseEntity<?>crete(@RequestBody Persona persona){
        Persona obj=personaService.save(persona);
        return  new ResponseEntity<Persona>(obj,HttpStatus.OK);

    }
    @GetMapping("/{id}")
    public ResponseEntity<?>read(@PathVariable Long id){
        Optional<Persona> oPersona=personaService.findById(id);
        if(!oPersona.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok(oPersona);
    }
}
