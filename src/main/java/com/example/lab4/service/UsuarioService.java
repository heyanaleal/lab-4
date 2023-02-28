package com.example.lab4.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab4.entity.Usuario;
import com.example.lab4.repository.UsuarioRepository;

@Service
public class UsuarioService {

    // service regra de negocio

    // SPRING INICIALIZA (USAR Autowired - POR VARIAVEL)
        @Autowired
        private UsuarioRepository usuarioRepo;
    
        public Usuario buscarPorId(Long id) {
            Optional<Usuario> usuarioOp = usuarioRepo.findById(id);
            if(usuarioOp.isPresent()) {
                return usuarioOp.get();
            }
            throw new IllegalArgumentException("Id inválido!");
        }
    
        public Usuario novoUsuario(Usuario usuario) {
            if(usuario == null ||
                    usuario.getNome() == null ||
                    usuario.getSenha() == null) {
                throw new IllegalArgumentException("Nome e senha inválidos!");
            }
            return usuarioRepo.save(usuario);
        }
    
    }