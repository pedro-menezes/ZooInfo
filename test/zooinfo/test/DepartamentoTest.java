/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /* --add-modules javafx.controls,javafx.fxml*/
package zooinfo.test;

import org.junit.BeforeClass;
import org.junit.Test;

import zooinfo.model.bean.Departamento;
import zooinfo.model.dao.DepartamentoDAO;

import static org.junit.Assert.*;

/**
 *
 * @author mathe
 */
public class DepartamentoTest {

    private static Departamento departamento;
    private static DepartamentoDAO departamentoDAO;

    public DepartamentoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        departamento = new Departamento();
        departamentoDAO = new DepartamentoDAO();
    }


    @Test
    public void testeInvalido1() {
 		departamento.setCodigo(100);
 		departamento.setNomeDepto("");

        boolean teste = departamentoDAO.save(departamento);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido2() {
        boolean teste = departamentoDAO.remove(1000000);
        assertFalse(teste);
    }

    @Test
    public void testeValido1() {
 		departamento.setNomeDepto("nomeDeptoTeste");

        boolean teste = departamentoDAO.save(departamento);
        assertTrue(teste);
    }

    @Test
    public void testeValido2() {
    	int codigo = 0;
    	for (Departamento departamento : departamentoDAO.findAll()) {
			codigo = departamento.getCodigo();
		}
        boolean teste = departamentoDAO.remove(codigo);
        assertTrue(teste);
    }
    
}
