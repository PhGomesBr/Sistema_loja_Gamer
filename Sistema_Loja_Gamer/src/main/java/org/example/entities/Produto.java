package org.example.entities;

import javax.persistence.*;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(length = 255, name = "Descricao", nullable = false)
    private String Descricao;
    @Column(name = "PrecoCusto", nullable = false)
    private double PrecoCusto;
    @Column(name = "PrecoVenda", nullable = false)
    private  double PrecoVenda;
    @Column(name = "Estoque", nullable = false)
    private  int Estoque;

    public Produto() {
    }

    public Produto(Long id, String descricao, double precoCusto, double precoVenda, int estoque) {
        this.id = id;
        Descricao = descricao;
        PrecoCusto = precoCusto;
        PrecoVenda = precoVenda;
        Estoque = estoque;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public double getPrecoCusto() {
        return PrecoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        PrecoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return PrecoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        PrecoVenda = precoVenda;
    }

    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int estoque) {
        Estoque = estoque;
    }
}
