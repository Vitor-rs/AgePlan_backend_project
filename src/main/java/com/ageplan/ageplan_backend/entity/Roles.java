package com.ageplan.ageplan_backend.entity;

/**
 * A classe Roles representa os papéis que um usuário pode ter no sistema.
 * No caso temos a classe Instrutor e Aluno que herdam da classe abstract Pessoa
 * que por sua vez herda da classe abstract Usuario. A classe Usuario é a classe
 * que representa um usuário do sistema, e ela é anotada com a annotation
 *
 * @MappedSuperclass para que ela não seja mapeada no banco de dados, mas sim
 * suas subclasses. Ela também terá configurações de segurança, onde será usado
 * o Spring Security para autenticação e autorização de usuários.
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * The type Roles.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Roles implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /*----------------------------------------------------------------*/

    private String nomeRole;

}