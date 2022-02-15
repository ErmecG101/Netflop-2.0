package com.netflop.controller;

import com.netflop.model.Usuario;
import com.netflop.service.UsuarioService;
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
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping("/save")
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario){
        return new ResponseEntity<>(service.salvarUsuario(usuario), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Usuario> list(){
        return service.listarUsuarios();
    }
}
