package com.ageplan.ageplan_backend_project.Usuario;

import com.ageplan.ageplan_backend_project.Roles.Roles;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Classe abstrata que representa um usuário do sistema. Será anotada
 * com a annotation @MappedSuperclass para que ela não seja mapeada no
 * banco de dados, mas sim suas subclasses. Ela também terá configurações
 * de segurança, onde será usado o Spring Security para autenticação e
 * autorização de usuários.
 */
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class Usuario implements UserDetails, Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /*----------------------------------------------------------------*/

    private String nomeUsuario;

    @NotNull
    @NotBlank
    @NotEmpty
    @Column(unique = true, nullable = false)
    private String senha;

    @NotNull
    @NotBlank
    @NotEmpty
    @Column(unique = true, nullable = false)
    private String email;

    // Atritubo de relação com a classe Role onde muitos usuários podem ter uma ou mais roles

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "usuario_roles",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "roles_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"usuario_id", "roles_id"}),
            foreignKey = @ForeignKey(name = "fk_usuario_id"),
            inverseForeignKey = @ForeignKey(name = "fk_roles_id")
    )
    private Set<Roles> roles = new HashSet<>();

    /*----------------------------------------------------------------*/

    // Métodos da interface UserDetails

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    /*----------------------------------------------------------------*/
    // Métodos da classe Usuario

    /**
     * Add role.
     *
     * @param role the role
     */
    public void addRole(Roles role) {
        this.roles.add(role);
    }

    /**
     * Remove role.
     *
     * @param role the role
     */
    public void removeRole(Roles role) {
        this.roles.remove(role);
    }

    /**
     * Has role boolean.
     *
     * @param role the role
     * @return the boolean
     */
    public boolean hasRole(Roles role) {
        return this.roles.contains(role);
    }


    /*----------------------------------------------------------------*/
    // Setters

    /**
     * Sets nome usuario.
     *
     * @param nomeUsuario the nome usuario
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
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
    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }


    /*----------------------------------------------------------------*/
    // Métodos da classe Object


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        return Objects.equals(getId(), usuario.getId()) &&
                Objects.equals(getNomeUsuario(), usuario.getNomeUsuario()) &&
                Objects.equals(getSenha(), usuario.getSenha()) &&
                Objects.equals(getEmail(), usuario.getEmail()) &&
                Objects.equals(getRoles(), usuario.getRoles());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getId(),
                getNomeUsuario(),
                getSenha(),
                getEmail(),
                getRoles());
    }
}