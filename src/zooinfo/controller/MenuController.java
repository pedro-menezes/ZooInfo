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
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pedro-menezes
 */
public class MenuController implements Initializable {

    @FXML
    private void acaoCadastarAnimal(ActionEvent evt) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/CadastrarAnimal.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoCadastrarFuncionario(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/CadastroFuncionario.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoCadastrarVenda(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/CadastrarVendas.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoCadastrarDepartamento(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/CadastrarDepartamento.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoEditarAnimal(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/EditarAnimal.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoEditarVenda(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/EditarVendas.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoCadastrarEspecie(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/CadastrarEspecie.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoEditarEspecie(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/EditarEspecie.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoCadastrarFamilia(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/CadastrarFamilia.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoEditarFamilia(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/EditarFamilia.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoCadastrarClasse(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/CadastrarClasse.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoEditarClasse(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/EditarClasse.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
