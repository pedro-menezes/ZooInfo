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
public class VendaDAO implements CRUD<Venda, Integer> {

    @Override
    public boolean save(Venda venda) {

        EntityManager em = new ConnectionFactory().getConnection();
        if(venda.getDataVenda() == null || venda.getFuncionario() == null) {
        	em.close();
        	return false;
        }
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

        return true;
    }

    public Venda ingressoUsado(Venda venda, int codigo) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            Venda vendaAux = em.find(Venda.class, codigo);
            vendaAux.setUsado(true);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
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
            venda = em.find(Venda.class, codigo);
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
    public boolean remove(Integer codigo) {

        EntityManager em = new ConnectionFactory().getConnection();
        Venda venda = null;

        try {
            venda = em.find(Venda.class, codigo);
            if(venda == null) {
            	em.close();
            	return false;
            }
            em.getTransaction().begin();
            em.remove(venda);
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
