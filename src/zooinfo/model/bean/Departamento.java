/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.bean;

import java.io.Serializable;
import java.util.ArrayList;
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
public class Departamento implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;
    
    private String nomeDepto;
    

    public Departamento() {
    }

    public Departamento(Integer codigoDepto, String nomeDepto, Funcionario funcionarios) {
        this.codigo = codigoDepto;
        this.nomeDepto = nomeDepto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigoDepto) {
        this.codigo = codigoDepto;
    }

    public String getNomeDepto() {
        return nomeDepto;
    }

    public void setNomeDepto(String nomeDepto) {
        this.nomeDepto = nomeDepto;
    }

    @Override
    public String toString() {
        return getNomeDepto();
    }
}
