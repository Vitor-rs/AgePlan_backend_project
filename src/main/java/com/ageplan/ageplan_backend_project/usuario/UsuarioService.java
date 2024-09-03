package com.ageplan.ageplan_backend_project.usuario;


import com.ageplan.ageplan_backend_project.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getUsuarioById(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario updateUsuario(Long id, Usuario usuarioDetails) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("usuario not found for this id :: " + id));
        usuario.setNomeUsuario(usuarioDetails.getNomeUsuario());
        usuario.setSenha(usuarioDetails.getSenha());
        usuario.setEmail(usuarioDetails.getEmail());
        usuario.setNumeroCelular(usuarioDetails.getNumeroCelular());
        usuario.setRoles(usuarioDetails.getRoles());
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("usuario not found for this id :: " + id));
        usuarioRepository.delete(usuario);
    }
}