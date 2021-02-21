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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import zooinfo.model.bean.Departamento;
import zooinfo.model.dao.DepartamentoDAO;

/**
 * FXML Controller class
 *
 * @author pedro-menezes
 */
public class CadastrarDepartamentoController implements Initializable {

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonCadastrar;

    @FXML
    private TextField textNome;

    @FXML
    void acaoCancelar(ActionEvent event) {
        Stage stage = (Stage) buttonCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void acaoCadastrar(ActionEvent event) {
        Departamento departamento = new Departamento();
        departamento.setNomeDepto(textNome.getText());
        DepartamentoDAO departamentoDAO = new DepartamentoDAO();
        if (!departamentoDAO.exist(departamento)) {
            departamentoDAO.save(departamento);
        } else {
            System.out.println("Já existe");
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
