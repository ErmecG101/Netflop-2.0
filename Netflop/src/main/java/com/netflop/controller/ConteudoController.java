package com.netflop.controller;

import com.netflop.model.Conteudo;
import com.netflop.service.ConteudoService;
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
@RequestMapping("/conteudos")
public class ConteudoController {

    @Autowired
    private ConteudoService service;

    @PostMapping("/save")
    public ResponseEntity<Conteudo> save(@RequestBody Conteudo conteudo){
        return new ResponseEntity<>(service.salvarConteudo(conteudo), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Conteudo> list(){
        return service.listarConteudo();
    }
}
