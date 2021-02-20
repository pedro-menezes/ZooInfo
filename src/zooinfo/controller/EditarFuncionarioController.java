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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import zooinfo.model.bean.Departamento;
import zooinfo.model.bean.Funcionario;
import zooinfo.model.dao.DepartamentoDAO;
import zooinfo.model.dao.FuncionarioDAO;

/**
 * FXML Controller class
 *
 * @author Matheus Rocha
 */
public class EditarFuncionarioController implements Initializable {

    @FXML
    private TextField textCodigo;

    @FXML
    private TextField textCidade;

    @FXML
    private TextField textEstado;

    @FXML
    private RadioButton radioF;

    @FXML
    private Button buttonPesquisar;

    @FXML
    private ComboBox<Departamento> comboDepartamento;

    @FXML
    private TextField textSalario;

    @FXML
    private DatePicker dataAdmissao;

    @FXML
    private TextField textNome;

    @FXML
    private TextField textLogradouro;

    @FXML
    private TextField textNumero;

    @FXML
    private TextField textSenha;

    @FXML
    private TextField textCpf;

    @FXML
    private TextField textUser;

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonSalvar;

    @FXML
    private DatePicker dataNascimento;

    @FXML
    private TextField textCep;

    @FXML
    private RadioButton radioM;

    @FXML
    private TextField textBairro;

    private Funcionario funcionario;

    private ObservableList<Departamento> obsList;

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
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        funcionario = new FuncionarioDAO().findById(textCodigo.getText());

        if (funcionario != null) {
            textNome.setText(funcionario.getNome());
            textCpf.setText(funcionario.getCpf());
            marcarRadio();
            dataNascimento.setValue(funcionario.getDataNascimento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            textUser.setText(funcionario.getLogin().getUser());
            textSenha.setText(funcionario.getLogin().getSenha());
            dataAdmissao.setValue(funcionario.getDataAdmissao().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            textLogradouro.setText(funcionario.getEndereco().getLogradouro());
            textNumero.setText(String.valueOf(funcionario.getEndereco().getNumero()));
            textCep.setText(funcionario.getEndereco().getCep());
            textBairro.setText(funcionario.getEndereco().getBairro());
            textCidade.setText(funcionario.getEndereco().getEstado());
            comboDepartamento.setValue(funcionario.getDepartamento());
            textSalario.setText(String.valueOf(funcionario.getSalario()));
        } else {
            System.out.println("Não encontrado");
        }
    }

    private void marcarRadio() {
        if (funcionario.getSexo() == 'M') {
            radioM.setSelected(true);
        } else {
            radioF.setSelected(true);
        }
    }

    private void preencherCombo() {
        obsList = FXCollections.observableArrayList(new DepartamentoDAO().findAll());
        comboDepartamento.setItems(obsList);
    }

    private Date getDate(DatePicker datePicker) {
        LocalDate localDate = datePicker.getValue();
        Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        Date date = Date.from(instant);
        return date;
    }
}
