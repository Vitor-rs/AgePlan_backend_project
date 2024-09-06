package com.ageplan.ageplan_backend_project.endereco;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.Serial;
import java.io.Serializable;
import java.util.Map;

/**
 * A classe Endereco representa um endereço com atributos como CEP, tipo de logradouro, nome do logradouro, número, complemento, bairro, cidade e UF.
 * Esta classe é uma entidade JPA e um componente Spring.
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Component
public class Endereco implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Identificador único do endereço.
     */
    @Id
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
    private String bairro;

    /**
     * Cidade do endereço.
     */
    private String cidade;

    /**
     * Unidade Federativa (UF) do endereço.
     */
    private String uf;

    /**
     * RestTemplate para realizar chamadas HTTP.
     */
    private transient RestTemplate restTemplate;

    /**
     * Construtor que injeta o RestTemplate.
     *
     * @param restTemplate o RestTemplate a ser injetado
     */
    public Endereco(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Método que preenche os campos cidade e UF com base no CEP utilizando a API Via Cep.
     * Este método é executado antes de persistir a entidade e após carregá-la.
     */
    @PrePersist
    @PostLoad
    public void preencherEndereco() {
        if (this.cep != null && (this.uf == null || this.cidade == null)) {
            String url = "https://viacep.com.br/ws/" + this.cep + "/json/";
            ResponseEntity<Map<String, String>> response = restTemplate.exchange(
                    url,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<>() {
                    }
            );
            Map<String, String> responseBody = response.getBody();
            if (responseBody != null) {
                this.uf = responseBody.get("uf");
                this.cidade = responseBody.get("localidade");
            }
        }
    }

    /**
     * Verifica se este endereço é igual a outro objeto.
     *
     * @param o o objeto a ser comparado
     * @return true se os objetos forem iguais, false caso contrário
     */
    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco endereco)) return false;

        return getId().equals(endereco.getId()) &&
                getCep().equals(endereco.getCep()) &&
                getTipoLogradouro().equals(endereco.getTipoLogradouro()) &&
                getNomeLogradouro().equals(endereco.getNomeLogradouro()) &&
                getNumero().equals(endereco.getNumero()) &&
                getComplemento().equals(endereco.getComplemento()) &&
                getBairro().equals(endereco.getBairro()) && getCidade().equals(endereco.getCidade()) && getUf().equals(endereco.getUf());
    }

    /**
     * Calcula o código hash para este endereço.
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


}