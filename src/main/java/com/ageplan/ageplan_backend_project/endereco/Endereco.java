package com.ageplan.ageplan_backend_project.endereco;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Endereco implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    //------------------------------------------------------
    @Id
    private Long id;
    //------------------------------------------------------
    private String cep;
    private String tipoLogradouro;
    private String nomeLogradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco endereco)) return false;

        return getId().equals(endereco.getId()) && getCep().equals(endereco.getCep()) && getTipoLogradouro().equals(endereco.getTipoLogradouro()) && getNomeLogradouro().equals(endereco.getNomeLogradouro()) && getNumero().equals(endereco.getNumero()) && getComplemento().equals(endereco.getComplemento()) && getBairro().equals(endereco.getBairro()) && getCidade().equals(endereco.getCidade()) && getUf().equals(endereco.getUf());
    }

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
}