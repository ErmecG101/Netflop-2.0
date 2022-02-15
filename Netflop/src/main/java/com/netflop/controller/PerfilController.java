package com.netflop.controller;

import com.netflop.model.Perfil;
import com.netflop.repository.PerfilRepository;
import com.netflop.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/perfils")
public class PerfilController {

    @Autowired
    private PerfilService service;

    @PostMapping("/save")
    public ResponseEntity<Perfil> save(@RequestBody Perfil perfil){
        return new ResponseEntity<>(service.salvarPerfil(perfil), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Perfil> list(){
        return service.listarPerfils();
    }

}
