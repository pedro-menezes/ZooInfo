/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author mathe
 */
@Entity
@Table(name = "classe")
public class Classe implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer codigoClasse;

    @Column
    private String nomeClasse;

    @Column
    private String descricaoClasse;

    @OneToMany(mappedBy = "classe")
    private List<Familia> familias = new ArrayList();

    public Classe() {
    }

    public Classe(Integer codigoClasse, String nomeClasse, String descricaoClasse) {
        this.codigoClasse = codigoClasse;
        this.nomeClasse = nomeClasse;
        this.descricaoClasse = descricaoClasse;
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

    @Override
    public String toString() {
        return getCodigo() + ": " +getNomeClasse();
    }
}
