package com.netflop.controller;

import com.netflop.model.Genero;
import com.netflop.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    @Autowired
    private GeneroService service;

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Genero genero){
        return new ResponseEntity<>(service.salvarGenero(genero), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Genero> list(){
        return service.listarGeneros();
    }

    @GetMapping("/{id}")
    public Optional<Genero> proc(Long id){ return service.listarGenero(id);}
}
