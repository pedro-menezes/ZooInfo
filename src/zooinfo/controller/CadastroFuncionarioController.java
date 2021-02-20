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
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import zooinfo.model.bean.Departamento;
import zooinfo.model.bean.Endereco;
import zooinfo.model.bean.Funcionario;
import zooinfo.model.bean.Login;
import zooinfo.model.dao.DepartamentoDAO;
import zooinfo.model.dao.EnderecoDAO;
import zooinfo.model.dao.FuncionarioDAO;
import zooinfo.model.dao.LoginDAO;

/**
 * FXML Controller class
 *
 * @author Lucas
 */
public class CadastroFuncionarioController implements Initializable {

    @FXML
    private TextField textCidade;

    @FXML
    private TextField textEstado;

    @FXML
    private RadioButton radioF;

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
    private Button buttonCadastrar;

    @FXML
    private DatePicker dataNascimento;

    @FXML
    private TextField textCep;

    @FXML
    private RadioButton radioM;

    @FXML
    private TextField textBairro;

    private ObservableList<Departamento> obsList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        addGroup();
        preencherCombo();
    }

    @FXML
    void acaoCancelar(ActionEvent event) {
        Stage stage = (Stage) buttonCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void acaoCadastrar(ActionEvent event) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(textNome.getText());
        funcionario.setCpf(textCpf.getText());
        funcionario.setSexo(verificaRadio());
        funcionario.setDataAdmissao(getDate(dataAdmissao));
        funcionario.setDataNascimento(getDate(dataNascimento));
        funcionario.setSalario(Double.parseDouble(textSalario.getText()));

        Endereco endereco = new Endereco();
        endereco.setLogradouro(textLogradouro.getText());
        int numero = Integer.parseInt(textNumero.getText());
        endereco.setNumero(numero);
        endereco.setCep(textCep.getText());
        endereco.setLogradouro(textLogradouro.getText());
        endereco.setBairro(textBairro.getText());
        endereco.setCidade(textCidade.getText());
        endereco.setEstado(textEstado.getText());
        EnderecoDAO enderecoDAO = new EnderecoDAO();

        Integer enderecoId = enderecoDAO.find(endereco);

        if (enderecoId == null) {
            endereco = enderecoDAO.save(endereco);
        }
        enderecoId = enderecoDAO.find(endereco);

        endereco.setCodigo(enderecoId);
        funcionario.setEndereco(endereco);

        Login login = new Login();
        login.setUser(textUser.getText());
        login.setSenha(textSenha.getText());
        LoginDAO loginDAO = new LoginDAO();

        if (!loginDAO.exist(login)) {
            loginDAO.save(login);

            funcionario.setLogin(login);
            funcionario.setDepartamento(comboDepartamento.getValue());

            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            funcionarioDAO.save(funcionario);
        }
        acaoCancelar(event);
    }

    public void addGroup() {
        ToggleGroup toggleGroup = new ToggleGroup();

        radioM.setToggleGroup(toggleGroup);
        radioF.setToggleGroup(toggleGroup);
    }

    public char verificaRadio() {
        if (radioM.isSelected()) {
            return 'M';
        }
        return 'F';
    }

    private Date getDate(DatePicker datePicker) {
        LocalDate localDate = datePicker.getValue();
        Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        Date date = Date.from(instant);
        return date;
    }

    private void preencherCombo() {
        obsList = FXCollections.observableArrayList(new DepartamentoDAO().findAll());
        comboDepartamento.setItems(obsList);
    }
}
