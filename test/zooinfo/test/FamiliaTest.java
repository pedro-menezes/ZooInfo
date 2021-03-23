/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /* --add-modules javafx.controls,javafx.fxml*/
package zooinfo.test;

import org.junit.BeforeClass;
import org.junit.Test;

import zooinfo.model.bean.Familia;
import zooinfo.model.dao.FamiliaDAO;

import zooinfo.model.bean.Classe;
import zooinfo.model.bean.Especie;
import zooinfo.model.dao.ClasseDAO;

import static org.junit.Assert.*;

/**
 *
 * @author mathe
 */
public class FamiliaTest {

    private static Familia familia;
    private static FamiliaDAO familiaDAO;

    public FamiliaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        familia = new Familia();
        familiaDAO = new FamiliaDAO();
    }

    @Test
    public void testeInvalido01() {
 		familia.setNomeFamilia("");
 		familia.setDescricaoFamilia("");
 		familia.setClasse(classeExistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido02() {
    	
 		familia.setNomeFamilia("a");
 		familia.setDescricaoFamilia("");
 		familia.setClasse(classeExistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido03() {
    	
 		familia.setNomeFamilia("1");
 		familia.setDescricaoFamilia("");
 		familia.setClasse(classeExistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }


    @Test
    public void testeInvalido04() {
    	
 		familia.setNomeFamilia("*");
 		familia.setDescricaoFamilia("");
 		familia.setClasse(classeExistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido05() {
    	
 		familia.setNomeFamilia("");
 		familia.setDescricaoFamilia("a");
 		familia.setClasse(classeExistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }


    @Test
    public void testeInvalido06() {
    	
 		familia.setNomeFamilia("1");
 		familia.setDescricaoFamilia("a");
		familia.setClasse(classeExistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }


    @Test
    public void testeInvalido07() {
    	
 		familia.setNomeFamilia("*");
 		familia.setDescricaoFamilia("a");
		familia.setClasse(classeExistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido08() {
    	
 		familia.setNomeFamilia("");
 		familia.setDescricaoFamilia("");
 		familia.setClasse(classeInexistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido09() {
    	
 		familia.setNomeFamilia("a");
 		familia.setDescricaoFamilia("");
 		familia.setClasse(classeInexistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido10() {
    	
 		familia.setNomeFamilia("1");
 		familia.setDescricaoFamilia("");
 		familia.setClasse(classeInexistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido11() {
    	
 		familia.setNomeFamilia("*");
 		familia.setDescricaoFamilia("");
 		familia.setClasse(classeInexistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido12() {
    	
 		familia.setNomeFamilia("");
 		familia.setDescricaoFamilia("a");
 		familia.setClasse(classeInexistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido13() {
    	
 		familia.setNomeFamilia("a");
 		familia.setDescricaoFamilia("a");
 		familia.setClasse(classeInexistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido14() {
    	
 		familia.setNomeFamilia("1");
 		familia.setDescricaoFamilia("a");
 		familia.setClasse(classeInexistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido15() {
    	
 		familia.setNomeFamilia("*");
 		familia.setDescricaoFamilia("a");
 		familia.setClasse(classeInexistente());

        boolean teste = familiaDAO.save(familia);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido16() {
    	
 		familia.setCodigo(99);
 		familia.setNomeFamilia("a");
 		familia.setDescricaoFamilia("a");
		familia.setClasse(classeExistente());
		familiaDAO.save(familia);

        Especie especie = new Especie(99, "especieTeste", "descricaoTeste", familia); 

        boolean teste = familiaDAO.remove(99);
        assertFalse(teste);
    }

    @Test
    public void testeExclusaoInvalido17() {
        boolean teste = familiaDAO.remove(500000);
        assertFalse(teste);
    }

    @Test
    public void testeValido01() {
    	
        familia.setCodigo(100);
 		familia.setNomeFamilia("a");
 		familia.setDescricaoFamilia("a");
		familia.setClasse(classeExistente());

        boolean teste = familiaDAO.save(familia);
        assertTrue(teste);
    }

    @Test
    public void testeExclusaoValido02() {
    	familia.setCodigo(100);
		familia.setNomeFamilia("a");
		familia.setDescricaoFamilia("a");
		familia.setClasse(classeExistente());  
		//--buscando codigo de familia cadastrado anteriormente para testar exclusão válida
		familia.setCodigo(familiaDAO.find(familia));
        boolean teste = familiaDAO.remove(familia.getCodigo());
        assertTrue(teste);
    }

     public Classe classeExistente() {
        Classe classe = new Classe();
        classe = new ClasseDAO().findById(1);
        return classe;
    }

    public Classe classeInexistente() {
        Classe classe = new Classe();
        classe = new ClasseDAO().findById(5000);
        return classe;
    }
    
}
