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
public class Alimentacao implements Serializable{
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer codigo;
    
    private String descricao;
    private float quantidade;

    public Alimentacao() {
    }

    public Alimentacao(Integer codigoAlimentacao, String descricao, float quantidade) {
        this.codigo = codigoAlimentacao;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigoAlimentacao) {
        this.codigo = codigoAlimentacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
}
