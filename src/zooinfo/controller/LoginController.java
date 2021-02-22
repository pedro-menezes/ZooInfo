/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import zooinfo.model.bean.Funcionario;
import zooinfo.model.bean.Login;
import zooinfo.model.dao.FuncionarioDAO;
import zooinfo.model.dao.LoginDAO;

/**
 * FXML Controller class
 *
 * @author pedro-menezes
 */
public class LoginController implements Initializable {

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
        SessaoController sessao = SessaoController.getInstance();
        if (loginAux != null && textSenha.getText().equals(loginAux.getSenha())) {

            Funcionario funcionario = null;
            List<Funcionario> lista = new FuncionarioDAO().findAll();
            for (Funcionario funcionarioAux : lista) {
                if (funcionarioAux.getLogin().getUser().equals(loginAux.getUser())) {
                    funcionario = funcionarioAux;
                }
            }
            sessao.setFuncionario(funcionario);
            
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/zooinfo/view/Menu.fxml"));
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            Stage stageAnterior = (Stage) buttonEntrar.getScene().getWindow();
            stageAnterior.close();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login");
            alert.setContentText("Dado(s) incorreto(s)!");
            alert.showAndWait();
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
