/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /* --add-modules javafx.controls,javafx.fxml*/
package zooinfo.test;

import org.junit.BeforeClass;
import org.junit.Test;

import zooinfo.model.bean.Alimentacao;
import zooinfo.model.dao.AlimentacaoDAO;

import static org.junit.Assert.*;

/**
 *
 * @author pedro-menezes
 */
public class AlimentacaoTest {

    private static Alimentacao alimentacao;
    private static AlimentacaoDAO alimentacaoDAO;

    public AlimentacaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        alimentacao = new Alimentacao();
        alimentacaoDAO = new AlimentacaoDAO();
    }

    @Test
    public void testeInvalido01() {
    	alimentacao.setDescricao("");
    	alimentacao.setQuantidade(0);
        boolean teste = alimentacaoDAO.save(alimentacao);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido02() {
    	alimentacao.setDescricao("");
    	alimentacao.setQuantidade(1);
        boolean teste = alimentacaoDAO.save(alimentacao);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido03() {
    	alimentacao.setDescricao("");
    	alimentacao.setQuantidade(-1);
        boolean teste = alimentacaoDAO.save(alimentacao);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido04() {
    	alimentacao.setDescricao("a");
    	alimentacao.setQuantidade(0);
        boolean teste = alimentacaoDAO.save(alimentacao);
        assertFalse(teste);
    }
    
    @Test
    public void testeValido01() {
    	alimentacao.setDescricao("a");
    	alimentacao.setQuantidade(1);
        boolean teste = alimentacaoDAO.save(alimentacao);
        assertTrue(teste);
    }
    
    @Test
    public void testeInvalido05() {
    	alimentacao.setDescricao("a");
    	alimentacao.setQuantidade(-1);
        boolean teste = alimentacaoDAO.save(alimentacao);
        assertFalse(teste);
    }
    
    @Test
    public void testeExclusaoInvalido06() {
    	alimentacao.setCodigo(100000000);
    	alimentacao.setDescricao("A");
    	alimentacao.setQuantidade(1000);
        boolean teste = alimentacaoDAO.remove(alimentacao.getCodigo());
        assertFalse(teste);
    }
    
    @Test
    public void testeExclusaoValido02() {
    	alimentacao.setDescricao("a");
    	alimentacao.setQuantidade(1);
    	//--buscando codigo de alimentação cadastrado anteriormente para testar exclusão válida
    	alimentacao.setCodigo(alimentacaoDAO.find(alimentacao));
    	
        boolean teste = alimentacaoDAO.remove(alimentacao.getCodigo());
        assertTrue(teste);
    }
}
