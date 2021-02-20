/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import zooinfo.connection.ConnectionFactory;
import zooinfo.model.bean.Especie;

/**
 *
 * @author pedro-menezes
 */
public class EspecieDAO implements CRUD<Especie, Integer> {

    @Override
    public Especie save(Especie especie) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            if (especie.getCodigo() == null) {
                em.merge(especie);
            } else {
                em.persist(especie);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println(e);
        } finally {
            em.close();
        }

        return especie;
    }
    
    public Especie alter(Especie especie, int codigo) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            Especie especieAux = em.find(Especie.class, codigo);
            especieAux.setCodigo(especie.getCodigo());
            especieAux.setNomeEspecie(especie.getNomeEspecie());
            especieAux.setDescricaoEspecie(especie.getDescricaoEspecie());
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return especie;
    }

    @Override
    public Especie findById(Integer codigo) {
        EntityManager em = new ConnectionFactory().getConnection();
        Especie especie = null;

        try {
            especie = em.find(Especie.class, codigo);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return especie;
    }

    @Override
    public List<Especie> findAll() {

        EntityManager em = new ConnectionFactory().getConnection();
        List<Especie> enderecos = null;

        try {
            enderecos = em.createQuery("from Especie e").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return enderecos;
    }

    @Override
    public Especie remove(Integer codigo) {

        EntityManager em = new ConnectionFactory().getConnection();
        Especie especie = null;

        try {
            especie = em.find(Especie.class, codigo);
            em.getTransaction().begin();
            em.remove(especie);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return especie;
    }

    public boolean exist(Especie especie) {
        List<Especie> especies = findAll();

        for (Especie especieAux : especies) {
            if (especie.getNomeEspecie().equals(especieAux.getNomeEspecie())) {
                return true;
            }
        }
        return false;
    }
}
