package com.desafiobackend.financasfamiliar.api.controller;

import com.desafiobackend.financasfamiliar.domain.model.Despesa;
import com.desafiobackend.financasfamiliar.domain.service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DespesaController {

    @Autowired
    private DespesaService despesaService;

    @GetMapping
    public List<Despesa> retrieveAllDespesa(){
        return despesaService.listaTodasDespesa();
    }

    @GetMapping("/{id}")
    public Despesa retrieveDespesa(@PathVariable Integer id){
        return despesaService.buscaDespesa(id);
    }

    @PostMapping
    public ResponseEntity<Despesa> saveDespesa(@RequestBody Despesa despesa){

        Despesa despesaSave = despesaService.salvarDespesa(despesa);
        return new ResponseEntity<>(despesaSave, HttpStatus.CREATED);
    }




}
