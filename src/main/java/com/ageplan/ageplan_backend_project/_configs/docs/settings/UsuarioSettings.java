package com.ageplan.ageplan_backend_project._configs.docs.settings;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class UsuarioSettings implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;




}
