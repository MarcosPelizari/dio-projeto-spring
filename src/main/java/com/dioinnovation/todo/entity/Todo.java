package com.dioinnovation.todo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    private boolean checklist;
    private int prioridade;

    public Todo() {
    }

    public Todo(@NotBlank String nome,@NotBlank String descricao, boolean checklist, int prioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.checklist = checklist;
        this.prioridade = prioridade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isChecklist() {
        return checklist;
    }

    public void setChecklist(boolean checklist) {
        this.checklist = checklist;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
