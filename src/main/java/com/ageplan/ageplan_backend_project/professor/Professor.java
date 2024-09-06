package com.ageplan.ageplan_backend_project.professor;

import com.ageplan.ageplan_backend_project.pessoa.Pessoa;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor
public class Professor extends Pessoa {

    private String especialidade;
    private String formacao;
    private String experiencia;
    private String curriculo;
    private String areaAtuacao;
    private String disciplina;


}
