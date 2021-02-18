/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.tests;

import zooinfo.model.bean.Alimentacao;
import zooinfo.model.bean.Animal;
import zooinfo.model.dao.AlimentacaoDAO;
import zooinfo.model.dao.AnimalDAO;

/**
 *
 * @author pedro-menezes
 */
public class TestMain {

    public static void main(String[] args) {
        Alimentacao alimentacao = new Alimentacao();
        alimentacao.setDescricao("Carne");
        alimentacao.setQuantidade(10);
        AlimentacaoDAO  alimentacaoDAO = new AlimentacaoDAO();
        alimentacaoDAO.save(alimentacao);
        
//        Animal animal = new Animal();
//        animal.setAlimentacao(alimentacao);
//        animal.setNomeAnimal("Urso");
//        
//        AnimalDAO animalDAO = new AnimalDAO();
//        animalDAO.save(animal);
    }
}
