package com.apisports.controllers;

import com.apisports.models.Clube;
import com.apisports.repository.ClubeRepositorio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clube")
public class ClubeController {
    private ClubeRepositorio repositorio;

    private ClubeController(ClubeRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Clube>> listaClubes() {
        return ResponseEntity.ok(repositorio.findAll());
    }

    @PostMapping("/registrar")
    public ResponseEntity registrar(@RequestBody @Valid Clube clube) {
        return new ResponseEntity(repositorio.save(clube), HttpStatus.CREATED);
    }
}
