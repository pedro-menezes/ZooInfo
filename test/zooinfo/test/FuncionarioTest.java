/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /* --add-modules javafx.controls,javafx.fxml*/
package zooinfo.test;

import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;

import zooinfo.model.bean.Funcionario;
import zooinfo.model.dao.FuncionarioDAO;

import static org.junit.Assert.*;
import zooinfo.model.bean.Departamento;
import zooinfo.model.bean.Endereco;
import zooinfo.model.bean.Login;

/**
 *
 * @author mathe
 */
public class FuncionarioTest {

    private static Funcionario funcionario;
    private static FuncionarioDAO funcionarioDAO;

    public FuncionarioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        funcionario = new Funcionario();
        funcionarioDAO = new FuncionarioDAO();
    }

    @Test
    public void testeInvalido01() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario('a');
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido02() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido03() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido04() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido05() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido06() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido07() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido08() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
      @Test
    public void testeInvalido09() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
     @Test
    public void testeInvalido10() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido11() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
     @Test
    public void testeInvalido12() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido13() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido14() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido15() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido16() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido17() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
     @Test
    public void testeInvalido18() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido19() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido20() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido21() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
     @Test
    public void testeInvalido22() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido23() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido24() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido25() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido26() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido27() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido28() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido29() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido30() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido31() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido32() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido33() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido34() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido35() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido36() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido37() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido38() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido39() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido40() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido41() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido42() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido43() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido44() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido45() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido46() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido47() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido48() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido49() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido50() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido51() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido52() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido53() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido54() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido55() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido56() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido57() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido58() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido59() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido60() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido61() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido62() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido63() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido64() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido65() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido66() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido67() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido68() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido69() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido70() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido71() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido72() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido73() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido74() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido75(){
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido76() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido77() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido78() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido79() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido80() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
   @Test
    public void testeInvalido81() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido82() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido83() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido84() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido85() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido86() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido87() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido88() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido89() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido90() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido91() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido92() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido93() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido94() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido95() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido96() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido97() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido98() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido99() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido100() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido101() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido102() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido103() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido104() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido105() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido106() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido107() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido108() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido109() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido110() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido111() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido112() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido113() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido114() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido115() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido116() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido117() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido118() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido119() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido120() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido121() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido122() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido123() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido124() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido125() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido126() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido127() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido128() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido129() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        
 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido130() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido131() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido132() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        funcionario.setLogin(null);

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido133() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido134() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido135() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido136() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido137() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido138() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido139() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido140() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido141() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido142() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido143() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido144() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido145() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido146() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido147() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido148() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido149() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido150() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido151() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido152() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido153() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido154() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido155() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido156() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido157() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido158() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido159() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido160() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido161() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(null);
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido162() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido163() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido164() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido165() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido166() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido167() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido168() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido169() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido170() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido171() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido172() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido173() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido174() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido175() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido176() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido177() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido178() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido179() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido180() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido181() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido182() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido183() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido184() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido185() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido186() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido187() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido188() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido189() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido190() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido191() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido192() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        funcionario.setDepartamento(null);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido193() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido194() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido195() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido196() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido197() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido198() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido199() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido200() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido201() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido202() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido203() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido204() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido205() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido206() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido207() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido208() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido209() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido210() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido211() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido212() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido213() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test  
    public void testeInvalido214() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');

 	Login login = new Login("usuario", "senha");
        funcionario.setLogin(login);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);
        
       
        Departamento departamentoTeste = new Departamento(3, "Biologia", null);        
        funcionario.setDepartamento(departamentoTeste);


        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido215() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido216() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido217() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido218() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido219() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido220() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido221() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido222() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido223() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido224() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(-1);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido225() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido226() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido227() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido228() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido229() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido230() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido231() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido232() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido233() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
       	funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido234() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
       funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }


    @Test
    public void testeInvalido235() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido236() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido237() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido238() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido239() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido240() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(null);
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido241() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }
    
    @Test
    public void testeValido01() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertTrue(teste);
    }

    @Test
    public void testeInvalido242() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido243() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido244() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido245() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido246() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido247() {
    	funcionario.setCpf("123456789123");
    	funcionario.setNome("*");
       funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido248() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }


    @Test
    public void testeInvalido249() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido250() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido251() {
    	funcionario.setCpf("1234567891");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido252() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido253() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido254() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("1");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido255() {
    	funcionario.setCpf("aaaaaaaaaaa");
    	funcionario.setNome("*");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');

        Login loginTeste = new Login("loginTeste", "senhaTeste");

        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);

        funcionario.setDepartamento(departamentoTeste);

        boolean teste = funcionarioDAO.save(funcionario);
        assertFalse(teste);
    }

    @Test
    public void testeExclusaoInvalido256() {
    	
        boolean teste = funcionarioDAO.remove("99999999999");
        assertFalse(teste);
    }
    
    @Test
    public void testeExclusaoValido02() {
    	funcionario.setCpf("12345678912");
    	funcionario.setNome("a");
        funcionario.setDataNascimento(new Date(2021, 02, 20));
        funcionario.setDataAdmissao(new Date(2021, 02, 20));
        funcionario.setSalario(1000);
        funcionario.setSexo('M');
        
        Login loginTeste = new Login("loginTeste", "senhaTeste");
        funcionario.setLogin(loginTeste);

        Endereco endereco = new Endereco(1, "EndTeste", 10, "BairroTeste", "CidadeTeste", "37207-000", "MG");
        funcionario.setEndereco(endereco);

        Departamento departamentoTeste = new Departamento(100, "Biologia", null);
        funcionario.setDepartamento(departamentoTeste);

        funcionarioDAO.save(funcionario);
        boolean teste = funcionarioDAO.remove(funcionario.getCpf());
        assertFalse(teste);
    }

}