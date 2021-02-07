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
public class Classe {
    private int codigoClasse;
    private String nomeClasse;
    private String descricaoClasse;

    public Classe(int codigoClasse, String nomeClasse, String descricaoClasse) {
        this.codigoClasse = codigoClasse;
        this.nomeClasse = nomeClasse;
        this.descricaoClasse = descricaoClasse;
    }

    public int getCodigoClasse() {
        return codigoClasse;
    }

    public void setCodigoClasse(int codigoClasse) {
        this.codigoClasse = codigoClasse;
    }

    public String getNomeClasse() {
        return nomeClasse;
    }

    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    public String getDescricaoClasse() {
        return descricaoClasse;
    }

    public void setDescricaoClasse(String descricaoClasse) {
        this.descricaoClasse = descricaoClasse;
    }

    
    
}
