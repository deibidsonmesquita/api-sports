package com.apisports.repository;

import com.apisports.models.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepositorio extends JpaRepository<Jogador, Integer> {
}
