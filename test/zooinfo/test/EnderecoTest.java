package zooinfo.test;

import org.junit.BeforeClass;
import org.junit.Test;

import zooinfo.model.bean.Endereco;
import zooinfo.model.dao.EnderecoDAO;

import static org.junit.Assert.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class EnderecoTest {
    
    private static Endereco endereco;
    private static EnderecoDAO enderecoDAO;
    
    public EnderecoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        endereco = new Endereco();
        enderecoDAO = new EnderecoDAO();
    }
    
    @Test
    public void testeInvalido01 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido02 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido03 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido04 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido05 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido06 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido07 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido08 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido09 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido10 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido11 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido12 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido13 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido14 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido15 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido16 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido17 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido18 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido19 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido20 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido21 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido22 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido23 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido24 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido25 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido26 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido27 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido28 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido29 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido30 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido31 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido32 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido33 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido34 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido35 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido36 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido37() {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido38 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido39 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido40 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido41 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido42 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido43 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido44 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido45 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido46 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido47 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido48 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido49 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido50 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido51 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido52 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido53 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido54 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }

    @Test
    public void testeInvalido55 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido56 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido57 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido58 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido59 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido60 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido61 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido62 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido63 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido64 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido65 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido66 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido67 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido68 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido69 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido70 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido71 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido72 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido73 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido74 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido75 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido76 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido77 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido78 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido79 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido80 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido81 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido82 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido83 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido84 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido85 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido86 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido87 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido88 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido89 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido90 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido91 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido92 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido93 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido94 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido95 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido96 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido97 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido98 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido99 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido100 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido101 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido102 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido103 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido104 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido105 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido106 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido107 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido108 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido109 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido110 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido111 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido112 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido113 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido114 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido115 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido116 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido117 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido118 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido119 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido120 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(-1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido121 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido122 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido123 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido124 () {
      
        endereco.setLogradouro("");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido125 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("aaaaaaaa");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeInvalido126 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("999999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
    
    @Test
    public void testeValido01 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("99999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertTrue(teste);
    }
    
    @Test
    public void testeInvalido127 () {
      
        endereco.setLogradouro("logradouroTeste");
        endereco.setNumero(1);
        endereco.setBairro("bairroTeste");
        endereco.setCidade("cidadeTeste");
        endereco.setCep("9999999");
        endereco.setEstado("estadoTeste");
        
        boolean teste = enderecoDAO.save(endereco);
        assertFalse(teste);
    }
}
