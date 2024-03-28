package com.ageplan.ageplan_backend_project.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * The interface Usuario repository.
 */
@NoRepositoryBean
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}