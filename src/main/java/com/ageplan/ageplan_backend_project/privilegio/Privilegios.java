package com.ageplan.ageplan_backend_project.privilegio;

import com.ageplan.ageplan_backend_project.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * A classe privilegio representa os privilégios que podem ser atribuídos aos usuários.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Privilegios {

    /**
     * Identificador único do privilégio.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nome do privilégio.
     */
    @Column(nullable = false, unique = true)
    private String nome;

    /**
     * Descrição do privilégio.
     */
    @Column(nullable = false)
    private String descricao;

    /**
     * Relação muitos-para-muitos com a classe usuario.
     */
    @ManyToMany(mappedBy = "privilegios")
    private Set<Usuario> usuarios = new HashSet<>();
}