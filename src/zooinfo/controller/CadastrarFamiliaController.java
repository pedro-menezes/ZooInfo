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
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import zooinfo.model.bean.Classe;
import zooinfo.model.bean.Familia;
import zooinfo.model.dao.ClasseDAO;
import zooinfo.model.dao.FamiliaDAO;

/**
 * FXML Controller class
 *
 * @author Matheus Rocha
 */
public class CadastrarFamiliaController implements Initializable {

    @FXML
    private TextArea textDescricao;

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonCadastrar;

    @FXML
    private ComboBox<Classe> comboClasse;

    @FXML
    private TextField textNome;

    private ObservableList<Classe> obsList;

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
        Familia familia = new Familia();
        familia.setNomeFamilia(textNome.getText());
        familia.setDescricaoFamilia(textDescricao.getText());
        FamiliaDAO familiaDAO = new FamiliaDAO();
        if (!familiaDAO.exist(familia)) {
            familiaDAO.save(familia);
        } else {
            System.out.println("Já existe");
        }
    }

    private void preencherCombo() {
        obsList = FXCollections.observableArrayList(new ClasseDAO().findAll());
        comboClasse.setItems(obsList);
    }
}
