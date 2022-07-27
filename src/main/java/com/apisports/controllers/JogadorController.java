package com.apisports.controllers;

import com.apisports.models.Clube;
import com.apisports.models.Jogador;
import com.apisports.repository.JogadorRepositorio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    private JogadorRepositorio repositorio;

    private JogadorController(JogadorRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @PostMapping("/registrar")
    public ResponseEntity registrar(@RequestBody @Valid Jogador jogador) {
        return new ResponseEntity(repositorio.save(jogador), HttpStatus.CREATED);
    }
}
