package com.ageplan.ageplan_backend_project.pessoa;

import com.ageplan.ageplan_backend_project.usuario.UsuarioRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * The interface pessoa repository.
 */
@NoRepositoryBean
public interface PessoaRepository extends UsuarioRepository {
}