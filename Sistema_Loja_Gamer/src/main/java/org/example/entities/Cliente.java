package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

//definindo entidade
@Entity
public class Cliente implements Serializable {
    //criando colunas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Column(length = 11,name="CPF",nullable = false)
    private String cpf;
    @Column(length = 255,name="Nome",nullable = false)
    private String nome;
    @Column(name="DataNacimento",nullable = false)
    private LocalDate dataNacimento;
    @Column(length = 255,name="Status",nullable = false)
    private String status;

    public Cliente() {
    }

    public Cliente(Long id, String  cpf, String nome, LocalDate dataNacimento, String status) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNacimento = dataNacimento;
        this.status = status;
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

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
