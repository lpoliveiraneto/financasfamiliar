package com.desafiobackend.financasfamiliar.api.controller;

import com.desafiobackend.financasfamiliar.domain.model.Receita;
import com.desafiobackend.financasfamiliar.domain.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/receitas")
@RestController
public class ReceitaController {

    @Autowired
    private ReceitaService receitaService;

    @PostMapping
    public ResponseEntity<Receita> saveReceita(@RequestBody Receita receita){
        Receita receitaSave = receitaService.salvarReceita(receita);
        return new ResponseEntity<>(receitaSave, HttpStatus.CREATED);
    }
}
