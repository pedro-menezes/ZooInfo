/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller.familia;

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
import zooinfo.model.bean.Especie;
import zooinfo.model.bean.Familia;
import zooinfo.model.dao.EspecieDAO;
import zooinfo.model.dao.FamiliaDAO;

/**
 * FXML Controller class
 *
 * @author Lucas
 */
public class ExcluirFamiliaController implements Initializable {

    @FXML
    private TextField textCodigo;

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonSalvar;

    @FXML
    private TextArea textDados;

    private Familia familia;

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
                FamiliaDAO familiaDAO = new FamiliaDAO();
                familiaDAO.remove(familia.getCodigo());
                acaoCancelar(event);
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Excluir Família");
                alert.setContentText("Existe espécie dessa familia cadastrado.");
                alert.showAndWait();
            }
        }
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        if (!vazio()) {
            familia = new FamiliaDAO().findById(Integer.parseInt(textCodigo.getText()));

            if (familia != null) {
                textDados.setText(familia.getNomeFamilia() + ": " + familia.getClasse().getNomeClasse() + "\n"
                        + familia.getDescricaoFamilia());
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Excluir Família");
                alert.setContentText("Não encontrado!");
                alert.showAndWait();
            }
        }
    }

    private boolean existEspecie() {
        List<Especie> especies = new EspecieDAO().findAll();
        for (Especie especieAux : especies) {
            Familia familiaAux = new EspecieDAO().findById(especieAux.getCodigo()).getFamilia();
            if (familia.getCodigo().equals(familiaAux.getCodigo())) {
                return false;
            }
        }
        return true;
    }

    private boolean vazio() {
        if (textCodigo.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Excluir Família");
            alert.setContentText("Entra do código vazia!");
            alert.showAndWait();
            return true;
        }
        return false;
    }
}
