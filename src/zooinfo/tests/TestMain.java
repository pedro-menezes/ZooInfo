/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.tests;

import zooinfo.model.bean.Login;
import zooinfo.model.dao.LoginDAO;

/**
 *
 * @author pedro-menezes
 */
public class TestMain {
    public static void main(String[] args) {
        Login login = new Login("user3","senha123");
        
        LoginDAO dao = new LoginDAO();
        login = dao.save(login);
        
        System.out.println("user "+login.getUser());
        System.out.println("senha "+login.getSenha());
        
        login = dao.findById("user1");
        
        System.out.println("Senha user 1"+login.getSenha());
    }
}
