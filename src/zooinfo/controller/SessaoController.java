/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller;

import zooinfo.model.bean.Funcionario;

/**
 *
 * @author pedro-menezes
 */
public class SessaoController {

    private static SessaoController sessao;

    private Funcionario funcionario;

    public static synchronized SessaoController getInstance() {
        if (sessao == null) {
            sessao = new SessaoController();
        }

        return sessao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getTipo(){
        return funcionario.getClass().getName();
    }
}
