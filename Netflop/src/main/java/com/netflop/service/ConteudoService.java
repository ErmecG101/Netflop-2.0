package com.netflop.service;

import com.netflop.model.Conteudo;
import com.netflop.repository.ConteudoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConteudoService {

@Autowired
private ConteudoRepository conteudoRepository;

    public Conteudo salvarConteudo(Conteudo conteudo){
        return conteudoRepository.save(conteudo);
    }

    public List<Conteudo> listarConteudo(){
        return conteudoRepository.findAll();
    }
}
