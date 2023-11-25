package com.ageplan.ageplan_backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * A classe Pessoa representa uma pessoa física que pode ser um
 * usuário do sistema ou um cliente. Ela será abstrata para que
 * não seja mapeada no banco de dados, mas sim suas subclasses
 * como as classes Instrutor e Aluno.
 */


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa extends Usuario {

    private String nomeCompleto;

    @NotEmpty
    @NotNull
    @NotBlank
    @Column(columnDefinition = "char(11)", unique = true, nullable = false)
    private String cpf;

    @NotEmpty
    @NotNull
    @NotBlank
    @Column(columnDefinition = "char(9)", unique = true, nullable = false)
    private String rg;

    @NotEmpty
    @NotNull
    @NotBlank
    @Column(columnDefinition = "char(10)", nullable = false)
    private String telefone;

    private String endereco;
    private String cidade;
    private String estado;
    private String cep;


}