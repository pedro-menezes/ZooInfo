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
import zooinfo.model.bean.Animal;
import zooinfo.model.dao.AnimalDAO;

/**
 * FXML Controller class
 *
 * @author Lucas
 */
public class ExcluirAnimalController implements Initializable {

    @FXML
    private TextField textCodigo;

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonSalvar;

    @FXML
    private TextArea textDados;

    private Animal animal;

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
        AnimalDAO animalDAO = new AnimalDAO();
        animalDAO.remove(animal.getCodigo());
        acaoCancelar(event);
    }

    @FXML
    void acaoPesquisa(ActionEvent event) {
        animal = new AnimalDAO().findById(Integer.parseInt(textCodigo.getText()));
        
        if (animal != null) {
            textDados.setText(animal.getNomeAnimal() + ": " + animal.getEspecie().getNomeEspecie() + "\n" 
                    + animal.getDataNascimento() + "\n" + animal.getAlimentacao().getDescricao() +": "+animal.getAlimentacao().getQuantidade());
        } else {
            System.out.println("Não encontrado");
        }
    }
}
