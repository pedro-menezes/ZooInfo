/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller.classe;

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
import zooinfo.model.bean.Classe;
import zooinfo.model.dao.ClasseDAO;

/**
 * FXML Controller class
 *
 * @author Matheus Rocha
 */
public class EditarClasseController implements Initializable {

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

    private Classe classe;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    void acaoCancelar(ActionEvent event) {
        Stage stage = (Stage) buttonCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void acaoSalvar(ActionEvent event) {
        if (!vazio()) {
            classe.setCodigo(Integer.parseInt(textCodigo.getText()));
            classe.setDescricaoClasse(textDescricao.getText());
            classe.setNomeClasse(textNome.getText());

            ClasseDAO classeDAO = new ClasseDAO();

            classeDAO.alter(classe, classe.getCodigo());
            acaoCancelar(event);
        }
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        if (!vazio()) {
            classe = new ClasseDAO().findById(Integer.parseInt(textCodigo.getText()));

            if (classe != null) {
                textNome.setText(classe.getNomeClasse());
                textDescricao.setText(classe.getDescricaoClasse());
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Alterar Classe");
                alert.setContentText("Não encontrado");
                alert.showAndWait();
            }
        }
    }

    private boolean vazio() {
        if (textNome.getText().equals("") || textDescricao.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Alterar Classe");
            alert.setContentText("Alguma entrada vazia!");
            alert.showAndWait();
            return true;
        }
        return false;
    }
}
