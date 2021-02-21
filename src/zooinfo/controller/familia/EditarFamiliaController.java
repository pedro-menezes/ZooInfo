/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller.familia;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import zooinfo.model.bean.Classe;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import zooinfo.model.bean.Familia;
import zooinfo.model.dao.ClasseDAO;
import zooinfo.model.dao.FamiliaDAO;

/**
 * FXML Controller class
 *
 * @author Matheus Rocha
 */
public class EditarFamiliaController implements Initializable {

    @FXML
    private TextField textCodigo;

    @FXML
    private TextArea textDescricao;

    @FXML
    private Button buttonCancelar;

    @FXML
    private ComboBox<Classe> comboClasse;

    @FXML
    private TextField textNome;

    private ObservableList<Classe> obsList;

    private Familia familia;
    
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
        familia.setCodigo(Integer.parseInt(textCodigo.getText()));
        familia.setDescricaoFamilia(textDescricao.getText());
        familia.setNomeFamilia(textNome.getText());
        familia.setClasse(comboClasse.getValue());

        FamiliaDAO familiaDAO = new FamiliaDAO();

        familiaDAO.alter(familia, familia.getCodigo());
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        familia = new FamiliaDAO().findById(Integer.parseInt(textCodigo.getText()));

        if (familia != null) {
            textNome.setText(familia.getNomeFamilia());
            textDescricao.setText(familia.getDescricaoFamilia());
            comboClasse.setValue(familia.getClasse());
        } else {
            System.out.println("Não encontrado");
        }
    }

    private void preencherCombo() {
        obsList = FXCollections.observableArrayList(new ClasseDAO().findAll());
        comboClasse.setItems(obsList);
    }
}
