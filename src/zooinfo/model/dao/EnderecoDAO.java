/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import zooinfo.connection.ConnectionFactory;
import zooinfo.model.bean.Endereco;

/**
 *
 * @author pedro-menezes
 */
public class EnderecoDAO implements CRUD<Endereco, Integer>{

   @Override
   public Endereco save(Endereco endereco) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            if (endereco.getCodigo() == null) {
                em.merge(endereco);
            } else {
                em.persist(endereco);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println(e);
        } finally {
            em.close();
        }

        return endereco;
    }

   @Override
    public Endereco findById(Integer codigo) {
        EntityManager em = new ConnectionFactory().getConnection();
        Endereco endereco = null;

        try {
            endereco = em.find(Endereco.class, endereco);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return endereco;
    }

   @Override
    public List<Endereco> findAll() {

        EntityManager em = new ConnectionFactory().getConnection();
        List<Endereco> enderecos = null;

        try {
            enderecos = em.createQuery("from Endereco e").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return enderecos;
    }

   @Override
    public Endereco remove(Integer codigo) {

        EntityManager em = new ConnectionFactory().getConnection();
        Endereco endereco = null;

        try {
            endereco = em.find(Endereco.class, codigo);
            em.getTransaction().begin();
            em.remove(endereco);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return endereco;
    }
}
