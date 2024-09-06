package com.ageplan.ageplan_backend_project.endereco;

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
 * A classe EnderecoDTO é um objeto de transferência de dados que representa um endereço.
 * Esta classe é usada para transferir dados entre processos de forma eficiente.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class EnderecoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Identificador único do endereço.
     */
    @NotBlank
    @NotNull
    @NotEmpty
    @Column(nullable = false)
    private Long id;

    /**
     * Código de Endereçamento Postal (CEP).
     */
    private String cep;

    /**
     * Tipo de logradouro (ex: Rua, Avenida).
     */
    private String tipoLogradouro;

    /**
     * Nome do logradouro.
     */
    private String nomeLogradouro;

    /**
     * Número do endereço.
     */
    private String numero;

    /**
     * Complemento do endereço.
     */
    private String complemento;

    /**
     * Bairro do endereço.
     */
    @NotNull
    @NotEmpty
    @NotBlank
    @Column(nullable = false)
    private String bairro;

    /**
     * Cidade do endereço.
     */
    @NotNull
    @NotEmpty
    @NotBlank
    @Column(nullable = false)
    private String cidade;

    /**
     * Unidade Federativa (UF) do endereço.
     */
    @NotNull
    @NotEmpty
    @NotBlank
    @Column(nullable = false)
    private String uf;

    /**
     * Construtor que cria um EnderecoDTO a partir de uma entidade Endereco.
     *
     * @param endereco a entidade Endereco
     */
    public EnderecoDTO(Endereco endereco) {
        this.id = endereco.getId();
        this.cep = endereco.getCep();
        this.tipoLogradouro = endereco.getTipoLogradouro();
        this.nomeLogradouro = endereco.getNomeLogradouro();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.bairro = endereco.getBairro();
        this.cidade = endereco.getCidade();
        this.uf = endereco.getUf();
    }

    // Métodos setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * Verifica se este objeto é igual a outro objeto.
     *
     * @param o o objeto a ser comparado
     * @return true se os objetos forem iguais, false caso contrário
     */
    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnderecoDTO that)) return false;

        return getId().equals(that.getId()) &&
                getCep().equals(that.getCep()) &&
                getTipoLogradouro().equals(that.getTipoLogradouro()) &&
                getNomeLogradouro().equals(that.getNomeLogradouro()) &&
                getNumero().equals(that.getNumero()) &&
                getComplemento().equals(that.getComplemento()) &&
                getBairro().equals(that.getBairro()) &&
                getCidade().equals(that.getCidade()) &&
                getUf().equals(that.getUf());
    }

    /**
     * Calcula o código hash para este objeto.
     *
     * @return o código hash
     */
    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getCep().hashCode();
        result = 31 * result + getTipoLogradouro().hashCode();
        result = 31 * result + getNomeLogradouro().hashCode();
        result = 31 * result + getNumero().hashCode();
        result = 31 * result + getComplemento().hashCode();
        result = 31 * result + getBairro().hashCode();
        result = 31 * result + getCidade().hashCode();
        result = 31 * result + getUf().hashCode();
        return result;
    }

    /**
     * Retorna uma representação em string deste objeto.
     *
     * @return uma representação em string
     */
    @Override
    public String toString() {
        return "EnderecoDTO{" +
                "numero='" + numero + '\'' +
                ", id=" + id +
                ", cep='" + cep + '\'' +
                ", tipoLogradouro='" + tipoLogradouro + '\'' +
                ", nomeLogradouro='" + nomeLogradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }


}