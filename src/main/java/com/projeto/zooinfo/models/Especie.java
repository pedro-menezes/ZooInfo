/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.zooinfo.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author mathe
 */
@Entity
public class Especie implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoEspecie;
    
    private String nomeEspecie;
    private String descricaoEspecie;

    public Especie(int codigoEspecie, String nomeEspecie, String descricaoEspecie) {
        this.codigoEspecie = codigoEspecie;
        this.nomeEspecie = nomeEspecie;
        this.descricaoEspecie = descricaoEspecie;
    }

    public int getCodigo() {
        return codigoEspecie;
    }

    public void setCodigo(int codigo) {
        this.codigoEspecie = codigo;
    }

    public String getNome() {
        return nomeEspecie;
    }

    public void setNome(String nome) {
        this.nomeEspecie = nome;
    }

    public String getDescricao() {
        return descricaoEspecie;
    }

    public void setDescricao(String descricao) {
        this.descricaoEspecie = descricao;
    }

}
