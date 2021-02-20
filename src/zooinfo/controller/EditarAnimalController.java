/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller;

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
 * @author Lucas
 */
public class EditarAnimalController implements Initializable {

    @FXML
    private TextField textCodigo;

    @FXML
    private TextField textQuantidade;

    @FXML
    private ComboBox<Especie> comboEspecie;

    @FXML
    private DatePicker dateNascimento;

    @FXML
    private Button buttonCancelar;

    @FXML
    private TextField textNome;

    @FXML
    private TextField textAlimentacao;

    private ObservableList<Especie> obsList;
    
    private Animal animal;

    @FXML
    void acaoCancelar(ActionEvent event) {
        Stage stage = (Stage) buttonCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void acaoSalvar(ActionEvent event) {
        animal.setNomeAnimal(textNome.getText());
        AnimalDAO animalDAO = new AnimalDAO();
        
        AlimentacaoDAO alimentacaoDAO = new AlimentacaoDAO();
        Alimentacao alimentacao = new Alimentacao();
        alimentacao.setDescricao(textAlimentacao.getText());
        alimentacao.setQuantidade(Float.parseFloat(textQuantidade.getText()));

        if (alimentacaoDAO.exist(alimentacao)) {
            alimentacao.setCodigo(alimentacaoDAO.find(alimentacao));
        } else {
            alimentacaoDAO.save(alimentacao);
            alimentacao.setCodigo(alimentacaoDAO.find(alimentacao));
        }
        
        animal.setAlimentacao(alimentacao);
        animal.setEspecie(comboEspecie.getValue());
        animal.setDataNascimento(getDate());
        
        System.out.println("_____ID Ali_____ "+animal.getAlimentacao().getCodigo());
        System.out.println("_____ID Esp_____ "+animal.getEspecie().getCodigo());
        System.out.println("_____ID Ani_____ "+animal.getCodigo());
        
        animalDAO.alter(animal, animal.getCodigo());
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        animal = new AnimalDAO().findById(Integer.parseInt(textCodigo.getText()));

        if (animal != null) {
            textNome.setText(animal.getNomeAnimal());
            dateNascimento.setValue(animal.getDataNascimento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            textAlimentacao.setText(animal.getAlimentacao().getDescricao());
            textQuantidade.setText(Float.toString(animal.getAlimentacao().getQuantidade()));
            comboEspecie.setValue(animal.getEspecie());
        } else {
            System.out.println("Não encontrado");
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        preencherCombo();
    }

    private void preencherCombo() {
        obsList = FXCollections.observableArrayList(new EspecieDAO().findAll());
        comboEspecie.setItems(obsList);
    }
    
     private Date getDate() {
        LocalDate localDate = dateNascimento.getValue();
        Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        Date date = Date.from(instant);
        return date;
    }
}

