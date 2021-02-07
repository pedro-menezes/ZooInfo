/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.zooinfo.models;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
class Endereco {
    private int codigoEndereco;
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado;

    public Endereco(int codigo, String logradouro, int numero, String bairro, String cidade, String cep, String estado) {
        this.codigoEndereco = codigo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
    }
    
     public int getCodigo() {
        return codigoEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }
    
    
  
}
