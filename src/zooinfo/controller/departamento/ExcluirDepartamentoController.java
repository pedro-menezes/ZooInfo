/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller.departamento;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import zooinfo.model.bean.Departamento;
import zooinfo.model.bean.Funcionario;
import zooinfo.model.dao.DepartamentoDAO;
import zooinfo.model.dao.FuncionarioDAO;

/**
 * FXML Controller class
 *
 * @author Lucas
 */
public class ExcluirDepartamentoController implements Initializable {

    @FXML
    private TextField textCodigo;

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonSalvar;

    @FXML
    private TextArea textDados;

    private Departamento departamento;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void acaoCancelar(ActionEvent event) {
        Stage stage = (Stage) buttonCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void acaoExcluir(ActionEvent event) {
        if (!vazio()) {
            if (existEspecie()) {
                DepartamentoDAO familiaDAO = new DepartamentoDAO();
                familiaDAO.remove(departamento.getCodigo());
                acaoCancelar(event);
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Excluir Departamento");
                alert.setContentText("Existe um funcionário nesse departamento.");
                alert.showAndWait();
            }
        }
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        if (!vazio()) {
            departamento = new DepartamentoDAO().findById(Integer.parseInt(textCodigo.getText()));

            if (departamento != null) {
                textDados.setText(departamento.getNomeDepto());
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Excluir Departamento");
                alert.setContentText("Departamento não encontrado.");
                alert.showAndWait();
            }
        }
    }

    private boolean existEspecie() {
        List<Funcionario> especies = new FuncionarioDAO().findAll();
        for (Funcionario especieAux : especies) {
            Departamento departamentoAux = new FuncionarioDAO().findById(especieAux.getCpf()).getDepartamento();
            if (departamento.getCodigo().equals(departamentoAux.getCodigo())) {
                return false;
            }
        }
        return true;
    }

    private boolean vazio() {
        if (textCodigo.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Excluir Departamento");
            alert.setContentText("Entrada código vazia!");
            alert.showAndWait();
            return true;
        }
        return false;
    }
}
