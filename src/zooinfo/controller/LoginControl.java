/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import zooinfo.model.bean.Login;
import zooinfo.model.dao.LoginDAO;

/**
 * FXML Controller class
 *
 * @author pedro-menezes
 */
public class LoginControl implements Initializable {

    @FXML
    private PasswordField textSenha;

    @FXML
    private TextField textUser;

    @FXML
    private Button buttonEntrar;

    @FXML
    private void acaoButtonLogin(ActionEvent evt) throws IOException {
        LoginDAO loginDAO = new LoginDAO();
        Login loginAux = loginDAO.findById(textUser.getText());

        if (loginAux != null && textSenha.getText().equals(loginAux.getSenha())) {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/zooinfo/view/Menu.fxml"));
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            Stage stageAnterior = (Stage) buttonEntrar.getScene().getWindow();
            stageAnterior.close();
        } else {

        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
