/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import zooinfo.connection.ConnectionFactory;
import zooinfo.model.bean.Funcionario;
import zooinfo.model.bean.Login;

/**
 *
 * @author pedro-menezes
 */
public class FuncionarioDAO implements CRUD<Funcionario, String> {

    @Override
    public boolean save(Funcionario funcionario) {

        EntityManager em = new ConnectionFactory().getConnection();
        if(caractereDigito(funcionario.getCpf()) == false || funcionario.getCpf().length() != 11 || funcionario.getNome().equals("")
           || caractereEspecial(funcionario.getNome()) == true || funcionario.getDataNascimento() == null 
           || funcionario.getSalario() < 0 || funcionario.getDepartamento() == null || funcionario.getLogin() == null) {
        		em.close();
        		return false;
        }
        try {
            em.getTransaction().begin();
            if (funcionario.getCpf() == null) {
                em.merge(funcionario);
            } else {
                em.persist(funcionario);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println(e);
        } finally {
            em.close();
        }

        return true;
    }

    public Funcionario alter(Funcionario funcionario, String codigo) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            Funcionario funcionarioAux = em.find(Funcionario.class, codigo);

            funcionarioAux.setCpf(funcionario.getCpf());
            funcionarioAux.setNome(funcionario.getNome());
            funcionarioAux.setDataNascimento(funcionario.getDataNascimento());
            funcionarioAux.setDataAdmissao(funcionario.getDataAdmissao());
            funcionarioAux.setDepartamento(funcionario.getDepartamento());
            funcionarioAux.setSalario(funcionario.getSalario());
            funcionarioAux.setSexo(funcionario.getSexo());
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return funcionario;
    }

    @Override
    public Funcionario findById(String cpf) {
        EntityManager em = new ConnectionFactory().getConnection();
        Funcionario funcionario = null;

        try {
            funcionario = em.find(Funcionario.class, cpf);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return funcionario;
    }

    @Override
    public List<Funcionario> findAll() {

        EntityManager em = new ConnectionFactory().getConnection();
        List<Funcionario> funcionarios = null;

        try {
            funcionarios = em.createQuery("from Funcionario f").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return funcionarios;
    }
    
    public boolean caractereDigito(String texto) {
        for (char c : texto.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean caractereEspecial(String texto) {
        for (char c : texto.toCharArray()) {
            if (!Character.isLetter(c)) {
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public boolean remove(String cpf) {

        EntityManager em = new ConnectionFactory().getConnection();
        Funcionario funcionario = null;

        try {
            funcionario = em.find(Funcionario.class, cpf);
            if (funcionario == null) {
				em.close();
				return false;
			}
            em.getTransaction().begin();
            em.remove(funcionario);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return true;
    }
}
