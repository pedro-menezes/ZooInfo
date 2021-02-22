/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller.venda;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import zooinfo.model.bean.Venda;
import zooinfo.model.dao.VendaDAO;

/**
 * FXML Controller class
 *
 * @author Lucas
 */
public class EditarVendasController implements Initializable {

    @FXML
    private TextField textCodigo;

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonSalvar;

    @FXML
    private TextArea textDados;

    private Venda venda;

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
    void acaoSalvar(ActionEvent event) {
        if (!vazio()) {
            venda.setUsado(true);
            VendaDAO vendaDAO = new VendaDAO();
            vendaDAO.ingressoUsado(venda, venda.getCodigo());
            acaoCancelar(event);
        }
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        if (!textCodigo.getText().equals("")) {
            venda = new VendaDAO().findById(Integer.parseInt(textCodigo.getText()));

            if (venda != null) {
                textDados.setText(venda.getFuncionario().getCpf() + ": " + venda.getFuncionario().getNome() + "\n" + venda.getDataVenda());
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Editar Venda");
                alert.setContentText("Não encontrado.");
                alert.showAndWait();
            }
        }
    }

    private boolean vazio() {
        if (textCodigo.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Editar Venda");
            alert.setContentText("Campo código vazio!");
            alert.showAndWait();
            return true;
        }
        return false;
    }
}
