package com.ageplan.ageplan_backend.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * A classe Instrutor representa um instrutor que pode ser um usuário com
 * a role/função ROLE_INSTRUTOR. Ela não é abstrata para que seja mapeada
 * no banco de dados.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Instrutor extends Pessoa {

    private String especialidade;


}