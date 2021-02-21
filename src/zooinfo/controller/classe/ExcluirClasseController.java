/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller.classe;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import zooinfo.model.bean.Classe;
import zooinfo.model.bean.Familia;
import zooinfo.model.dao.ClasseDAO;
import zooinfo.model.dao.FamiliaDAO;

/**
 * FXML Controller class
 *
 * @author Lucas
 */
public class ExcluirClasseController implements Initializable {

    @FXML
    private TextField textCodigo;

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonSalvar;

    @FXML
    private TextArea textDados;

    private Classe classe;

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
        if (existFamilia()) {
            ClasseDAO classeDAO = new ClasseDAO();
            classeDAO.remove(classe.getCodigo());
        } else {
            System.out.println("Existe família dessa classe cadastrada.");
        }
        acaoCancelar(event);
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        classe = new ClasseDAO().findById(Integer.parseInt(textCodigo.getText()));

        if (classe != null) {
            textDados.setText(classe.getNomeClasse() +"\n"+ classe.getDescricaoClasse());
        } else {
            System.out.println("Não encontrado");
        }
    }

    private boolean existFamilia() {
        List<Familia> especies = new FamiliaDAO().findAll();
        for (Familia familiaAux : especies) {
            Classe classeAux = new FamiliaDAO().findById(familiaAux.getCodigo()).getClasse();
            if (classe.getCodigo() == classeAux.getCodigo()) {
                return false;
            }
        }
        return true;
    }
}
