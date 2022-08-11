package com.desafiobackend.financasfamiliar.domain.repository;

import com.desafiobackend.financasfamiliar.domain.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceitaRepository extends JpaRepository<Receita, Integer> {
}
