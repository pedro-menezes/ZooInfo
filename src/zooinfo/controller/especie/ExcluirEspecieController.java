/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller.especie;

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
import zooinfo.model.bean.Animal;
import zooinfo.model.bean.Especie;
import zooinfo.model.dao.AnimalDAO;
import zooinfo.model.dao.EspecieDAO;

/**
 * FXML Controller class
 *
 * @author pedro-menezes
 */
public class ExcluirEspecieController implements Initializable {

    @FXML
    private TextField textCodigo;

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonSalvar;

    @FXML
    private TextArea textDados;

    private Especie especie;

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
            if (existAnimal()) {
                EspecieDAO especieDAO = new EspecieDAO();
                especieDAO.remove(especie.getCodigo());
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Excluir Espécie");
                alert.setContentText("Existe um animal dessa espécie cadastrado.");
                alert.showAndWait();
            }
            acaoCancelar(event);
        }
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        if (!vazio()) {
            especie = new EspecieDAO().findById(Integer.parseInt(textCodigo.getText()));

            if (especie != null) {
                textDados.setText(especie.getNomeEspecie() + ": " + especie.getFamilia().getNomeFamilia() + "\n"
                        + especie.getDescricaoEspecie());
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Excluir Espécie");
                alert.setContentText("Não encontrado.");
                alert.showAndWait();
            }
        }
    }

    private boolean existAnimal() {
        List<Animal> animais = new AnimalDAO().findAll();
        for (Animal animal : animais) {
            Especie especieAux = new AnimalDAO().findById(animal.getCodigo()).getEspecie();
            if (especie.getCodigo().equals(especieAux.getCodigo())) {
                return false;
            }
        }
        return true;
    }

    private boolean vazio() {
        if (textCodigo.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Excluir Especie");
            alert.setContentText("Entra do código vazia!");
            alert.showAndWait();
            return true;
        }
        return false;
    }
}
