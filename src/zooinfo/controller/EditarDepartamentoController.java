/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import zooinfo.model.bean.Departamento;
import zooinfo.model.dao.DepartamentoDAO;

/**
 * FXML Controller class
 *
 * @author Lucas
 */
public class EditarDepartamentoController implements Initializable {

    @FXML
    private TextField textCodigo;

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonPesquisar;

    @FXML
    private Button buttonSalvar;

    @FXML
    private TextField textNome;
    
    private Departamento departamento;

    @FXML
    void acaoCancelar(ActionEvent event) {
        Stage stage = (Stage) buttonCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void acaoSalvar(ActionEvent event) {
        departamento.setNomeDepto(textNome.getText());
        
        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        departamentoDAO.alter(departamento, departamento.getCodigo());
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        departamento = new DepartamentoDAO().findById(Integer.parseInt(textCodigo.getText()));
        textNome.setText(departamento.getNomeDepto());
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
