/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author mathe
 */
@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable {

    @Id
    private String cpf;

    @Column
    private String nome;

    @Column
    private Date dataNascimento;

    @Column
    private Date dataAdmissao;

    @Column
    private double salario;

    @Column
    private char sexo;

    @OneToOne(cascade = CascadeType.MERGE)
    private Login login;

    @OneToOne(cascade = CascadeType.MERGE)
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "depCodigo")
    private Departamento departamento;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionario")
    private List<Venda> vendas = new ArrayList();

    public Funcionario() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return getNome() + ", " + getCpf();
    }
}
