package com.example.lab4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab4.entity.Usuario;
import com.example.lab4.service.IUsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
    // cada controle tem um uri diferente 

    // declarar atributos usando classe não é uma boa pratica
    @Autowired
    private IUsuarioService service;

    // usar get
    @GetMapping
    public List <Usuario> bucarTodUsuarios(){
        return service.buscarTodos();
    }

    // usar post
    // para usar o corpo usar requestBoty (json)
    @PostMapping
    public Usuario novUsuario(@RequestBody Usuario usuario){
        return service.novoUsuario(usuario);
    }

    @GetMapping(value = "/id/{usuario}")
    public Usuario buscarPorId(@PathVariable ("usuario")Long id){
         return service.buscarPorId(id);
    }
    
}
