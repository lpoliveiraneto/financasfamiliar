package com.desafiobackend.financasfamiliar.domain.service;

import com.desafiobackend.financasfamiliar.domain.model.Despesa;
import com.desafiobackend.financasfamiliar.domain.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {

    @Autowired
    DespesaRepository despesaRepository;

    public List<Despesa> listaTodasDespesa(){
        return despesaRepository.findAll();
    }
}
