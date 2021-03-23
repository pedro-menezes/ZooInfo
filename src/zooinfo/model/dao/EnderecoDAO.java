/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import zooinfo.connection.ConnectionFactory;
import zooinfo.model.bean.Endereco;

/**
 *
 * @author pedro-menezes
 */
public class EnderecoDAO implements CRUD<Endereco, Integer> {

    @Override
    public boolean save(Endereco endereco) {
        EntityManager em = new ConnectionFactory().getConnection();
        if(endereco.getLogradouro().equals("") || endereco.getNumero() < 0  
           || endereco.getBairro().equals("") || endereco.getCidade().equals("")
           || caractereDigito(endereco.getCep()) == false || endereco.getCep().length() != 8
           || endereco.getCep().equals("") || endereco.getEstado().equals("")) {
        	em.close();
        	return false;
        }
        try {
            em.getTransaction().begin();
            if (endereco.getCodigo() == null) {
                em.merge(endereco);
            } else {
                em.persist(endereco);
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
    
    public Endereco alter(Endereco endereco, int codigo) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            Endereco enderecoAux = em.find(Endereco.class, codigo);
            enderecoAux.setCep(endereco.getCep());
            enderecoAux.setLogradouro(endereco.getLogradouro());
            enderecoAux.setNumero(endereco.getNumero());
            enderecoAux.setBairro(endereco.getBairro());
            enderecoAux.setCidade(endereco.getCidade());
            enderecoAux.setEstado(endereco.getEstado());
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return endereco;
    }

    @Override
    public Endereco findById(Integer codigo) {
        EntityManager em = new ConnectionFactory().getConnection();
        Endereco endereco = null;

        try {
            endereco = em.find(Endereco.class, endereco);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return endereco;
    }

    @Override
    public List<Endereco> findAll() {

        EntityManager em = new ConnectionFactory().getConnection();
        List<Endereco> enderecos = null;

        try {
            enderecos = em.createQuery("from Endereco e").getResultList();
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
        Endereco endereco = null;

        try {
            endereco = em.find(Endereco.class, codigo);
            em.getTransaction().begin();
            em.remove(endereco);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return true;
    }
    
    public boolean caractereDigito(String texto) {
        for (char c : texto.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        
        return true;
    }

    public Integer find(Endereco endereco) {
        List<Endereco> enderecos = findAll();

        for (Endereco enderecoAux : enderecos) {
            if (endereco.getLogradouro().equals(enderecoAux.getLogradouro())
                    && endereco.getBairro().equals(enderecoAux.getBairro())
                    && endereco.getCidade().equals(enderecoAux.getCidade())
                    && endereco.getEstado().equals(enderecoAux.getEstado())
                    && endereco.getNumero() == enderecoAux.getNumero()) {
                return enderecoAux.getCodigo();
            }
        }

        return null;
    }
}
