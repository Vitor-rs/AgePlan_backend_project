package com.ageplan.ageplan_backend_project;

import com.ageplan.ageplan_backend_project.pessoa.Pessoa;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity(name = "professorEntity")
@AllArgsConstructor
@NoArgsConstructor
public class Professor extends Pessoa {


    private String especialidade;
    private String formacao;
    private String experiencia;
    private String curriculo;
    private String areaAtuacao;
    private String disciplina;






}
