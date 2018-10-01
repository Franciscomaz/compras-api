package com.compras.domain.produto;

public class Produto {
    private Long id;
    private String umaDescricao;
    private Double umValor;

    public Produto() {
    }
    
    public Produto(String umaDescricao, Double umValor) {
        this.umaDescricao = umaDescricao;
        this.umValor = umValor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return umaDescricao;
    }

    public void setDescricao(String descricao) {
        this.umaDescricao = descricao;
    }

    public Double getValor() {
        return umValor;
    }

    public void setValor(Double valor) {
        this.umValor = valor;
    }
}
