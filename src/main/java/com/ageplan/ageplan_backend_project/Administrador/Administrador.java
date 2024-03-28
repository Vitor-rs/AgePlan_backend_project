package com.ageplan.ageplan_backend_project.Administrador;

import com.ageplan.ageplan_backend_project.Pessoa.Pessoa;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Administrador extends Pessoa {

    /*
      O Administrador é uma pessoa que tem a role/função ROLE_ADMIN. Ele não terá atributos exclusivos,
      apenas permissão para gerenciar Instrutores e Alunos. Haverá apenas métodos para listar, adicionar,
      editar e excluir Instrutores e Alunos e também definir o papel(role) que um Instrutor ou Aluno terá.


      Segue um caso:
       - Vitor: Instrutor/Professor de Matemática e Estatística
       - Viviane: Aluna de Vitor
       - João: Aluno de Vitor e Instrutor/Professor de Contabilidade, pois ele trabalha com Vitor como Professor
       assistente.

       - Vitor além de ser Instrutor, também é um Administrador, por ser dono do negócio, logo
         ele pode gerenciar todos os Instrutores e Alunos, e também pode definir o papel de João.

       - João tem função de Instrutor e Aluno, pois ele é Instrutor de Contabilidade e Aluno de Vitor,
       por conta disso ele também pode gerenciar Alunos, mas não pode definir papéis.

       - Para evitar repetição de código, a classe Instrutor tem métodos para gerenciar Alunos, logo
         a classe Administrador pode herdar essas funcionalidades.

    */

    /*
     Diagram em PantUml para ilustrar a relação entre as classes Administrador, Instrutor e Aluno

    @startuml
    class Administrador {
        Instrutor instrutor
        Aluno aluno
    }
    class Instrutor {
        Aluno aluno
    }
    class Aluno {
    }

    Administrador "1" -- "1..*" Instrutor
    Administrador "1" -- "1..*" Aluno
    Instrutor "1" -- "1..*" Aluno
    @enduml


    */


}