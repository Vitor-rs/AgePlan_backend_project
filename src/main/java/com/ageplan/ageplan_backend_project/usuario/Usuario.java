package com.ageplan.ageplan_backend_project.usuario;

import com.ageplan.ageplan_backend_project.privilegio.Privilegios;
import com.ageplan.ageplan_backend_project.roles.Roles;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
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
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*----------------------------------------------------------------*/


    @NotNull
    @NotBlank
    @NotEmpty
    @Column(nullable = false)
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

    @NotNull
    @NotBlank
    @NotEmpty
    @Column(unique = true, nullable = false)
    private String numeroCelular;

    // Atritubo de relação com a classe Role onde muitos usuários podem ter uma ou mais roles

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "usuario_roles",
            joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "roles_id", referencedColumnName = "id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"usuario_id", "roles_id"}),
            foreignKey = @ForeignKey(name = "fk_usuario_id"),
            inverseForeignKey = @ForeignKey(name = "fk_roles_id")
    )
    private Set<Roles> roles = new HashSet<>();


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "usuario_privilegios",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "privilegio_id")
    )
    private Set<Privilegios> privilegios = new HashSet<>();

    /*----------------------------------------------------------------*/

    // Métodos da interface UserDetails

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public String getPassword() {
//        return null;
//    }
//
//    @Override
//    public String getUsername() {
//        return null;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return false;
//    }

    /*----------------------------------------------------------------*/
    // Métodos da classe usuario

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
    // PRIVILEGIOS

    public void addPrivilegio(Privilegios privilegio) {
        this.privilegios.add(privilegio);
        privilegio.getUsuarios().add(this);
    }

    public void removePrivilegio(Privilegios privilegio) {
        this.privilegios.remove(privilegio);
        privilegio.getUsuarios().remove(this);
    }

    public boolean hasPrivilegio(Privilegios privilegio) {
        return this.privilegios.contains(privilegio);
    }


    /*----------------------------------------------------------------*/
    // Setters

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