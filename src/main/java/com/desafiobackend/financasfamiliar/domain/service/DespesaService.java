package com.desafiobackend.financasfamiliar.domain.service;

import com.desafiobackend.financasfamiliar.domain.model.Despesa;
import com.desafiobackend.financasfamiliar.domain.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DespesaService {

    @Autowired
    DespesaRepository despesaRepository;

    public List<Despesa> listaTodasDespesa(){
        return despesaRepository.findAll();
    }

    //Refatorar melhor o método.
    public Despesa buscaDespesa(Integer id) {
        Optional<Despesa> despesaOptional = despesaRepository.findById(id);
        return despesaOptional.get();
    }

    public Despesa salvarDespesa(Despesa despesa) {
        return despesaRepository.save(despesa);
    }
}
