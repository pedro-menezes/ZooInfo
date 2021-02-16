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
import javax.persistence.Id;

/**
 *
 * @author mathe
 */
@Entity
public class Funcionario implements Serializable{
    
    @Id
    private String cpf;
    
    private String nome;
    private Date dataNascimento;
    private Date dataAdmissao;
    private double salario;
    private char sexo;
    private ArrayList<Endereco> endereco;

    public Funcionario(String nome, String cpf, Date dataNascimento, Date dataAdmissao, double salario, char sexo, ArrayList<Endereco> endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.sexo = sexo;
        this.endereco = endereco;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }


    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public ArrayList<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(ArrayList<Endereco> endereco) {
        this.endereco = endereco;
    }
    
}
