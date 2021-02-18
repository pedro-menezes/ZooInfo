/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author mathe
 */
@Entity
public class Classe implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigoClasse;
    
    private String nomeClasse;
    private String descricaoClasse;
    
    @ManyToOne
    private Familia familia;

    public Classe() {
    }

    public Classe(Integer codigoClasse, String nomeClasse, String descricaoClasse, Familia familia) {
        this.codigoClasse = codigoClasse;
        this.nomeClasse = nomeClasse;
        this.descricaoClasse = descricaoClasse;
        this.familia = familia;
    }

    public Integer getCodigo() {
        return codigoClasse;
    }

    public void setCodigo(Integer codigoClasse) {
        this.codigoClasse = codigoClasse;
    }

    public String getNomeClasse() {
        return nomeClasse;
    }

    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    public String getDescricaoClasse() {
        return descricaoClasse;
    }

    public void setDescricaoClasse(String descricaoClasse) {
        this.descricaoClasse = descricaoClasse;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }
}
