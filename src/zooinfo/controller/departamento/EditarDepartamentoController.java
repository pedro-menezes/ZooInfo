/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller.departamento;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
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
        if (!vazio()) {
            departamento.setNomeDepto(textNome.getText());

            DepartamentoDAO departamentoDAO = new DepartamentoDAO();
            departamentoDAO.alter(departamento, departamento.getCodigo());
            acaoCancelar(event);
        }
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        if (!textCodigo.getText().equals("")) {
            departamento = new DepartamentoDAO().findById(Integer.parseInt(textCodigo.getText()));

            if (departamento != null) {
                textNome.setText(departamento.getNomeDepto());
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Alterar Departamento");
                alert.setContentText("Não encontrado");
                alert.showAndWait();
            }
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private boolean vazio() {
        if (textNome.getText().equals("") || textCodigo.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Alterar Departamento");
            alert.setContentText("Alguma entrada vazia!");
            alert.showAndWait();
            return true;
        }
        return false;
    }
}
