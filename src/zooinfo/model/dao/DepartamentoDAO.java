/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import zooinfo.connection.ConnectionFactory;
import zooinfo.model.bean.Departamento;

/**
 *
 * @author pedro-menezes
 */
public class DepartamentoDAO implements CRUD<Departamento, Integer> {

    @Override
    public boolean save(Departamento departamento) {

        EntityManager em = new ConnectionFactory().getConnection();
        if (departamento.getNomeDepto().equals("")) {
			em.close();
			return false;
		}
        try {
            em.getTransaction().begin();
            if (departamento.getCodigo() == null) {
                em.merge(departamento);
            } else {
                em.persist(departamento);
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

    public Departamento alter(Departamento departamento, int codigo) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            Departamento departamentoAux = em.find(Departamento.class, codigo);
            departamentoAux.setCodigo(departamento.getCodigo());
            departamentoAux.setNomeDepto(departamento.getNomeDepto());
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return departamento;
    }

    @Override
    public Departamento findById(Integer codigo) {
        EntityManager em = new ConnectionFactory().getConnection();
        Departamento departamento = null;

        try {
            departamento = em.find(Departamento.class, codigo);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return departamento;
    }

    @Override
    public List<Departamento> findAll() {

        EntityManager em = new ConnectionFactory().getConnection();
        List<Departamento> departamento = null;

        try {
            departamento = em.createQuery("from Departamento d").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return departamento;
    }

    @Override
    public boolean remove(Integer codigo) {

        EntityManager em = new ConnectionFactory().getConnection();
        Departamento departamento = null;
        
        try {
            departamento = em.find(Departamento.class, codigo);
            if (departamento == null) {
    			em.close();
    			return false;
    		}
            em.getTransaction().begin();
            em.remove(departamento);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return true;
    }

    public boolean exist(Departamento departamento) {
        List<Departamento> depatamentos = findAll();

        for (Departamento departamentoAux : depatamentos) {
            if (departamento.getNomeDepto().equals(departamentoAux.getNomeDepto())) {
                return true;
            }
        }

        return false;
    }
}
