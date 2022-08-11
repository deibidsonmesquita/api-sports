package com.apisports.controllers;

import com.apisports.Dtos.CampeonatoDTO;
import com.apisports.models.Campeonato;
import com.apisports.repository.CampeonatoRepositorio;
import com.apisports.utils.NaoEncontradoExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/campeonato")
@CrossOrigin(value = "*")
public class CampeonatoController {
    @Autowired
    private CampeonatoRepositorio repositorio;

    @GetMapping("/all")
    public List<CampeonatoDTO> listaCampeonatos() {
        var lista = repositorio.findAll();
        List<CampeonatoDTO> campeonatos = lista.stream().map(CampeonatoDTO::new).toList();
        return campeonatos;
    }

    @PostMapping("/registrar")
    public ResponseEntity registrar(@RequestBody @Valid Campeonato campeonato) {
        return new ResponseEntity(repositorio.save(campeonato), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Campeonato> campeonatoByID(@PathVariable Integer id) {
        return ResponseEntity.ok(repositorio.findById(id)
                .orElseThrow(() -> new NaoEncontradoExceptions("Campeonato não encontrado")));
    }


}
