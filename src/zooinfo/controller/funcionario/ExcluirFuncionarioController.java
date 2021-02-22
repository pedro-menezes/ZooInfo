/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller.funcionario;

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
import zooinfo.model.bean.Funcionario;
import zooinfo.model.bean.Venda;
import zooinfo.model.dao.FuncionarioDAO;
import zooinfo.model.dao.VendaDAO;

/**
 * FXML Controller class
 *
 * @author Lucas
 */
public class ExcluirFuncionarioController implements Initializable {

    @FXML
    private TextField textCodigo;

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonSalvar;

    @FXML
    private TextArea textDados;

    private Funcionario funcionario;

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
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            removerVendas();
            funcionarioDAO.remove(funcionario.getCpf());
            acaoCancelar(event);
        }
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        if (!vazio()) {
            funcionario = new FuncionarioDAO().findById(textCodigo.getText());

            if (funcionario != null) {
                textDados.setText(funcionario.getCpf() + "\n"
                        + funcionario.getNome() + "\n"
                        + funcionario.getDataNascimento() + "\n"
                        + funcionario.getDataAdmissao() + "\n"
                        + funcionario.getSalario() + "\n"
                        + funcionario.getLogin().getUser() + "\n"
                        + funcionario.getSexo() + "\n"
                );
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Excluir Família");
                alert.setContentText("Não encontrado!");
                alert.showAndWait();
            }
        }
    }

    private void removerVendas() {
        VendaDAO vendaDAO = new VendaDAO();
        List<Venda> vendas = vendaDAO.findAll();

        for (Venda venda : vendas) {
            if (venda.getFuncionario().getCpf() == funcionario.getCpf()) {
                vendaDAO.remove(venda.getCodigo());
            }
        }
    }

    private boolean vazio() {
        if (textCodigo.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Excluir Família");
            alert.setContentText("Algum campo vazio!");
            alert.showAndWait();
            return true;
        }
        return false;
    }
}
