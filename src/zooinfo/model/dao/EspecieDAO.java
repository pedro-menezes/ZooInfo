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

/**
 *
 * @author pedro-menezes
 */
public class EspecieDAO implements CRUD<Especie, Integer> {

    @Override
    public boolean save(Especie especie) {

        EntityManager em = new ConnectionFactory().getConnection();
        
        if (caractereEspecial(especie.getNomeEspecie()) == true || especie.getNomeEspecie().equals("")
            || especie.getDescricaoEspecie().equals("") || especie.getFamilia() == null) {
    		em.close();
    		return false;
    	}
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

        return true;
    }
    
    public Especie alter(Especie especie, int codigo) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            Especie especieAux = em.find(Especie.class, codigo);
            especieAux.setCodigo(especie.getCodigo());
            especieAux.setNomeEspecie(especie.getNomeEspecie());
            especieAux.setDescricaoEspecie(especie.getDescricaoEspecie());
            especieAux.setFamilia(especie.getFamilia());
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
    public boolean remove(Integer codigo) {

        EntityManager em = new ConnectionFactory().getConnection();
        Especie especie = null;

        try {
            especie = em.find(Especie.class, codigo);
            if (especie == null || existAnimal(especie) == true) {
				em.close();
				return false;
			}
            em.getTransaction().begin();
            em.remove(especie);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return true;
    }
    
    public Integer find(Especie especie) {
        List<Especie> especies = findAll();

        for (Especie especieAux : especies) {
            if (especie.getDescricaoEspecie().equals(especieAux.getDescricaoEspecie()) && especie.getNomeEspecie().equals(especieAux.getNomeEspecie())) {
            	return especieAux.getCodigo();
        	}
        }

        return null;
    }
    
    public boolean caractereEspecial(String texto) {
        for (char c : texto.toCharArray()) {
            if (!Character.isLetter(c)) {
                return true;
            }
        }
        
        return false;
    }
    
    private boolean existAnimal(Especie especie) {
        List<Animal> animais = new AnimalDAO().findAll();
        for (Animal animal : animais) {
            Especie especieAux = new AnimalDAO().findById(animal.getCodigo()).getEspecie();
            if (especie.getCodigo().equals(especieAux.getCodigo())) {
                return true;
            }
        }
        return false;
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
