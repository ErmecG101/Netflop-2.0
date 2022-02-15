package com.netflop.service;

import com.netflop.model.Genero;
import com.netflop.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    public Genero salvarGenero(Genero genero){
        return generoRepository.save(genero);
    }

    public List<Genero> listarGeneros(){
        return generoRepository.findAll();
    }

    public Optional<Genero> listarGenero(Long genero) { return generoRepository.findById(genero); }
}
