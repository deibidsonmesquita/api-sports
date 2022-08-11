package com.apisports.repository;

import com.apisports.models.Partida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface PartidasRepositorio extends JpaRepository<Partida, Long> {

    @Query("SELECT p FROM Partida p WHERE p.dataHora = :data")
    List<Partida> findAllByData(@Param("data") LocalDateTime data);

    @Query(value = "select * from partida where campeonato_id = :id and aovivo = 'Y'", nativeQuery = true)
    Optional<List<Partida>> findAllPartidasAoVivoByCampeonatoID(@Param("id") Integer id);

    @Query("SELECT p FROM Partida p WHERE p.campeonato.id = :id")
    Optional<List<Partida>> findAllPartidasByCampeonatoID(@Param("id") Integer id);
}
