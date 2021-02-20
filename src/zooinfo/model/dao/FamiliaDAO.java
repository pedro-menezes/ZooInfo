/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import zooinfo.connection.ConnectionFactory;
import zooinfo.model.bean.Familia;

/**
 *
 * @author pedro-menezes
 */
public class FamiliaDAO implements CRUD<Familia, Integer> {

    @Override
    public Familia save(Familia familia) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            if (familia.getCodigo() == null) {
                em.merge(familia);
            } else {
                em.persist(familia);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println(e);
        } finally {
            em.close();
        }

        return familia;
    }
    
    public Familia alter(Familia familia, int codigo) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            Familia familiaAux = em.find(Familia.class, codigo);
            familiaAux.setCodigo(familia.getCodigo());
            familiaAux.setNomeFamilia(familia.getNomeFamilia());
            familiaAux.setDescricaoFamilia(familia.getDescricaoFamilia());
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return familia;
    }

    @Override
    public Familia findById(Integer codigo) {
        EntityManager em = new ConnectionFactory().getConnection();
        Familia familia = null;

        try {
            familia = em.find(Familia.class, codigo);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return familia;
    }

    @Override
    public List<Familia> findAll() {

        EntityManager em = new ConnectionFactory().getConnection();
        List<Familia> familias = null;

        try {
            familias = em.createQuery("from Familia e").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return familias;
    }

    @Override
    public Familia remove(Integer codigo) {

        EntityManager em = new ConnectionFactory().getConnection();
        Familia familia = null;

        try {
            familia = em.find(Familia.class, codigo);
            em.getTransaction().begin();
            em.remove(familia);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return familia;
    }
    
     public boolean exist(Familia familia) {
        List<Familia> familias = findAll();

        for (Familia familiaAux : familias) {
            if (familia.getNomeFamilia().equals(familiaAux.getNomeFamilia())) {
                return true;
            }
        }
        return false;
    }
}
