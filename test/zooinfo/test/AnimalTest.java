/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.test;

import org.junit.BeforeClass;
import org.junit.Test;

import zooinfo.model.bean.Animal;
import zooinfo.model.bean.Especie;
import zooinfo.model.dao.AnimalDAO;
import zooinfo.model.dao.EspecieDAO;

import static org.junit.Assert.*;

import java.sql.Date;

/**
 *
 * @author pedro-menezes
 */
public class AnimalTest {

    private static Animal animal;
    private static AnimalDAO animalDAO;

    public AnimalTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        animal = new Animal();
        animalDAO = new AnimalDAO();
    }
    
    @Test
    public void testeInvalido01() {
    	animal.setNomeAnimal("");
    	animal.setDataNascimento(null);
    	animal.setEspecie(especieExistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
    
    @Test
    public void testeInvalido02() {
    	animal.setNomeAnimal("a");
    	animal.setDataNascimento(null);
    	animal.setEspecie(especieExistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido03() {
    	animal.setNomeAnimal("1");
    	animal.setDataNascimento(null);
    	animal.setEspecie(especieExistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
    
    @Test
    public void testeInvalido04() {
    	animal.setNomeAnimal("*");
    	animal.setDataNascimento(null);
    	animal.setEspecie(especieExistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido05() {
    	animal.setNomeAnimal("");
    	animal.setDataNascimento(null);
    	animal.setEspecie(especieInexistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido06() {
    	animal.setNomeAnimal("a");
    	animal.setDataNascimento(null);
    	animal.setEspecie(especieInexistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
  
    @Test
    public void testeInvalido07() {
    	animal.setNomeAnimal("*");
    	animal.setDataNascimento(null);
    	animal.setEspecie(especieInexistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido08() {
    	animal.setNomeAnimal("1");
    	animal.setDataNascimento(null);
    	animal.setEspecie(especieInexistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido09() {
    	animal.setNomeAnimal("");
    	animal.setDataNascimento(new Date(2021, 02, 20));
    	animal.setEspecie(especieExistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido10() {
    	animal.setNomeAnimal("");
    	animal.setDataNascimento(new Date(2021, 02, 20));
    	animal.setEspecie(especieInexistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
  
    @Test
    public void testeInvalido11() {
    	animal.setNomeAnimal("1");
    	animal.setDataNascimento(new Date(2021, 02, 20));
    	animal.setEspecie(especieExistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido12() {
    	animal.setNomeAnimal("*");
    	animal.setDataNascimento(new Date(2021, 02, 20));
    	animal.setEspecie(especieExistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido13() {
    	animal.setNomeAnimal("");
    	animal.setDataNascimento(new Date(2021, 02, 20));
    	animal.setEspecie(especieInexistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
    
    @Test
    public void testeInvalido14() {
    	animal.setNomeAnimal("");
    	animal.setDataNascimento(new Date(2021, 02, 20));
    	animal.setEspecie(especieInexistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido15() {
    	animal.setNomeAnimal("");
    	animal.setDataNascimento(new Date(2021, 02, 20));
    	animal.setEspecie(especieInexistente());
    	boolean teste = animalDAO.save(animal);
    	assertFalse(teste);
    }
    
    @Test
    public void testeValido01() {
    	animal.setNomeAnimal("a");
    	animal.setDataNascimento(new Date(2021, 02, 20));
    	animal.setEspecie(especieExistente());
    	boolean teste = animalDAO.save(animal);
    	assertTrue(teste);
    }
    
    @Test
    public void testeInvalido16() {
    	animal.setCodigo(100000000);
    	animal.setDataNascimento(new Date(2021, 02, 20));
    	animal.setEspecie(especieExistente());        
    	boolean teste = animalDAO.remove(animal.getCodigo());
        assertFalse(teste);
    }
    
    @Test
    public void testeValido02() {
    	animal.setNomeAnimal("a");
    	animal.setDataNascimento(new Date(2021, 02, 20));
    	animal.setEspecie(especieExistente());        
    	//--buscando codigo de animal cadastrado anteriormente para testar exclusão válida
    	animal.setCodigo(animalDAO.find(animal));
    	
        boolean teste = animalDAO.remove(animal.getCodigo());
        assertTrue(teste);
    }
    
    public Especie especieExistente() {
    	Especie especie = new Especie();
    	especie = new EspecieDAO().findById(1);
    	return especie;
    }
    
    public Especie especieInexistente() {
    	Especie especie = new Especie();
    	especie = new EspecieDAO().findById(5000);
    	return especie;
    }
}
