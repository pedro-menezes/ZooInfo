/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller.especie;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
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
        if (!vazio()) {
            especie.setCodigo(Integer.parseInt(textCodigo.getText()));
            especie.setDescricaoEspecie(textDescricao.getText());
            especie.setNomeEspecie(textNome.getText());
            especie.setFamilia(comboFamilia.getValue());

            EspecieDAO especieDAO = new EspecieDAO();

            especieDAO.alter(especie, especie.getCodigo());
            acaoCancelar(event);
        }
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        if (!textCodigo.getText().equals("")) {
            especie = new EspecieDAO().findById(Integer.parseInt(textCodigo.getText()));

            if (especie != null) {
                textNome.setText(especie.getNomeEspecie());
                textDescricao.setText(especie.getDescricaoEspecie());
                comboFamilia.setValue(especie.getFamilia());
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Alterar Especie");
                alert.setContentText("Não encontrado");
                alert.showAndWait();
            }
        }
    }

    private void preencherCombo() {
        obsList = FXCollections.observableArrayList(new FamiliaDAO().findAll());
        comboFamilia.setItems(obsList);
    }

    private boolean vazio() {
        if (textNome.getText().equals("") || textCodigo.getText().equals("") || comboFamilia.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Alterar Especie");
            alert.setContentText("Alguma entrada vazia!");
            alert.showAndWait();
            return true;
        }
        return false;
    }
}
