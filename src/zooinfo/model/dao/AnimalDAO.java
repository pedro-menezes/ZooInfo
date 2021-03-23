/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import zooinfo.connection.ConnectionFactory;
import zooinfo.model.bean.Alimentacao;
import zooinfo.model.bean.Animal;

/**
 *
 * @author pedro-menezes
 */
public class AnimalDAO implements CRUD<Animal, Integer> {

    @Override
    public boolean save(Animal animal) {

        EntityManager em = new ConnectionFactory().getConnection();
        
        if (caractereEspecial(animal.getNomeAnimal()) == true || animal.getDataNascimento() == null
            || animal.getEspecie() == null || animal.getNomeAnimal().equals("")) {
			em.close();
			return false;
		}
        try {
            if (animal.getCodigo() == null) {
                em.persist(animal);
            } else {
                em.merge(animal);
            }
            em.getTransaction().begin();
            em.persist(animal);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return true;
    }
    
    public Animal alter(Animal animal, int codigo) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            Animal animalAux = em.find(Animal.class, codigo);
            animalAux.setCodigo(animal.getCodigo());
            animalAux.setNomeAnimal(animal.getNomeAnimal());
            animalAux.setAlimentacao(animal.getAlimentacao());
            animalAux.setDataNascimento(animal.getDataNascimento());
            animalAux.setEspecie(animal.getEspecie());
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return animal;
    }

    @Override
    public Animal findById(Integer codigo) {

        EntityManager em = new ConnectionFactory().getConnection();
        Animal animal = null;

        try {
            animal = em.find(Animal.class, codigo);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return animal;
    }

    @Override
    public List<Animal> findAll() {

        EntityManager em = new ConnectionFactory().getConnection();
        List<Animal> alimentacao = null;

        try {
            alimentacao = em.createQuery("from Animal a").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return alimentacao;
    }

    @Override
    public boolean remove(Integer codigo) {

        EntityManager em = new ConnectionFactory().getConnection();
        Animal animal = null;
        try {
            animal = em.find(Animal.class, codigo);
            if (animal == null) {
				em.close();
				return false;
			}
            em.getTransaction().begin();
            em.remove(animal);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return true;
    }
    
    public Integer find(Animal animal) {
        List<Animal> animais = findAll();

        for (Animal animalAux : animais) {
            if (animal.getDataNascimento().equals(animalAux.getDataNascimento()) && animal.getNomeAnimal().equals(animalAux.getNomeAnimal())
            	&& animal.getEspecie().equals(animalAux.getEspecie())) {
                return animalAux.getCodigo();
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
}
