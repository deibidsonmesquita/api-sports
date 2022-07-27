package com.apisports.repository;

import com.apisports.models.Campeonato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampeonatoRepositorio extends JpaRepository<Campeonato, Integer> {
}
