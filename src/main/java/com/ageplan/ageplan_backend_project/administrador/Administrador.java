package com.ageplan.ageplan_backend_project.administrador;

import com.ageplan.ageplan_backend_project.professor.Professor;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Entity
@Getter
@NoArgsConstructor
public class Administrador extends Professor {

    private String cargo;

    /*
      O administrador é uma pessoa que tem a role/função ROLE_ADMIN. Ele não terá atributos exclusivos,
      apenas permissão para gerenciar Instrutores e Alunos. Haverá apenas métodos para listar, adicionar,
      editar e excluir Instrutores e Alunos e também definir o papel(role) que um Instrutor ou Aluno terá.


      Segue um caso:
       - Vitor: Instrutor/Professor de Matemática e Estatística
       - Viviane: Aluna de Vitor
       - João: Aluno de Vitor e Instrutor/Professor de Contabilidade, pois ele trabalha com Vitor como Professor
       assistente.

       - Vitor além de ser Instrutor, também é um administrador, por ser dono do negócio, logo
         ele pode gerenciar todos os Instrutores e Alunos, e também pode definir o papel de João.

       - João tem função de Instrutor e Aluno, pois ele é Instrutor de Contabilidade e Aluno de Vitor,
       por conta disso ele também pode gerenciar Alunos, mas não pode definir papéis.

       - Para evitar repetição de código, a classe Instrutor tem métodos para gerenciar Alunos, logo
         a classe administrador pode herdar essas funcionalidades.

    */

    // Métodos para gerenciar Instrutores e Alunos
//
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
//    public void listarInstrutores() {
//
//        // Listar Instrutores
//    }




}