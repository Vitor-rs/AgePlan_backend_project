package com.ageplan.ageplan_backend.Roles;

public enum Role {

    /** Haverão as seguintes entidades no sistema:

       Usuario que é uma MappedSuperclass e abstrata
       Pessoa que é uma classe abstrata
       Administrador
       Instrutor
       Aluno

       A classe Usuario será usada para efetuar a autenticação no sistema.

       Os papéis de Administrador, Instrutor e Aluno serão usados para definir as permissões de cada usuário.
       Logo um usuário poderá ter mais de um papel, como um Intrutor que também é Aluno, ou um Administrador que também é Instrutor.

       Isso é feito por meio de uma tabela de relacionamento.

    */

    ADMIN, INSTRUCTOR, STUDENT;

    // O Spring Security espera que os papéis sejam prefixados com "ROLE_"
    public String getAuthority() {
        return "ROLE_" + name();
    }
    public String getRole() {
        return name();
    }

    public String getRoleName() {
        return name();
    }

    public String getRoleNameCapitalized() {
        return name().substring(0, 1).toUpperCase() + name().substring(1);
    }

}