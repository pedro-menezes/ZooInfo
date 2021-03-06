/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller.animal;

import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import zooinfo.model.bean.Alimentacao;
import zooinfo.model.bean.Animal;
import zooinfo.model.bean.Especie;
import zooinfo.model.dao.AlimentacaoDAO;
import zooinfo.model.dao.AnimalDAO;
import zooinfo.model.dao.EspecieDAO;

/**
 * FXML Controller class
 *
 * @author pedro-menezes
 */
public class CadastrarAnimalController implements Initializable {

    @FXML
    private TextField textQuantidade;

    @FXML
    private Button buttonCancelar;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField textNome;

    @FXML
    private ComboBox<Especie> comboBox;

    @FXML
    private TextField textAlimentacao;

    private ObservableList<Especie> obsList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        preencherCombo();
    }

    @FXML
    private void acaoCadastrarAnimal(ActionEvent evt) {
            Animal animal = new Animal();
            animal.setNomeAnimal(textNome.getText());
            
            if (datePicker.getValue() != null) { 
                animal.setDataNascimento(getDate());
            }
            
            animal.setEspecie(comboBox.getValue());

            Alimentacao alimentacao = new Alimentacao();
            alimentacao.setDescricao(textAlimentacao.getText());
            
            if (!textQuantidade.getText().equals("")) {
                alimentacao.setQuantidade(Float.parseFloat(textQuantidade.getText()));
            }
            
            AlimentacaoDAO alimentacaoDAO = new AlimentacaoDAO();
            alimentacaoDAO.save(alimentacao);
            
           Integer alimentacaoId = alimentacaoDAO.find(alimentacao);
            if (alimentacaoId != null) {
                alimentacao.setCodigo(alimentacaoId);
            }

            animal.setAlimentacao(alimentacao);

            AnimalDAO animalDAO = new AnimalDAO();
            boolean save = animalDAO.save(animal);
            
            if (!save) {
                System.out.println("Erro no cadastro");
            } else {
                acaoFechar(new ActionEvent());
            }
    }

    @FXML
    private void acaoFechar(ActionEvent evt) {
        Stage stage = (Stage) buttonCancelar.getScene().getWindow();
        stage.close();
    }

    private void preencherCombo() {
        obsList = FXCollections.observableArrayList(new EspecieDAO().findAll());
        for (Especie especie : obsList) {
            System.out.println(especie);
        }
        comboBox.setItems(obsList);
    }

    private Date getDate() {
        LocalDate localDate = datePicker.getValue();
        Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        Date date = Date.from(instant);
        return date;
    }

}
