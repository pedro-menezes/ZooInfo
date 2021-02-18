/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import zooinfo.connection.ConnectionFactory;
import zooinfo.model.bean.Classe;

/**
 *
 * @author pedro-menezes
 */
public class ClasseDAO implements CRUD<Classe, Integer>{

   @Override
   public Classe save(Classe classe) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            if (classe.getCodigo() == null) {
                em.merge(classe);
            } else {
                em.persist(classe);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println(e);
        } finally {
            em.close();
        }

        return classe;
    }

   @Override
    public Classe findById(Integer codigo) {
        EntityManager em = new ConnectionFactory().getConnection();
        Classe classe = null;

        try {
            classe = em.find(Classe.class, classe);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return classe;
    }

   @Override
    public List<Classe> findAll() {

        EntityManager em = new ConnectionFactory().getConnection();
        List<Classe> classe = null;

        try {
            classe = em.createQuery("from Classe c").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return classe;
    }

   @Override
    public Classe remove(Integer codigo) {

        EntityManager em = new ConnectionFactory().getConnection();
        Classe classe = null;

        try {
            classe = em.find(Classe.class, codigo);
            em.getTransaction().begin();
            em.remove(classe);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return classe;
    }
}
