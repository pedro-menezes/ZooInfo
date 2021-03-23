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
public class AlimentacaoDAO implements CRUD<Alimentacao, Integer> {

    @Override
    public boolean save(Alimentacao alimentacao) {
    	
        EntityManager em = new ConnectionFactory().getConnection();

        if(alimentacao.getQuantidade()<= 0) {
     	   em.close();
     	   return false;
        }
        if(alimentacao.getDescricao().equals("")) {
            em.close();
     	   return false;
        }
        
        if (find(alimentacao) == null) {
        	try {
                em.getTransaction().begin();
                if (alimentacao.getCodigo() == null) {
                    em.merge(alimentacao);
                } else {
                    em.persist(alimentacao);
                }
                em.getTransaction().commit();
            } catch (Exception e) {
                em.getTransaction().rollback();
                System.err.println(e);
            } finally {
                em.close();
            }
        }
        return true;
    }

    @Override
    public Alimentacao findById(Integer codigo) {
        EntityManager em = new ConnectionFactory().getConnection();
        Alimentacao alimentacao = null;

        try {
            alimentacao = em.find(Alimentacao.class, alimentacao);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return alimentacao;
    }

    @Override
    public List<Alimentacao> findAll() {

        EntityManager em = new ConnectionFactory().getConnection();
        List<Alimentacao> alimentacao = null;

        try {
            alimentacao = em.createQuery("from Alimentacao a").getResultList();
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
        Alimentacao alimentacao = null;
        try {
        	alimentacao = em.find(Alimentacao.class, codigo);
        	if (alimentacao == null) {
				em.close();
				return false;
			}
            em.getTransaction().begin();
            em.remove(alimentacao);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return true;
    }

    public Integer find(Alimentacao alimentacao) {
        List<Alimentacao> alimentacoes = findAll();

        for (Alimentacao alimentacaoAux : alimentacoes) {
            if (alimentacao.getDescricao().equals(alimentacaoAux.getDescricao()) && alimentacao.getQuantidade() == alimentacaoAux.getQuantidade()) {
                return alimentacaoAux.getCodigo();
            }
        }

        return null;
    }
    
    public boolean exist(Alimentacao alimentacao) {
        List<Alimentacao> alimentacoes = findAll();

        for (Alimentacao alimentacaoAux : alimentacoes) {
            if (alimentacao.getDescricao().equals(alimentacaoAux.getDescricao()) && alimentacao.getQuantidade() == alimentacaoAux.getQuantidade()) {
                return true;
            }
        }

        return false;
    }
}
