package com.ageplan.ageplan_backend.dto;

import com.ageplan.ageplan_backend.entity.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

/**
 * DTO para {@link Usuario}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class UsuarioDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @NotNull
    @NotEmpty
    @NotBlank
    private Long id;

    private String nomeUsuario;

    @NotNull
    @NotEmpty
    @NotBlank
    private String senha;

    @NotNull
    @NotEmpty
    @NotBlank
    private String email;

    private Set<RolesDto> roles;

    /**
     * Instantiates a new Usuario dto.
     *
     * @param usuario the usuario
     */
    public UsuarioDto(Usuario usuario) {
        this.id = usuario.getId();
        this.nomeUsuario = usuario.getNomeUsuario();
        this.senha = usuario.getSenha();
        this.email = usuario.getEmail();
    }

    // Setters

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Sets nome usuario.
     *
     * @param nomeUsuario the nome usuario
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    /**
     * Sets senha.
     *
     * @param senha the senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets roles.
     *
     * @param roles the roles
     */
    public void setRoles(Set<RolesDto> roles) {
        this.roles = roles;
    }

}