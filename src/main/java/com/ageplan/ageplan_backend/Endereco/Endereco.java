package com.ageplan.ageplan_backend.Endereco;

import java.io.Serial;
import java.io.Serializable;

public class Endereco implements Serializable {
    @Serial private static final long serialVersionUID = 1L;
    //------------------------------------------------------
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


}