/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import zooinfo.connection.ConnectionFactory;
import zooinfo.model.bean.Venda;

/**
 *
 * @author pedro-menezes
 */
public class VendaDAO implements CRUD<Venda, Integer>{

   @Override
   public Venda save(Venda venda) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            if (venda.getCodigo() == null) {
                em.merge(venda);
            } else {
                em.persist(venda);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println(e);
        } finally {
            em.close();
        }

        return venda;
    }

   @Override
    public Venda findById(Integer codigo) {
        EntityManager em = new ConnectionFactory().getConnection();
        Venda venda = null;

        try {
            venda = em.find(Venda.class, venda);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return venda;
    }

   @Override
    public List<Venda> findAll() {

        EntityManager em = new ConnectionFactory().getConnection();
        List<Venda> vendas = null;

        try {
            vendas = em.createQuery("from Venda e").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return vendas;
    }

   @Override
    public Venda remove(Integer codigo) {

        EntityManager em = new ConnectionFactory().getConnection();
        Venda venda = null;

        try {
            venda = em.find(Venda.class, codigo);
            em.getTransaction().begin();
            em.remove(venda);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return venda;
    }
}
