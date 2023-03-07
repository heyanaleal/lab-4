package com.example.lab4.service;

import java.util.List;

import com.example.lab4.entity.Usuario;

public interface IUsuarioService{

    // Olhar metodos do servico
    public List <Usuario> buscarTodos();
    public Usuario buscarPorId(Long id);
    public Usuario novoUsuario(Usuario usuario);
    
}
