/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.test;

import org.junit.BeforeClass;
import org.junit.Test;

import zooinfo.model.bean.Animal;
import zooinfo.model.bean.Venda;
import zooinfo.model.dao.AnimalDAO;
import zooinfo.model.dao.FuncionarioDAO;
import zooinfo.model.dao.VendaDAO;

import static org.junit.Assert.*;

import java.sql.Date;

/**
 *
 * @author pedro-menezes
 */
public class VendaTest {

    private static Venda venda;
    private static VendaDAO vendaDAO;

    public VendaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    	venda = new Venda();
        vendaDAO = new VendaDAO();
    }
    
    
    @Test
    public void testeInvalido01() {
    	venda.setDataVenda(null);
    	venda.setFuncionario(new FuncionarioDAO().findById("14114114123"));
    	boolean teste = new VendaDAO().save(venda);
    	assertFalse(teste);
    }
    
    @Test
    public void testeInvalido02() {
    	venda.setDataVenda(null);
    	venda.setFuncionario(null);
    	boolean teste = new VendaDAO().save(venda);
    	assertFalse(teste);
    }
   
    @Test
    public void testeInvalido03() {
    	venda.setDataVenda(new Date(2021, 01, 01));
    	venda.setFuncionario(null);
    	boolean teste = new VendaDAO().save(venda);
    	assertFalse(teste);
    }
    
    @Test
    public void testeValido01() {
    	venda.setDataVenda(new Date(2021, 01, 01));
    	venda.setFuncionario(new FuncionarioDAO().findById("11111111111"));
    	boolean teste = new VendaDAO().save(venda);
    	assertTrue(teste);
    }

    @Test
    public void testeExclusaoInvalido05() {
    	venda.setCodigo(10000000);
    	venda.setDataVenda(new Date(2021, 01, 01));
    	venda.setFuncionario(null);
    	boolean teste = new VendaDAO().remove(venda.getCodigo());
        assertFalse(teste);
    }
    
    @Test
    public void testeExclusaoValido02() {
    	int codigo = 0;
    	for (Venda vendaAux : vendaDAO.findAll()) {
    		codigo = vendaAux.getCodigo();
		}
    	System.out.println("____EXCLUIDO____"+codigo);
    	boolean teste = vendaDAO.remove(codigo);
        assertTrue(teste);
    }
}