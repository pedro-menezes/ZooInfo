/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import zooinfo.connection.ConnectionFactory;
import zooinfo.model.bean.Animal;
import zooinfo.model.bean.Especie;
import zooinfo.model.bean.Familia;

/**
 *
 * @author pedro-menezes
 */
public class FamiliaDAO implements CRUD<Familia, Integer> {

    @Override
    public boolean save(Familia familia) {

        EntityManager em = new ConnectionFactory().getConnection();

        if (caractereEspecial(familia.getNomeFamilia()) == true || familia.getNomeFamilia().equals("")
                || familia.getDescricaoFamilia().equals("") || familia.getClasse() == null) {
        		em.close();
        		return false;
        }
        
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

        return true;
    }
    
    public Familia alter(Familia familia, int codigo) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            Familia familiaAux = em.find(Familia.class, codigo);
            familiaAux.setCodigo(familia.getCodigo());
            familiaAux.setNomeFamilia(familia.getNomeFamilia());
            familiaAux.setDescricaoFamilia(familia.getDescricaoFamilia());
            familiaAux.setClasse(familia.getClasse());
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
    
    public Integer find(Familia familia) {
        List<Familia> familias = findAll();

        for (Familia familiaAux : familias) {
            if (familia.getDescricaoFamilia().equals(familiaAux.getDescricaoFamilia()) && familia.getNomeFamilia().equals(familiaAux.getNomeFamilia())) {
            	return familiaAux.getCodigo();
        	}
        }

        return null;
    }

    @Override
    public boolean remove(Integer codigo) {

        EntityManager em = new ConnectionFactory().getConnection();
        Familia familia = null;

        try {
            familia = em.find(Familia.class, codigo);
            if (familia == null || existEspecie(familia) == true) {
				em.close();
				return false;
			}
            em.getTransaction().begin();
            em.remove(familia);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
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
    
    private boolean existEspecie(Familia familia) {
        List<Especie> especies = new EspecieDAO().findAll();
        for (Especie especie : especies) {
            Familia familiaAux = new EspecieDAO().findById(especie.getCodigo()).getFamilia();
            if (familia.getCodigo().equals(familiaAux.getCodigo())) {
                return true;
            }
        }
        return false;
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
