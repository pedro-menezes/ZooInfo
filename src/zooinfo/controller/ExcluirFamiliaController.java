/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller;

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
        if (existEspecie()) {
            FamiliaDAO familiaDAO = new FamiliaDAO();
            familiaDAO.remove(familia.getCodigo());
        } else {
            System.out.println("Existe espécie dessa familia cadastrado.");
        }
        acaoCancelar(event);
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        familia = new FamiliaDAO().findById(Integer.parseInt(textCodigo.getText()));

        if (familia != null) {
            textDados.setText(familia.getNomeFamilia()+ ": " + familia.getClasse().getNomeClasse()+ "\n"
                    + familia.getDescricaoFamilia());
        } else {
            System.out.println("Não encontrado");
        }
    }

    private boolean existEspecie() {
        List<Especie> especies = new EspecieDAO().findAll();
        for (Especie especieAux : especies) {
            Familia familiaAux = new EspecieDAO().findById(especieAux.getCodigo()).getFamilia();
            if (familia.getCodigo() == familiaAux.getCodigo()) {
                return false;
            }
        }
        return true;
    }
}

