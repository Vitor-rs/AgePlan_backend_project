package com.ageplan.ageplan_backend.dto;

import com.ageplan.ageplan_backend.entity.Roles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * DTO para {@link Roles}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RolesDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Long id;
    /*--------------------------------------------------*/

    private String nomeRole;

    /**
     * Instantiates a new Roles dto.
     *
     * @param roles the roles
     */
    /*--------------------------------------------------*/
    public RolesDto(Roles roles) {
        this.id = roles.getId();
        this.nomeRole = roles.getNomeRole();
    }


    /*--------------------------------------------------*/
    // Setters

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Sets nome role.
     *
     * @param nomeRole the nome role
     */
    public void setNomeRole(String nomeRole) {
        this.nomeRole = nomeRole;
    }


}