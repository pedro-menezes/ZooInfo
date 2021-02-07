/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.zooinfo.models;

/**
 *
 * @author mathe
 */
public class Alimentacao {
    private int codigoAlimentacao;
    private String descricao;
    private float quantidade;

    public Alimentacao(int codigo, String descricao, float quantidade) {
        this.codigoAlimentacao = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigoAlimentacao;
    }

    public void setCodigo(int codigo) {
        this.codigoAlimentacao = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
