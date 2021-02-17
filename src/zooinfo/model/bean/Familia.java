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

/**
 *
 * @author mathe
 */
@Entity
public class Familia implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoFamilia;
    
    private String nomeFamilia;
    private String descricaoFamilia;

    public Familia(int codigoFamilia, String nome, String descricao) {
        this.codigoFamilia = codigoFamilia;
        this.nomeFamilia = nome;
        this.descricaoFamilia = descricao;
    }
    
    public int getCodigo() {
        return codigoFamilia;
    }

    public void setCodigo(int codigo) {
        this.codigoFamilia = codigo;
    }

    public String getNome() {
        return nomeFamilia;
    }

    public void setNome(String nome) {
        this.nomeFamilia = nome;
    }

    public String getDescricao() {
        return descricaoFamilia;
    }

    public void setDescricao(String descricao) {
        this.descricaoFamilia = descricao;
    }

}
