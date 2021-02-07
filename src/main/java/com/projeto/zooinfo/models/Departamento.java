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
public class Departamento {
    private int codigoDepto;
    private String nomeDepto;
    private ArrayList<Funcionario> funcionarios;
    private Funcionario responsavel;

    public Departamento(int codigoDepto, String nomeDepto) {
        this.codigoDepto = codigoDepto;
        this.nomeDepto = nomeDepto;
    }

    public int getCodigoDepto() {
        return codigoDepto;
    }

    public void setCodigoDepto(int codigoDepto) {
        this.codigoDepto = codigoDepto;
    }

    public String getNomeDepto() {
        return nomeDepto;
    }

    public void setNomeDepto(String nomeDepto) {
        this.nomeDepto = nomeDepto;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) { // função add funcionários
        this.funcionarios = funcionarios;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }
    
    
}
