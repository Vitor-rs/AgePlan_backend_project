package com.ageplan.ageplan_backend_project.Usuario;

import com.ageplan.ageplan_backend_project.Roles.Roles;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * DTO para {@link Usuario}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UsuarioDto implements Serializable {
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

    @NotNull
    @NotEmpty
    @NotBlank
    private String numeroCelular;

    private Set<String> roles;

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
        this.numeroCelular = usuario.getNumeroCelular();
        this.roles = usuario.getRoles().stream()
                .map(Roles::getNome)
                .collect(Collectors.toSet());
    }

    // Setters

    /**
     * Sets id.
     *
     * @param id o id
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
     * Sets numero celular.
     *
     * @param numeroCelular the numero celular
     */
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    /**
     * Sets roles.
     *
     * @param roles the roles
     */
    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
}