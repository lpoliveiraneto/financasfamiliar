package com.desafiobackend.financasfamiliar.domain.service;

import com.desafiobackend.financasfamiliar.domain.model.Receita;
import com.desafiobackend.financasfamiliar.domain.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {

    @Autowired
    ReceitaRepository receitaRepository;

    public List<Receita> listaTodasReceitas(){
        return receitaRepository.findAll();
    }
}
