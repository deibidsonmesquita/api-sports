package com.apisports.controllers;

import com.apisports.models.Cliente;
import com.apisports.repository.ClienteRepositorio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cliente")
@CrossOrigin(value = "*")
public class ClienteController {

    private ClienteRepositorio repositorio;

    private ClienteController(ClienteRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @PostMapping("/registrar")
    public ResponseEntity registrar(@RequestBody @Valid Cliente cliente) {
        return new ResponseEntity(repositorio.save(cliente), HttpStatus.CREATED);
    }
}
