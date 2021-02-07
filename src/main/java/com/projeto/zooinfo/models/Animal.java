/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.zooinfo.models;

import java.util.Date;

/**
 *
 * @author mathe
 */
public class Animal extends Especie{
    private int codigoAnimal;
    private String nomeAnimal;
    private Date dataNascimento;
    private Alimentacao alimentacao;

    public Animal(int codigoAnimal, String nomeAnimal, Date dataNascimento, Alimentacao alimentacao, int codigoEspecie, String nomeEspecie, String descricaoEspecie, int codigoFamilia, String nome, String descricao, int codigoClasse, String nomeClasse, String descricaoClasse) {
        super(codigoEspecie, nomeEspecie, descricaoEspecie, codigoFamilia, nome, descricao, codigoClasse, nomeClasse, descricaoClasse);
        this.codigoAnimal = codigoAnimal;
        this.nomeAnimal = nomeAnimal;
        this.dataNascimento = dataNascimento;
        this.alimentacao = alimentacao;
    }

    public int getCodigo() {
        return codigoAnimal;
    }

    public void setCodigo(int codigo) {
        this.codigoAnimal = codigo;
    }

    public String getNome() {
        return nomeAnimal;
    }

    public void setNome(String nome) {
        this.nomeAnimal = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Alimentacao getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(Alimentacao alimentacao) {
        this.alimentacao = alimentacao;
    }
    
    
}
