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
public class Venda {
    private Date dataVenda;
    private Funcionario funcionario;
    private boolean usado;

    public Venda(Date dataVenda, Funcionario funcionario, boolean usado) {
        this.dataVenda = dataVenda;
        this.funcionario = funcionario;
        this.usado = usado;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }    
    
}
