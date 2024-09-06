# Atividade Semestral: Desenvolvimento de um Sistema Independente de Controle e Gerenciamento de Cursos Livres para Freelancers

## Sumário

- [Atividade Semestral: Desenvolvimento de um Sistema Independente de Controle e Gerenciamento de Cursos Livres para Freelancers](#atividade-semestral-desenvolvimento-de-um-sistema-independente-de-controle-e-gerenciamento-de-cursos-livres-para-freelancers)
    - [Sumário](#sumário)
    - [Resumo](#resumo)
    - [Abstract](#abstract)
- [1. Introdução](#1-introdução)
    - [1.1 Proposta do projeto](#11-proposta-do-projeto)
    - [1.2 Objetivos](#12-objetivos)
    - [1.3 Justificativa](#13-justificativa)
    - [1.4 Público-alvo](#14-público-alvo)
    - [1.5 Escopo](#15-escopo)
- [2. Requisitos](#2-requisitos)
    - [2.1 Levantamento de requisitos](#2.1-levantamento-de-requisitos)
    - [2.2 Requisitos funcionais](#2.2-requisitos-funcionais)
    - [2.3 Requisitos não funcionais](#2.3-requisitos-não-funcionais)
    - [2.4 Regras de negócio](#2.4-regras-de-negócio)
- [3. Modelagem](#3-modelagem)
    - [3.1 Diagrama de casos de uso](#31-diagrama-de-casos-de-uso)
        - [- Diagrama de casos de uso ilustrando as interações entre os usuários e o sistema:](#--diagrama-de-casos-de-uso-ilustrando-as-interações-entre-os-usuários-e-o-sistema)
- [Entregas do Projeto](#entregas-do-projeto)
    - [Etapa 1](#etapa-1)
    - [Etapa 2](#etapa-2)
    - [Etapa 3](#etapa-3)
    - [Etapa 4](#etapa-4)
    - [Etapa 5](#etapa-5)

---

## Resumo

Este trabalho apresenta o projeto de um sistema de controle e gerenciamento de cursos livres destinado a profissionais
independentes e freelancers de diversas áreas. A proposta visa fornecer uma solução autônoma e completa para que esses
profissionais possam criar, administrar e ministrar seus próprios cursos de forma personalizada e simplificada. O
contexto para este projeto é a crescente demanda por oportunidades de ensino e aprendizado, especialmente em meio à
pandemia de Covid-19, que impulsionou a busca por cursos online ministrados por profissionais autônomos.

## Abstract

This paper presents the project of a control and management system for free training courses designed for independent
professionals and freelancers from various fields. The proposal aims to provide an autonomous and comprehensive
solution, allowing these professionals to create, administer, and teach their own customized courses in a simplified
manner. The context for this project is the increasing demand for learning opportunities, particularly in the wake of
the Covid-19 pandemic, which has driven the search for online courses delivered by autonomous professionals.

# 1. Introdução

O mercado de trabalho tem passado por mudanças significativas nos últimos anos, com a ascensão de novas formas de
trabalho e a crescente demanda por profissionais autônomos e freelancers. Nesse contexto, a oferta de cursos livres e
treinamentos online tem se tornado uma alternativa cada vez mais popular para aprimorar habilidades e competências
profissionais. No entanto, muitos profissionais independentes enfrentam dificuldades para criar, administrar e ministrar
seus próprios cursos, devido à falta de ferramentas e recursos adequados. Este projeto visa suprir essa demanda,
oferecendo um sistema independente de controle e gerenciamento de cursos livres para freelancers, que permita a criação,
administração e ministração de cursos de forma personalizada e simplificada. O sistema proposto será desenvolvido com
base em tecnologias modernas e padrões de projeto, visando a segurança, escalabilidade e facilidade de uso.

## 1.1 Proposta do projeto

O projeto proposto visa desenvolver um sistema de controle e gerenciamento de cursos livres para Freelancers ou
Profissionais Liberais. Este sistema será independente, não estando vinculado ou integrado a nenhum outro existente.
Inspirou-se em sistemas como Sponte e Unified Transform.

Os profissionais independentes poderão criar seus próprios cursos de forma simplificada, definindo detalhes específicos
como ementa, duração, metodologia de ensino e recursos utilizados. Também serão responsáveis por cadastrar seus
clientes. O objetivo é facilitar a administração de aulas, oferecendo uma alternativa mais acessível e enxuta em
comparação aos sistemas existentes.

A proposta é proporcionar aos professores independentes uma ferramenta acessível e de fácil personalização para
administrar seus cursos de forma ágil e eficiente. Com o sistema, poderão gerenciar matrículas, frequências, pagamentos
e acompanhar o progresso dos alunos.

A interface do sistema será intuitiva, visando uma experiência amigável ao usuário, e medidas de segurança serão
implementadas para proteger as informações dos envolvidos.

O objetivo final é atender à demanda crescente por cursos ministrados por profissionais independentes, especialmente em
meio à pandemia de Covid-19, oferecendo uma solução autônoma, versátil e personalizável que contribua para a educação e
formação profissional.

## 1.2 Objetivos

O objetivo principal deste projeto é desenvolver um sistema independente de controle e gerenciamento de cursos livres
para freelancers, que permita a criação, administração e administração de cursos de forma personalizada e simplificada.
Para alcançar esse objetivo, os seguintes objetivos específicos foram estabelecidos:

- Desenvolver um sistema web responsivo e intuitivo, que permita a criação e administração de cursos de forma
  simplificada.id1[(Database)]

- Implementar um sistema de autenticação e autorização seguro, que proteja as informações dos usuários e garanta a
  privacidade e a integridade dos dados.
- Oferecer uma interface amigável e de fácil navegação, que proporcione uma experiência agradável ao usuário.
- Disponibilizar ferramentas de acompanhamento e análise de desempenho, que permitam aos professores acompanhar o
  progresso dos alunos e avaliar a eficácia dos cursos.
- Integrar métodos de pagamento seguros e eficientes, que facilitem a cobrança e a gestão financeira dos cursos.
- Fornecer suporte técnico e treinamento para os usuários, garantindo que possam utilizar o sistema de forma eficaz e
  produtiva.
- Garantir a escalabilidade e a manutenibilidade do sistema, permitindo que novas funcionalidades possam ser adicionadas
  e que o sistema possa ser atualizado e mantido de forma eficiente.

## 1.3 Justificativa

A justificativa para o desenvolvimento deste projeto está fundamentada na crescente demanda por cursos livres e
treinamentos online, especialmente em meio à pandemia de Covid-19, que impulsionou a busca por oportunidades de ensino e
aprendizado. Profissionais independentes e freelancers de diversas áreas têm se destacado como provedores de cursos e
treinamentos, oferecendo conhecimentos e habilidades especializadas.

No entanto, muitos desses profissionais enfrentam dificuldades para criar, administrar e ministrar seus próprios cursos,
devido à falta de ferramentas e recursos adequados. O sistema proposto visa suprir essa demanda, oferecendo uma solução
autônoma e completa que permita a criação, administração e ministração de cursos de forma personalizada e simplificada.

Além disso, o sistema proposto visa atender à necessidade de segurança e privacidade dos dados dos usuários, garantindo
que as informações dos alunos e dos professores sejam protegidas e que a integridade dos dados seja preservada.

## 1.4 Público-alvo

O público-alvo deste projeto são os profissionais independentes e freelancers de diversas áreas, que desejam criar,
administrar e ministrar seus próprios cursos de forma personalizada e simplificada. Este público inclui, mas não se
limita a:

- Professores e instrutores independentes
- Consultores e especialistas em diversas áreas
- Profissionais de educação e formação

## 1.5 Escopo

O escopo deste projeto inclui o desenvolvimento de um sistema independente de controle e gerenciamento de cursos livres
para freelancers, que permita a criação, administração e ministração de cursos de forma personalizada e simplificada. O
sistema será desenvolvido como uma aplicação web responsiva e intuitiva, que oferecerá as seguintes funcionalidades:

- Cadastro de professores e alunos
- Criação e administração de cursos
- Matrícula e acompanhamento de alunos
- Análise de desempenho e avaliação de cursos
- Gestão financeira e métodos de pagamento
- Suporte técnico e treinamento para os usuários
- Escalabilidade e manutenibilidade do sistema
- Segurança e privacidade dos dados

O sistema será desenvolvido utilizando tecnologias modernas e padrões de projeto, visando a segurança, escalabilidade e
facilidade de uso. O sistema será disponibilizado como um serviço autônomo, que poderá ser acessado por meio de um
navegador web em qualquer dispositivo.

# 2. Requisitos

## 2.1 Levantamento de requisitos

O levantamento de requisitos para o sistema de controle e gerenciamento de cursos livres para freelancers foi realizado
por meio de entrevistas com profissionais independentes e freelancers de diversas áreas, bem como por meio de pesquisas
e análises de sistemas similares. Os requisitos foram identificados e documentados com base nas necessidades e
expectativas dos usuários, visando a criação de um sistema que atenda às demandas do público-alvo.

## 2.2 Requisitos funcionais

Os requisitos funcionais do sistema de controle e gerenciamento de cursos livres para freelancers incluem as
funcionalidades que o sistema deve oferecer para atender às necessidades dos usuários. Os principais requisitos
funcionais identificados são:

- Cadastro de professores e alunos
- Criação e administração de cursos
- Matrícula e acompanhamento de alunos
- Análise de desempenho e avaliação de cursos
- Gestão financeira e métodos de pagamento

## 2.3 Requisitos não funcionais

Os requisitos não funcionais do sistema de controle e gerenciamento de cursos livres para freelancers incluem as
características e restrições que o sistema deve atender para garantir a qualidade, a segurança e a usabilidade. Os
principais requisitos não funcionais identificados são:

- Segurança e privacidade dos dados
- Escalabilidade e manutenibilidade do sistema
- Intuitividade e facilidade de uso
- Responsividade e compatibilidade com dispositivos móveis
- Desempenho e eficiência

## 2.4 Regras de negócio

As regras de negócio do sistema de controle e gerenciamento de cursos livres para freelancers incluem as diretrizes e
restrições que devem ser seguidas para garantir a eficácia e a integridade do sistema. As principais regras de negócio
identificadas são:

- Os professores devem ser responsáveis por criar e administrar seus próprios cursos
- Os alunos devem ser capazes de se matricular e acompanhar o progresso dos cursos
- Os métodos de pagamento devem ser seguros e eficientes
- As informações dos usuários devem ser protegidas e preservadas
- O sistema deve ser escalável e de fácil manutenção
- A interface do sistema deve ser intuitiva e de fácil navegação
- O sistema deve ser responsivo e compatível com dispositivos móveis

# 3. Modelagem

A modelagem do sistema de controle e gerenciamento de cursos livres para freelancers inclui a representação visual das
funcionalidades e dos componentes do sistema, por meio de diagramas de casos de uso e de classes.

## 3.1 Diagrama de casos de uso

O diagrama de casos de uso do sistema de controle e gerenciamento de cursos livres para freelancers representa as
interações entre os usuários e o sistema, identificando as funcionalidades e os fluxos de trabalho do sistema.

![diagrama](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/Vitor-rs/AgePlan_backend_project/master/docs/_backend_docs/diagramas/use_case.iuml)

### 3.1.1 Ilustrando as interações entre os usuários e o sistema:

O diagrama de casos de uso ilustra as interações entre os usuários e o sistema, identificando as funcionalidades e os
fluxos de trabalho do sistema. Os atores do sistema incluem professores, alunos e administradores, que interagem com o
sistema por meio de casos de uso como cadastrar professor, cadastrar aluno, criar curso, administrar curso, matricular
aluno, acompanhar progresso, gerenciar pagamentos, relatórios e configurações. Um ponto
a ser considerado é a relação entre Professor e Administrador, pois o próprio Professor pode ser o Administrador do
sistema, ou seja, ele pode ter acesso a todas as funcionalidades do sistema, inclusive as de administrador. Logo há a
necessidade de extender o caso de uso de Professor para Administrador.

#### Atores:

- **Administrador**: Usuário com privilégios avançados que pode gerenciar o sistema, cadastrar outros professores, além
  de realizar todas as funções disponíveis para um professor.
- **Professor**: Usuário responsável pela criação, gestão de cursos, acompanhamento de alunos e outras atividades
  relacionadas ao ensino.
- **Aluno**: Usuário que acessa o sistema para acompanhar seu progresso nos cursos.

#### Casos de Uso:

Esta tabela apresenta os casos de uso identificados no diagrama, descrevendo as funcionalidades do sistema e as
interações entre os atores.

| Sigla | Caso de Uso                 | Descrição                                                                                               | Inclui     | Extende |
|-------|-----------------------------|---------------------------------------------------------------------------------------------------------|------------|---------|
| UC1   | Realizar cadastros diversos | Representa a capacidade do sistema de realizar cadastros, como o cadastro de professores e alunos.      | UC1a, UC1b | -       |
| UC1a  | Cadastrar-se                | Permite o cadastro inicial de administradores e professores no sistema.                                 | -          | -       |
| UC1b  | Cadastrar Aluno             | Permite o cadastro de novos alunos no sistema.                                                          | -          | -       |
| UC2   | Login                       | Permite que todos os usuários façam login no sistema para acessar suas respectivas funcionalidades.     | -          | -       |
| UC3   | Criar Curso                 | Permite ao professor criar novos cursos na plataforma.                                                  | -          | -       |
| UC4   | Gerenciar Curso             | Representa as atividades de gestão de cursos realizadas pelo professor.                                 | UC4a, UC4b | -       |
| UC4a  | Editar Curso                | Permite editar os detalhes de um curso existente.                                                       | -          | -       |
| UC4b  | Remover Curso               | Permite a exclusão de um curso.                                                                         | -          | -       |
| UC6   | Acompanhar Progresso        | Disponível para os alunos, permite que acompanhem seu progresso em cursos.                              | -          | -       |
| UC7   | Gerenciar Pagamentos        | Permite ao professor gerenciar pagamentos de alunos relacionados aos cursos.                            | -          | -       |
| UC8   | Analisar Desempenho         | Permite ao professor analisar o desempenho dos alunos em cursos.                                        | UC8a       | -       |
| UC8a  | Análise por Aluno           | Análise detalhada do desempenho de um aluno específico.                                                 | -          | -       |
| UC10  | Emitir Relatórios           | Permite ao professor emitir relatórios relacionados ao desempenho dos alunos e ao andamento dos cursos. | -          | -       |
| UC11  | Gerenciar Sistema           | Permite ao administrador gerenciar as configurações do sistema.                                         | UC11a      | -       |
| UC11a | Configurar Permissões       | Configurações de permissões para diferentes usuários.                                                   | -          | -       |
| UC12  | Cadastrar Professor         | Permite ao administrador cadastrar novos professores no sistema.                                        | -          | -       |

#### Relações entre Atores e Casos de Uso:

- **Administrador**:
    - Herda todas as funcionalidades do **Professor** (`<<extends>>`).
    - Além das funções de professor, o administrador pode gerenciar o sistema (UC11), cadastrar outros professores (
      UC12) e realizar cadastros diversos (UC1).

- **Professor**:
    - Pode realizar o cadastro de alunos (UC1b), criar e gerenciar cursos (UC3 e UC4), acompanhar o progresso dos
      alunos (UC6), gerenciar pagamentos (UC7), analisar desempenho (UC8) e emitir relatórios (UC10).

- **Aluno**:
    - Pode realizar login (UC2) e acompanhar o progresso nos cursos (UC6).

### 3.1.2 Diagrama de Classes

O diagrama de classes do sistema de controle e gerenciamento de cursos livres para freelancers representa a estrutura e
os relacionamentos entre as classes do sistema, identificando as entidades e os atributos do sistema.

![cd_geral](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/Vitor-rs/AgePlan_backend_project/master/docs/_backend_docs/diagramas/cd_geral.iuml)

#### Descrição das Classes (Tabela):

Esta tabela apresenta as classes identificadas no diagrama de classes, descrevendo as entidades e os atributos do
sistema.

| Classe              | Descrição                                                                                                              |
|---------------------|------------------------------------------------------------------------------------------------------------------------|
| Professor           | Representa um professor que pode criar e gerenciar cursos.                                                             |
| Aluno               | Representa um aluno que pode se matricular em cursos e acompanhar seu progresso.                                       |
| Curso               | Representa um curso criado por um professor, com detalhes como título, descrição e carga horária.                      |
| Matrícula           | Representa a matrícula de um aluno em um curso, com informações como data de matrícula e status.                       |
| Pagamento           | Representa um pagamento realizado por um aluno para se matricular em um curso.                                         |
| Relatório           | Representa um relatório gerado por um professor, com informações sobre o desempenho dos alunos.                        |
| Configuração        | Representa as configurações do sistema, como permissões de acesso e configurações de segurança.                        |
| Usuário             | Representa um usuário do sistema, com informações como nome, e-mail e senha.                                           |
| Privilégio          | Representa os privilégios de acesso de um usuário no sistema, como leitura, escrita e administração.                   |
| Administrador       | Representa um administrador do sistema, com privilégios avançados para gerenciar o sistema.                            |
| Role                | Representa o papel de um usuário no sistema, como professor, aluno ou administrador.                                   |
| Endereço            | Representa o endereço de um usuário, com informações como rua, número, bairro e cidade.                                |
| Pessoa              | Classe abstrata da qual as classes Professor, Aluno e Administrador herdam.                                            |
| Contrato            | Representa um contrato entre um professor e um aluno para a realização de um curso.                                    |
| Avaliação           | Representa a avaliação de um aluno em um curso, com informações como nota e comentários.                               |
| Aula                | Representa uma aula de um curso, com informações como data, horário e conteúdo.                                        |
| Presença            | Representa a presença de um aluno em uma aula, com informações como data e horário de entrada e saída.                 |
| Método de Pagamento | Representa um método de pagamento disponível para os alunos, como cartão de crédito, boleto ou transferência bancária. |
| Desempenho          | Representa o desempenho de um aluno em um curso, com informações como notas, frequência e participação.                |
| Planejamento        | Representa o planejamento de um curso, com informações como ementa, objetivos e metodologia.                           |
| Método-Avaliação    | Representa os métodos de avaliação de um curso, como provas, trabalhos e participação.                                 |

#### Pontos a serem considerados:

- **Herança**: A classe `Pessoa` é uma classe abstrata da qual as classes `Professor`, `Aluno` e `Administrador` herdam,
  representando a relação de herança entre as entidades. Isso se de ao fato de que todos os usuários do sistema possuem
  atributos em comum, como nome, CPF, RG, data de nascimento, endereço e entre outros, que são representadas pela classe
  `Pessoa`. Logo **Pessoa** não será instanciada, mas sim suas subclasses.
- **Associação**: A classe `Curso` possui uma associação com a classe `Professor`, indicando que um curso é criado por
  um Professor ou um Administrador. A classe `Matrícula` possui associações com as classes `Aluno` e `Curso`, indicando
  que um aluno é matriculado em um curso por um Professor. A classe `Pagamento` possui associações com as classes
  `Aluno` e `Curso`, indicando que um aluno realiza um pagamento para se matricular em um curso.
- **Agregação**: A classe `Relatório` possui uma agregação com a classe `Curso`, indicando que um relatório é gerado a
  partir de um curso. A classe `Configuração` possui uma agregação com a classe `Privilégio`, indicando que as
  configurações do sistema incluem permissões de acesso.
- **Composição**: A classe `Endereço` possui uma composição com a classe `Pessoa`, indicando que um endereço é parte de
  uma pessoa. A classe `Contrato` possui uma composição com as classes `Professor` e `Aluno`, indicando que um contrato
  é estabelecido entre um professor e um aluno para a realização de um curso.

### 3.1.3 Diagrama de Sequência

O diagrama de sequência do sistema de controle e gerenciamento de cursos livres para freelancers representa a interação
entre os atores e o sistema em um cenário específico, identificando as mensagens trocadas e as etapas do processo.



