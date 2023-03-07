package com.example.lab4.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNaoEncontradoExceptions extends IllegalArgumentException {
    public UsuarioNaoEncontradoExceptions() {
        super();
    }

    public UsuarioNaoEncontradoExceptions(String message) {
        super(message);
    }

    public UsuarioNaoEncontradoExceptions(String message, Throwable t) {
        super(message, t);
    }
    
}
