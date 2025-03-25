package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class FormaPagamento implements Serializable {
    //criando atributos da tabela forma pagamento

    //criando id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    //criando coluna tipo
    @Column(length = 55, name = "TIPO", nullable = false)
    private String tipo;
    //criando coluna descrição
    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;
    @Column(length = 55, name = "STATUS", nullable = false)
    private  String status;
    //criando construtor vazio
    public FormaPagamento() {
    }
    //construtor com argumentos

    public FormaPagamento(Long id, String tipo, String descricao, String status) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.status = status;
    }
    //gerando getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
