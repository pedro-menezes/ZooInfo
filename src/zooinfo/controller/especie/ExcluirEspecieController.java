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
        if (existAnimal()) {
            EspecieDAO especieDAO = new EspecieDAO();
            especieDAO.remove(especie.getCodigo());
        } else {
            System.out.println("Existe animal dessa espécie cadastrado.");
        }
        acaoCancelar(event);
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        especie = new EspecieDAO().findById(Integer.parseInt(textCodigo.getText()));

        if (especie != null) {
            textDados.setText(especie.getNomeEspecie() + ": " + especie.getFamilia().getNomeFamilia() + "\n"
                    + especie.getDescricaoEspecie());
        } else {
            System.out.println("Não encontrado");
        }
    }

    private boolean existAnimal() {
        List<Animal> animais = new AnimalDAO().findAll();
        for (Animal animal : animais) {
            Especie especieAux = new AnimalDAO().findById(animal.getCodigo()).getEspecie();
            if (especie.getCodigo() == especieAux.getCodigo()) {
                return false;
            }
        }
        return true;
    }
}
