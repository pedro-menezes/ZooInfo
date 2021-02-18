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
import javax.persistence.ManyToOne;

@Entity
public class Animal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;

    private String nomeAnimal;
    private Date dataNascimento;

    @ManyToOne
    private Alimentacao alimentacao;
    
    @ManyToOne
    private Especie especie;

    public Animal() {
    }

    public Animal(Integer codigo, String nomeAnimal, Date dataNascimento, Alimentacao alimentacao, Especie especie) {
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.dataNascimento = dataNascimento;
        this.alimentacao = alimentacao;
        this.especie = especie;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigoId) {
        this.codigo = codigoId;
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

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
    
}
