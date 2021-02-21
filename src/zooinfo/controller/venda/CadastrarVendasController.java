/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller.venda;

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
import javafx.scene.text.Text;
import javafx.stage.Stage;
import zooinfo.model.bean.Funcionario;
import zooinfo.model.bean.Venda;
import zooinfo.model.dao.FuncionarioDAO;
import zooinfo.model.dao.VendaDAO;

/**
 * FXML Controller class
 *
 * @author Lucas
 */
public class CadastrarVendasController implements Initializable {

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonCadastrar;

    @FXML
    private DatePicker dateVenda;

    @FXML
    private ComboBox<Funcionario> comboFuncionario;

    private ObservableList<Funcionario> obsList;

    @FXML
    private void acaoCadastrar(ActionEvent evt) {
        Venda venda = new Venda();
        venda.setDataVenda(getDate());
        venda.setFuncionario(comboFuncionario.getValue());

        System.out.println(venda);
        VendaDAO vendaDAO = new VendaDAO();
        vendaDAO.save(venda);
        acaoCancelar(evt);
    }

    @FXML
    private void acaoCancelar(ActionEvent evt) {
        Stage stage = (Stage) buttonCancelar.getScene().getWindow();
        stage.close();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        preencherCombo();
    }

    private void preencherCombo() {
        obsList = FXCollections.observableArrayList(new FuncionarioDAO().findAll());
        for (Funcionario funcionario : obsList) {
            System.out.println(funcionario);
        }
        comboFuncionario.setItems(obsList);
    }

    private Date getDate() {
        LocalDate localDate = dateVenda.getValue();
        Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        Date date = Date.from(instant);
        return date;
    }
}
