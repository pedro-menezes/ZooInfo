/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.test;

import org.junit.BeforeClass;
import org.junit.Test;

import zooinfo.model.bean.Especie;
import zooinfo.model.bean.Familia;
import zooinfo.model.dao.EspecieDAO;
import zooinfo.model.dao.FamiliaDAO;

import static org.junit.Assert.*;

import java.sql.Date;

/**
 *
 * @author pedro-menezes
 */
public class EspecieTest {

    private static Especie especie;
    private static EspecieDAO especieDAO;

    public EspecieTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        especie = new Especie();
        especieDAO = new EspecieDAO();
    }
    
    @Test
    public void testeInvalido01() {
    	especie.setNomeEspecie("");
    	especie.setDescricaoEspecie("");
    	especie.setFamilia(familiaExistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
    
    @Test
    public void testeInvalido02() {
    	especie.setNomeEspecie("a");
    	especie.setDescricaoEspecie("");
    	especie.setFamilia(familiaExistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido03() {
    	especie.setNomeEspecie("1");
    	especie.setDescricaoEspecie("");
    	especie.setFamilia(familiaExistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
    
    @Test
    public void testeInvalido04() {
    	especie.setNomeEspecie("*");
    	especie.setDescricaoEspecie("");
    	especie.setFamilia(familiaExistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido05() {
    	especie.setNomeEspecie("");
    	especie.setDescricaoEspecie("a");
    	especie.setFamilia(familiaExistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido06() {
    	especie.setNomeEspecie("*");
    	especie.setDescricaoEspecie("a");
    	especie.setFamilia(familiaInexistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
  
    @Test
    public void testeInvalido07() {
    	especie.setNomeEspecie("1");
    	especie.setDescricaoEspecie("a");
    	especie.setFamilia(familiaExistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido08() {
    	especie.setNomeEspecie("*");
    	especie.setDescricaoEspecie("a");
    	especie.setFamilia(familiaExistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido09() {
    	especie.setNomeEspecie("");
    	especie.setDescricaoEspecie("");
    	especie.setFamilia(familiaInexistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido10() {
    	especie.setNomeEspecie("a");
    	especie.setDescricaoEspecie("");
    	especie.setFamilia(familiaInexistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
  
    @Test
    public void testeInvalido11() {
    	especie.setNomeEspecie("1");
    	especie.setDescricaoEspecie("");
    	especie.setFamilia(familiaInexistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido12() {
    	especie.setNomeEspecie("*");
    	especie.setDescricaoEspecie("");
    	especie.setFamilia(familiaInexistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido13() {
    	especie.setNomeEspecie("");
    	especie.setDescricaoEspecie("a");
    	especie.setFamilia(familiaInexistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
    
    @Test
    public void testeInvalido14() {
    	especie.setNomeEspecie("a");
    	especie.setDescricaoEspecie("a");
    	especie.setFamilia(familiaInexistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido15() {
    	especie.setNomeEspecie("1");
    	especie.setDescricaoEspecie("a");
    	especie.setFamilia(familiaInexistente());
    	boolean teste = especieDAO.save(especie);
    	assertFalse(teste);
    }
    
    @Test
    public void testeValido01() {
    	especie.setNomeEspecie("a");
    	especie.setDescricaoEspecie("a");
    	especie.setFamilia(familiaExistente());
    	boolean teste = especieDAO.save(especie);
    	assertTrue(teste);
    }
    
    public Familia familiaExistente() {
    	Familia familia = new Familia();
    	familia = new FamiliaDAO().findById(2);
    	return familia;
    }
    
    public Familia familiaInexistente() {
    	Familia familia = new Familia();
    	familia = new FamiliaDAO().findById(5000);
    	return familia;
    }
    
    @Test
    public void testeExclusaoInvalido16() {
    	especie.setCodigo(1000000);
    	especie.setNomeEspecie("ddddd1");
    	especie.setDescricaoEspecie("adsa1");
    	especie.setFamilia(familiaExistente());     
    	boolean teste = especieDAO.remove(especie.getCodigo());
        assertFalse(teste);
    }
    
    @Test
    public void testeExclusaoInvalido17() {
    	especie.setCodigo(8);   
    	boolean teste = especieDAO.remove(especie.getCodigo());
        assertFalse(teste);
    }

    @Test
    public void testeExclusaoValido02() {    	
    	especie.setNomeEspecie("a");
    	especie.setDescricaoEspecie("a");
    	especie.setFamilia(familiaExistente());      
    	//--buscando codigo de especie cadastrado anteriormente para testar exclusão válida
    	especie.setCodigo(especieDAO.find(especie));
    	
        boolean teste = especieDAO.remove(especie.getCodigo());
        assertTrue(teste);
    }
}