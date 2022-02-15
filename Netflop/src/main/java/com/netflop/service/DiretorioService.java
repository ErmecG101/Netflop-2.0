package com.netflop.service;

import com.netflop.model.Diretorio;
import com.netflop.repository.DiretorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretorioService {

    @Autowired
    private DiretorioRepository diretorioRepository;

        public Diretorio salvarDiretorio(Diretorio diretorio){
            return diretorioRepository.save(diretorio);

    }

    public List<Diretorio> listarDiretorio(){
            return diretorioRepository.findAll();
    }
}
