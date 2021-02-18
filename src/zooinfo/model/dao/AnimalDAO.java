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

/**
 *
 * @author pedro-menezes
 */
public class AnimalDAO implements CRUD<Animal, Integer>{

    @Override
    public Animal save(Animal animal) {

        EntityManager em = new ConnectionFactory().getConnection();

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
    public Animal remove(Integer codigo) {
        
        EntityManager em = new ConnectionFactory().getConnection();
        Animal animal = null;

        try {
            animal = em.find(Animal.class, codigo);
            em.getTransaction().begin();
            em.remove(animal);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return animal;
    }
}
