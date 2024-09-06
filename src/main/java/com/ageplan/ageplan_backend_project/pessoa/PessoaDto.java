package com.ageplan.ageplan_backend_project.pessoa;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;


/**
 * DTO para {@link Pessoa}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class PessoaDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @NotEmpty
    @NotNull
    @NotBlank
    @Column(nullable = false)
    private Long id;

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

    /*----------------------------------------------------------------------*/

    /**
     * Instantiates a new pessoa dto.
     *
     * @param pessoa the pessoa
     */
    protected PessoaDto(Pessoa pessoa) {
        super();
        this.nomeCompleto = pessoa.getNomeCompleto();
        this.cpf = pessoa.getCpf();
        this.rg = pessoa.getRg();
        this.telefone = pessoa.getTelefone();
        this.endereco = pessoa.getEndereco();
        this.cidade = pessoa.getCidade();
        this.estado = pessoa.getEstado();
        this.cep = pessoa.getCep();
    }

    // Setters

    /**
     * Sets nome completo.
     *
     * @param nomeCompleto the nome completo
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**
     * Sets cpf.
     *
     * @param cpf the cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Sets rg.
     *
     * @param rg the rg
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * Sets telefone.
     *
     * @param telefone the telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Sets endereco.
     *
     * @param endereco the endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Sets cidade.
     *
     * @param cidade the cidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Sets estado.
     *
     * @param estado the estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Sets cep.
     *
     * @param cep the cep
     */
    public void setCep(String cep) {
        this.cep = cep;
    }


}