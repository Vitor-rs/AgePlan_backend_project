package com.ageplan.ageplan_backend_project.Roles;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class RolesDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @NotNull
    @NotEmpty
    @NotBlank
    private Long id;


    @NotNull
    @NotEmpty
    @NotBlank
    private String nome;

    @NotNull
    @NotEmpty
    @NotBlank
    private String descricao;

    public RolesDto(Roles roles) {
        this.id = roles.getId();
        this.nome = roles.getNome();
        this.descricao = roles.getDescricao();
    }


}