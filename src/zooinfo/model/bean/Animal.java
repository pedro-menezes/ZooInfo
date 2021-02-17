/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigoId;

    private int codigoAnimal;
    private String nomeAnimal;
    private Date dataNascimento;
    private Alimentacao alimentacao;

    public Animal(int codigoAnimal, String nomeAnimal, Date dataNascimento, Alimentacao alimentacao) {
        this.codigoAnimal = codigoAnimal;
        this.nomeAnimal = nomeAnimal;
        this.dataNascimento = dataNascimento;
        this.alimentacao = alimentacao;
    }

    public long getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(long codigoId) {
        this.codigoId = codigoId;
    }

    public int getCodigoAnimal() {
        return codigoAnimal;
    }

    public void setCodigoAnimal(int codigoAnimal) {
        this.codigoAnimal = codigoAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
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
