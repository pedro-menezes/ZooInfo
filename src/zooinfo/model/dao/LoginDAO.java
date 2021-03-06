/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import zooinfo.connection.ConnectionFactory;
import zooinfo.model.bean.Login;

/**
 *
 * @author pedro-menezes
 */
public class LoginDAO {

    public Login save(Login login) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            if (login.getUser() == null) {
                em.persist(login);
            } else {
                em.merge(login);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println(e);
        } finally {
            em.close();
        }

        return login;
    }
    
    public Login alter(Login login, String user) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            Login loginAux = em.find(Login.class, user);
            loginAux.setUser(login.getUser());
            loginAux.setSenha(login.getSenha());
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return login;
    }

    public Login findById(String user) {
        EntityManager em = new ConnectionFactory().getConnection();
        Login login = null;

        try {
            login = em.find(Login.class, user);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return login;
    }

    public List<Login> findAll() {

        EntityManager em = new ConnectionFactory().getConnection();
        List<Login> logins = null;

        try {
            logins = em.createQuery("from Login l").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return logins;
    }

    public Login remove(String user) {

        EntityManager em = new ConnectionFactory().getConnection();
        Login login = null;

        try {
            login = em.find(Login.class, user);
            em.getTransaction().begin();
            em.remove(login);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return login;
    }
    
     public boolean exist(Login login) {
        List<Login> logins = findAll();

        for (Login loginAux : logins) {
            if (login.getUser().equals(loginAux.getUser())){
                return true;
            }
        }

        return false;
    }
}
