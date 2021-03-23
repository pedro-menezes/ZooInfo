/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import zooinfo.connection.ConnectionFactory;
import zooinfo.model.bean.Classe;
import zooinfo.model.bean.Especie;
import zooinfo.model.bean.Familia;

/**
 *
 * @author pedro-menezes
 */
public class ClasseDAO implements CRUD<Classe, Integer>{

   @Override
   public boolean save(Classe classe) {

        EntityManager em = new ConnectionFactory().getConnection();

        if (caractereEspecial(classe.getNomeClasse()) == true || classe.getNomeClasse().equals("")
                || classe.getDescricaoClasse().equals("")) {
        		em.close();
        		return false;
        }
        try {
            em.getTransaction().begin();
            if (classe.getCodigo() == null) {
                em.merge(classe);
            } else {
                em.persist(classe);
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
   
   public Classe alter(Classe classe, int codigo) {

        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            Classe classeAux = em.find(Classe.class, codigo);
            classeAux.setCodigo(classe.getCodigo());
            classeAux.setNomeClasse(classe.getNomeClasse());
            classeAux.setDescricaoClasse(classe.getDescricaoClasse());
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return classe;
    }

   @Override
    public Classe findById(Integer codigo) {
        EntityManager em = new ConnectionFactory().getConnection();
        Classe classe = null;

        try {
            classe = em.find(Classe.class, codigo);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return classe;
    }

   @Override
    public List<Classe> findAll() {

        EntityManager em = new ConnectionFactory().getConnection();
        List<Classe> classe = null;

        try {
            classe = em.createQuery("from Classe c").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }

        return classe;
    }

   @Override
    public boolean remove(Integer codigo) {

        EntityManager em = new ConnectionFactory().getConnection();
        Classe classe = null;

        try {
            classe = em.find(Classe.class, codigo);
            if (classe == null || existFamilia(classe) == true) {
				em.close();
				return false;
			}
            em.getTransaction().begin();
            em.remove(classe);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return true;
    }
   
   public Integer find(Classe classe) {
       List<Classe> classes = findAll();

       for (Classe classeAux : classes) {
           if (classe.getDescricaoClasse().equals(classeAux.getDescricaoClasse()) && classe.getNomeClasse().equals(classeAux.getNomeClasse())) {
           	return classeAux.getCodigo();
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
   
    private boolean existFamilia(Classe classe) {
       List<Familia> familias = new FamiliaDAO().findAll();
       for (Familia familia : familias) {
           Classe classeAux = new FamiliaDAO().findById(familia.getCodigo()).getClasse();
           if (classe.getCodigo().equals(classeAux.getCodigo())) {
               return true;
           }
       }
       return false;
    }
   
     public boolean exist(Classe classe) {
        List<Classe> classes = findAll();

        for (Classe classeAux : classes) {
            if (classe.getNomeClasse().equals(classeAux.getNomeClasse())) {
                return true;
            }
        }
        return false;
    }
}
