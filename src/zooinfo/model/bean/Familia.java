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
public class Familia implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;
    
    private String nomeFamilia;
    private String descricaoFamilia;
    
    @ManyToOne
    private Classe classe;

    public Familia() {
    }

    public Familia(Integer codigo, String nomeFamilia, String descricaoFamilia, Classe classe) {
        this.codigo = codigo;
        this.nomeFamilia = nomeFamilia;
        this.descricaoFamilia = descricaoFamilia;
        this.classe = classe;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeFamilia() {
        return nomeFamilia;
    }

    public void setNomeFamilia(String nomeFamilia) {
        this.nomeFamilia = nomeFamilia;
    }

    public String getDescricaoFamilia() {
        return descricaoFamilia;
    }

    public void setDescricaoFamilia(String descricaoFamilia) {
        this.descricaoFamilia = descricaoFamilia;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}
