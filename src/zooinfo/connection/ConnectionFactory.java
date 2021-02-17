/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pedro-menezes
 */
public class ConnectionFactory {
   
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("zooinfo");

    public EntityManager getConnection(){
        return emf.createEntityManager();
    }
}
