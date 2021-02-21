/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author mathe
 */
@Entity
@Table(name = "especie")
public class Especie implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer codigo;

    @Column
    private String nomeEspecie;

    @Column
    private String descricaoEspecie;

    @ManyToOne
    @JoinColumn(name = "famCodigo")
    private Familia familia;
    
    @OneToMany(mappedBy = "especie")
    private List<Animal> animais = new ArrayList();

    public Especie() {
    }

    public Especie(Integer codigoEspecie, String nomeEspecie, String descricaoEspecie, Familia familia) {
        this.codigo = codigoEspecie;
        this.nomeEspecie = nomeEspecie;
        this.descricaoEspecie = descricaoEspecie;
        this.familia = familia;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    public String getDescricaoEspecie() {
        return descricaoEspecie;
    }

    public void setDescricaoEspecie(String descricaoEspecie) {
        this.descricaoEspecie = descricaoEspecie;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        return getCodigo()+ ": "+getNomeEspecie();
    }
}
