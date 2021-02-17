/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.zooinfo.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author mathe
 */
@Entity
public class Gerente extends Funcionario implements Serializable{
    
    private float bonusSalarial;

    public Gerente(float bonusSalarial, String nome, String cpf, Date dataNascimento, Date dataAdmissao, double salario, char sexo, ArrayList<Endereco> endereco) {
        super(nome, cpf, dataNascimento, dataAdmissao, salario, sexo, endereco);
        this.bonusSalarial = bonusSalarial;
    }

    public float getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(float bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }
    
}
