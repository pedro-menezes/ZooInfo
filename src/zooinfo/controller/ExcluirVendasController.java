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
public class ExcluirVendasController implements Initializable {

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
    void acaoExcluir(ActionEvent event) {
        VendaDAO vendaDAO = new VendaDAO();
        vendaDAO.remove(venda.getCodigo());
        acaoCancelar(event);
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        venda = new VendaDAO().findById(Integer.parseInt(textCodigo.getText()));
        
        if (venda != null) {
            textDados.setText(venda.getFuncionario().getCpf() + ": " + venda.getFuncionario().getNome() + "\n" + venda.getDataVenda());
        } else {
            System.out.println("Não encontrado");
        }
    }
}
