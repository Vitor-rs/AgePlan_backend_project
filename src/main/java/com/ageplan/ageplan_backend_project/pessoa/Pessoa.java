package com.ageplan.ageplan_backend_project.pessoa;

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

/**
 * A classe pessoa representa uma pessoa física que pode ser um
 * usuário do sistema ou um cliente. Ela será abstrata para que
 * não seja mapeada no banco de dados, mas sim suas subclasses
 * como as classes Instrutor e Aluno.
 */
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Pessoa implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nome completo da pessoa.
     */
    private String nomeCompleto;

    /**
     * CPF da pessoa.
     */
    @NotEmpty
    @NotNull
    @NotBlank
    @Column(columnDefinition = "char(11)", unique = true, nullable = false)
    private String cpf;

    /**
     * RG da pessoa.
     */

    @NotNull
    @NotBlank
    @Column(columnDefinition = "char(9)", unique = true, nullable = false)
    private String rg;

    /**
     * Telefone da pessoa.
     */
    @NotEmpty
    @NotNull
    @NotBlank
    @Column(columnDefinition = "char(10)", nullable = false)
    private String telefone;

    /**
     * Endereço da pessoa.
     */
    private String endereco;

    /**
     * Cidade da pessoa.
     */
    private String cidade;

    /**
     * Estado da pessoa.
     */
    private String estado;

    /**
     * CEP da pessoa.
     */
    private String cep;
}