package com.exp2_s6_katlheen_rodriguez.exp2_s6_katlheen_rodriguez.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp2_s6_katlheen_rodriguez.exp2_s6_katlheen_rodriguez.model.Usuario;
import com.exp2_s6_katlheen_rodriguez.exp2_s6_katlheen_rodriguez.repository.UsuarioRepository;

//Implementación de los metodos del servicio
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //Obtener todos los usuarios
    @Override
    public List<Usuario> getAllUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        System.out.println("Consultando usuarios: " + usuarios);
        return usuarios;
    }

    //Obtener un usuario por id
    @Override
    public Optional<Usuario> getUsuarioById(Long id) {
        return usuarioRepository.findById(id);
    }

    //Crear un nuevo usuario
    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    //Actualizar un usuario
    @Override
    public Usuario updateUsuario(Long id, Usuario usuario) {
        if (usuarioRepository.existsById(id)) {
            usuario.setId(id);
            return usuarioRepository.save(usuario);
        } else {
            return null;
        }
    }

    // Eliminar un usuario
    @Override
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}