package com.ageplan.ageplan_backend.repository;

import com.ageplan.ageplan_backend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}