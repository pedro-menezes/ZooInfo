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

/**
 *
 * @author pedro-menezes
 */
public class FuncionarioDAO implements CRUD<Funcionario, String>{

   @Override
   public Funcionario save(Funcionario funcionario) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            if (funcionario.getCpf()== null) {
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

        return funcionario;
    }

   @Override
    public Funcionario findById(String cpf) {
        EntityManager em = new ConnectionFactory().getConnection();
        Funcionario funcionario = null;

        try {
            funcionario = em.find(Funcionario.class, funcionario);
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

   @Override
    public Funcionario remove(String cpf) {

        EntityManager em = new ConnectionFactory().getConnection();
        Funcionario funcionario = null;

        try {
            funcionario = em.find(Funcionario.class, cpf);
            em.getTransaction().begin();
            em.remove(funcionario);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return funcionario;
    }
}
