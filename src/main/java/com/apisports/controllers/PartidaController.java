package com.apisports.controllers;

import com.apisports.models.Partida;
import com.apisports.repository.PartidasRepositorio;
import com.apisports.utils.NaoEncontradoExceptions;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/partida")
@CrossOrigin(value = "*")
public class PartidaController {

    private PartidasRepositorio repositorio;

    private PartidaController(PartidasRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Partida>> listaTodasPartidas(){
        return ResponseEntity.ok(repositorio.findAll());
    }

    @GetMapping("/{data}/all")
    public ResponseEntity<List<Partida>> partidasByData(@PathVariable LocalDateTime data){
        return ResponseEntity.ok(repositorio.findAll());
    }

    @GetMapping("/{id}/campeonato")
    public ResponseEntity<List<Partida>> partidasByCampeonatoID(@PathVariable Integer id) {
        return ResponseEntity.ok(repositorio.findAllPartidasByCampeonatoID(id)
                .orElseThrow(() -> new NaoEncontradoExceptions("Partidas do Campeonato não encontradas")));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Partida> partidaByID(@PathVariable Long id){
        return ResponseEntity.ok(repositorio.findById(id)
                .orElseThrow(() -> new NaoEncontradoExceptions("Partida não encontrada")));
    }

    @GetMapping("/{id}/aovivo")
    public ResponseEntity<List<Partida>> partidaAoVivoByCampeonatoID(@PathVariable Integer id){
        return ResponseEntity.ok(repositorio.findAllPartidasAoVivoByCampeonatoID(id)
                .orElseThrow(() -> new NaoEncontradoExceptions("Partidas ao vivo não encontradas")));
    }
}
