# Todolist

## Descrição

Este é um projeto de exemplo para uma aplicação de lista de tarefas (todolist) usando Spring Boot. A aplicação permite criar, listar, atualizar e deletar tarefas.## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.2.5
- Spring Data JPA
- Spring Web
- Spring Cloud OpenFeign
- SpringDoc OpenAPI
- Banco de dados H2
- JUnit 5 para testes

## Requisitos

- Java 21+
- Maven
## Instalação

1. Clone o repositório:

   ```bash
   git clone https://github.com/MarcosPelizari/dio-projeto-spring.git
   cd todolist


2. Compile e execute os testes:

    ```bash
    mvn clean install
    ```

3. Inicie a aplicação:
  
    ```bash
    mvn spring-boot:run
    ```## Endpoints

A aplicação expõe os seguintes endpoints:

#### Criar uma tarefa

- URL: /todos

- Método: POST

- Body:

    ```
    {
      "nome": "Nome da tarefa",
      "descricao": "Descrição da tarefa",
      "checklist": false,
      "prioridade": 1
    }
    

- Response:

    ```
      {
        "id": 1,
        "nome": "Nome da tarefa",
        "descricao": "Descrição da tarefa",
        "checklist": false,
        "prioridade": 1
      }
    

#### Listar todas as tarefas

- URL: /todos

- Método: GET

- Response:

    ```
      {
        "id": 1,
        "nome": "Nome da tarefa",
        "descricao": "Descrição da tarefa",
        "checklist": false,
        "prioridade": 1
      }
    

#### Atualizar uma tarefa

- URL: /todos

- Método: PUT

- Body:

    ```
    {
    "id": 1,
    "nome": "Nome atualizado da tarefa",
    "descricao": "Descrição atualizada da tarefa",
    "checklist": true,
    "prioridade": 2
    }

- Response:
    ```
      {
        "id": 1,
        "nome": "Nome atualizado da tarefa",
        "descricao": "Descrição atualizada da tarefa",
        "checklist": true,
        "prioridade": 2
      }


#### Deletar uma tarefa

- URL: /todos/{id}

- Método: DELETE

- Response:

    ```
      {
        "id": 1,
        "nome": "Nome da tarefa",
        "descricao": "Descrição da tarefa",
        "checklist": false,
        "prioridade": 1
      }
