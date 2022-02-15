package com.netflop.service;

import com.netflop.model.Resenha;
import com.netflop.repository.ResenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResenhaService {

    @Autowired
    private ResenhaRepository resenhaRepository;

    public Resenha salvarResenha(Resenha resenha){
        return resenhaRepository.save(resenha);
    }
    public List<Resenha> listarResenha(){ return resenhaRepository.findAll(); }
}
