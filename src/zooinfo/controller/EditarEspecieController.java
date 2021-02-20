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
public class EditarEspecieController implements Initializable {

    @FXML
    private TextField textCodigo;

    @FXML
    private TextArea textDescricao;

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonPesquisar;

    @FXML
    private Button buttonSalvar;

    @FXML
    private TextField textNome;

    @FXML
    private ComboBox<Familia> comboFamilia;

    private Especie especie;

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
    void acaoSalvar(ActionEvent event) {
        especie.setCodigo(Integer.parseInt(textCodigo.getText()));
        especie.setDescricaoEspecie(textDescricao.getText());
        especie.setNomeEspecie(textNome.getText());
        especie.setFamilia(comboFamilia.getValue());

        EspecieDAO especieDAO = new EspecieDAO();

        especieDAO.alter(especie, especie.getCodigo());
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        especie = new EspecieDAO().findById(Integer.parseInt(textCodigo.getText()));
        for (Especie especie1 : new EspecieDAO().findAll()) {
            System.out.println("___NOME___ " + especie1.getNomeEspecie());
            System.out.println("____ID_____ " + especie1.getCodigo());
        }
        
        if (especie != null) {
            textNome.setText(especie.getNomeEspecie());
            textDescricao.setText(especie.getDescricaoEspecie());
            comboFamilia.setValue(especie.getFamilia());
        } else {
            System.out.println("Não encontrado");
        }
    }

    private void preencherCombo() {
        obsList = FXCollections.observableArrayList(new FamiliaDAO().findAll());
        comboFamilia.setItems(obsList);
    }

}
