package com.netflop.controller;

import com.netflop.model.Usuario;
import com.netflop.repository.UsuarioRepository;
import com.netflop.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario){
        return new ResponseEntity<>(service.salvarUsuario(usuario), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Usuario> list(){
        return service.listarUsuarios();
    }

    @GetMapping("/login/{email}/{senha}")
    public Optional<Usuario> login(@PathVariable String email,@PathVariable String senha){
        return service.loginUsuario(email, senha);
    }
}
