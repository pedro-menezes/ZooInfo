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
        classe.setCodigo(Integer.parseInt(textCodigo.getText()));
        classe.setDescricaoClasse(textDescricao.getText());
        classe.setNomeClasse(textNome.getText());
        
        ClasseDAO classeDAO = new ClasseDAO();
        
        classeDAO.alter(classe, classe.getCodigo());
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        classe = new ClasseDAO().findById(Integer.parseInt(textCodigo.getText()));

        if (classe != null) {
            textNome.setText(classe.getNomeClasse());
            textDescricao.setText(classe.getDescricaoClasse());
        } else {
            System.out.println("Não encontrado");
        }
    }
}
