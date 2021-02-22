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
public class CadastrarClasseController implements Initializable {
    
    
    @FXML
    private TextArea textDescricao;

    @FXML
    private Button buttonCancelar;

    @FXML
    private TextField textNome;
    
    
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
    void acaoCadastrar(ActionEvent event) {
        if(!vazio()){
            Classe classe = new Classe();
            classe.setNomeClasse(textNome.getText());
            classe.setDescricaoClasse(textDescricao.getText());
            ClasseDAO classeDAO = new ClasseDAO();
            if (!classeDAO.exist(classe)) {
                classeDAO.save(classe);
                acaoCancelar(event);
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Cadastrar Classe");
                alert.setContentText("Já existe!");
                alert.showAndWait();
            }
        }
    }
    
    private boolean vazio() {
        if (textNome.getText().equals("") || textDescricao.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Cadastrar Classe");
            alert.setContentText("Alguma entrada vazia!");
            alert.showAndWait();
            return true;
        }
        return false;
    }
}
