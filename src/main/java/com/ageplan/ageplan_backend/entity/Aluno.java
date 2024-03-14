package com.ageplan.ageplan_backend.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * The type Aluno.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Aluno extends Pessoa {

    private String Contrato;


}