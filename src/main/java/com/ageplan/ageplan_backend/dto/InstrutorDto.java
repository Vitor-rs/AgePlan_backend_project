package com.ageplan.ageplan_backend.dto;

import com.ageplan.ageplan_backend.entity.Instrutor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * DTO for {@link com.ageplan.ageplan_backend.entity.Instrutor}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class InstrutorDto extends PessoaDto {

    private String especialidade;

    // Construtor usando a classe Instrutor como parâmetro

    public InstrutorDto(Instrutor instrutor) {
        super(instrutor);
        this.especialidade = instrutor.getEspecialidade();
    }

    // Setter

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


}