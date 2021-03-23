/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.test;

import org.junit.BeforeClass;
import org.junit.Test;

import zooinfo.model.bean.Classe;
import zooinfo.model.dao.ClasseDAO;

import static org.junit.Assert.*;

/**
 *
 * @author pedro-menezes
 */
public class ClasseTest {

    private static Classe classe;
    private static ClasseDAO classeDAO;

    public ClasseTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        classe = new Classe();
        classeDAO = new ClasseDAO();
    }
    
    @Test
    public void testeInvalido01() {
    	classe.setNomeClasse("");
    	classe.setDescricaoClasse("");
    	boolean teste = new ClasseDAO().save(classe);
    	assertFalse(teste);
    }
    
    @Test
    public void testeInvalido02() {
    	classe.setNomeClasse("a");
    	classe.setDescricaoClasse("");
    	boolean teste = new ClasseDAO().save(classe);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido03() {
    	classe.setNomeClasse("1");
    	classe.setDescricaoClasse("");
    	boolean teste = new ClasseDAO().save(classe);
    	assertFalse(teste);
    }
    
    @Test
    public void testeInvalido04() {
    	classe.setNomeClasse("*");
    	classe.setDescricaoClasse("");
    	boolean teste = new ClasseDAO().save(classe);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido05() {
    	classe.setNomeClasse("");
    	classe.setDescricaoClasse("a");
    	boolean teste = new ClasseDAO().save(classe);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido06() {
    	classe.setNomeClasse("1");
    	classe.setDescricaoClasse("a");
    	boolean teste = new ClasseDAO().save(classe);
    	assertFalse(teste);
    }
  
    @Test
    public void testeInvalido07() {
    	classe.setNomeClasse("*");
    	classe.setDescricaoClasse("a");
    	boolean teste = new ClasseDAO().save(classe);
    	assertFalse(teste);
    }
  
    @Test
    public void testeValido01() {
    	classe.setNomeClasse("a");
    	classe.setDescricaoClasse("a");
    	boolean teste = new ClasseDAO().save(classe);
    	assertTrue(teste);
    }
    
    @Test
    public void testeExclusaoInvalido08() {
    	classe.setCodigo(1000000);
    	classe.setNomeClasse("ddddd");
    	classe.setDescricaoClasse("adsa1");     
    	boolean teste = classeDAO.remove(classe.getCodigo());
        assertFalse(teste);
    }
    
    @Test
    public void testeExclusaoInvalido09() {
    	classe.setCodigo(9);   
    	boolean teste = classeDAO.remove(classe.getCodigo());
        assertFalse(teste);
    }

    @Test
    public void testeExclusaoValido02() {    	
    	classe.setNomeClasse("a");
    	classe.setDescricaoClasse("a");     
    	//--buscando codigo de especie cadastrado anteriormente para testar exclusão válida
    	classe.setCodigo(classeDAO.find(classe));
    	
        boolean teste = classeDAO.remove(classe.getCodigo());
        assertTrue(teste);
    }
}