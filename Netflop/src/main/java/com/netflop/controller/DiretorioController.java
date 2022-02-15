package com.netflop.controller;

import com.netflop.model.Diretorio;
import com.netflop.service.DiretorioService;
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
@RequestMapping("/diretorios")
public class DiretorioController {

    @Autowired
    private DiretorioService service;

    @PostMapping("/save")
    public ResponseEntity<Diretorio> save(@RequestBody Diretorio diretorio){
        return new ResponseEntity<>(service.salvarDiretorio(diretorio), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Diretorio> list(){
        return service.listarDiretorio();
    }

}
