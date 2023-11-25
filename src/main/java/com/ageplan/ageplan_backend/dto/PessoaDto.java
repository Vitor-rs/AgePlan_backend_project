package com.ageplan.ageplan_backend.dto;

import com.ageplan.ageplan_backend.entity.Pessoa;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


/**
 * DTO para {@link Pessoa}
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class PessoaDto extends UsuarioDto {

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

    public PessoaDto(Pessoa pessoa) {
        super(pessoa);
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

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


}