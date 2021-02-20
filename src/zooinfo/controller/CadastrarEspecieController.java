/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import zooinfo.model.bean.Especie;
import zooinfo.model.bean.Familia;
import zooinfo.model.dao.EspecieDAO;
import zooinfo.model.dao.FamiliaDAO;

/**
 * FXML Controller class
 *
 * @author Matheus Rocha
 */
public class CadastrarEspecieController implements Initializable {

    @FXML
    private ComboBox<Familia> comboFamilia;

    @FXML
    private Button buttonCancelar;

    @FXML
    private TextField textNome;

    @FXML
    private TextArea textDescricao;

    private ObservableList<Familia> obsList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        preencherCombo();
    }

    @FXML
    void acaoCancelar(ActionEvent event) {
        Stage stage = (Stage) buttonCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void acaoCadastrar(ActionEvent event) {
        Especie especie = new Especie();
        especie.setDescricaoEspecie(textDescricao.getText());
        especie.setNomeEspecie(textNome.getText());
        especie.setFamilia(comboFamilia.getValue());
        
        EspecieDAO especieDAO = new EspecieDAO();
        if (!especieDAO.exist(especie)) {
            especieDAO.save(especie);
            acaoCancelar(event);
        } else {
            System.out.println("Já existe");
        }

    }

    private void preencherCombo() {
        obsList = FXCollections.observableArrayList(new FamiliaDAO().findAll());
        comboFamilia.setItems(obsList);
    }
}
