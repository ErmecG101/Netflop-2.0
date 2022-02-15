package com.netflop.service;

import com.netflop.model.Perfil;
import com.netflop.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

    public Perfil salvarPerfil(Perfil perfil){
        return perfilRepository.save(perfil);
    }

    public List<Perfil> listarPerfils(){
        return perfilRepository.findAll();
    }
}
