/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.stage.Stage;
import zooinfo.model.dao.AnimalDAO;
import zooinfo.model.dao.ClasseDAO;
import zooinfo.model.dao.DepartamentoDAO;
import zooinfo.model.dao.EspecieDAO;
import zooinfo.model.dao.FamiliaDAO;
import zooinfo.model.dao.FuncionarioDAO;
import zooinfo.model.dao.VendaDAO;

/**
 * FXML Controller class
 *
 * @author pedro-menezes
 */
public class MenuController implements Initializable {

    @FXML
    private ListView<Object> listView;
    
    @FXML
    private Menu menuFuncionarios;

    @FXML
    private void acaoCadastarAnimal(ActionEvent evt) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/animal/CadastrarAnimal.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoCadastrarVenda(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/venda/CadastrarVendas.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoCadastrarDepartamento(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/departamento/CadastrarDepartamento.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoEditarAnimal(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/animal/EditarAnimal.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoEditarVenda(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/venda/EditarVendas.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoCadastrarEspecie(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/especie/CadastrarEspecie.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoEditarEspecie(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/especie/EditarEspecie.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoCadastrarFamilia(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/familia/CadastrarFamilia.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoEditarFamilia(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/familia/EditarFamilia.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoCadastrarClasse(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/classe/CadastrarClasse.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoEditarClasse(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/classe/EditarClasse.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoEditarDepartamento(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/departamento/EditarDepartamento.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoEditarFuncionario(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/funcionario/EditarFuncionario.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoExcluirFuncionario(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/funcionario/ExcluirFuncionario.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoExcluirAnimal(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/animal/ExcluirAnimal.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoCadastrarFuncionario(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/funcionario/CadastroFuncionario.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoExcluirEspecie(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/especie/ExcluirEspecie.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoExcluirFamilia(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/familia/ExcluirFamilia.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoExcluirClasse(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/classe/ExcluirClasse.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoExcluirVenda(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/venda/ExcluirVendas.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void acaoExcluirDepartamento(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        URL url = getClass().getResource("/zooinfo/view/departamento/ExcluirDepartamento.fxml");
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
        if (!SessaoController.getInstance().getTipo().equals("zooinfo.model.bean.Gerente")) {
            menuFuncionarios.setVisible(false);
        }
    }

    @FXML
    void listarAnimais(ActionEvent event) {
        ObservableList<Object> items = FXCollections.observableArrayList(new AnimalDAO().findAll());
        listView.setItems(items);
    }

    @FXML
    void listarEspecies(ActionEvent event) {
        ObservableList<Object> items = FXCollections.observableArrayList(new EspecieDAO().findAll());
        listView.setItems(items);
    }

    @FXML
    void listarFamilias(ActionEvent event) {
        ObservableList<Object> items = FXCollections.observableArrayList(new FamiliaDAO().findAll());
        listView.setItems(items);
    }

    @FXML
    void listarClasses(ActionEvent event) {
        ObservableList<Object> items = FXCollections.observableArrayList(new ClasseDAO().findAll());
        listView.setItems(items);
    }

    @FXML
    void listarDepartamentos(ActionEvent event) {
        ObservableList<Object> items = FXCollections.observableArrayList(new DepartamentoDAO().findAll());
        listView.setItems(items);
    }

    @FXML
    void listarFuncionarios(ActionEvent event) {
        ObservableList<Object> items = FXCollections.observableArrayList(new FuncionarioDAO().findAll());
        listView.setItems(items);
    }

    @FXML
    void listarVendas(ActionEvent event) {
        ObservableList<Object> items = FXCollections.observableArrayList(new VendaDAO().findAll());
        listView.setItems(items);
    }
}
