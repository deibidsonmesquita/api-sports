package com.apisports.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NaoEncontradoExceptions extends RuntimeException{

    public NaoEncontradoExceptions() {
        super();
    }

    public NaoEncontradoExceptions(String message) {
        super(message);
    }
}
