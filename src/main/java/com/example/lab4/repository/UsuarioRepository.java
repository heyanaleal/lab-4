package com.example.lab4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab4.entity.Usuario;

// COLOCAR NOME CLASS E TIPO DE ID
public interface UsuarioRepository extends JpaRepository <Usuario, Long > {
    
}
