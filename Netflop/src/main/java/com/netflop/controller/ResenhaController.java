package com.netflop.controller;

import com.netflop.model.Resenha;
import com.netflop.service.ResenhaService;
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
@RequestMapping("/resenhas")
public class ResenhaController {

    @Autowired
    private ResenhaService service;

    @PostMapping("/save")
    public ResponseEntity<Resenha> save(@RequestBody Resenha resenha){
        return new ResponseEntity<>(service.salvarResenha(resenha), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Resenha> list(){
        return service.listarResenha();
    }
}
