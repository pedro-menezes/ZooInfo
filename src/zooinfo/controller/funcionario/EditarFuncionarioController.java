/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooinfo.controller.funcionario;

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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
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
    private TextField textCpf;

    @FXML
    private TextField textUser;

    @FXML
    private Button buttonCancelar;

    @FXML
    private DatePicker dataNascimento;

    @FXML
    private TextField textCep;

    @FXML
    private RadioButton radioM;

    @FXML
    private TextField textBairro;

    @FXML
    private TextField textSenha;

    private Funcionario funcionario;

    private Login login;

    private ObservableList<Departamento> obsList;

    private Endereco endereco;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        preencherCombo();
    }

    @FXML
    void acaoCancelar(ActionEvent event) {
        Stage stage = (Stage) buttonCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void acaoSalvar(ActionEvent event) {
        if (!vazio()) {
            login = new Login();
            login.setUser(textUser.getText());
            login.setSenha(textSenha.getText());
            LoginDAO loginDAO = new LoginDAO();
            loginDAO.alter(login, login.getUser());

            endereco.setLogradouro(textLogradouro.getText());
            endereco.setNumero(Integer.parseInt(textNumero.getText()));
            endereco.setCep(textCep.getText());
            endereco.setBairro(textBairro.getText());
            endereco.setCidade(textCidade.getText());
            endereco.setEstado(textEstado.getText());
            EnderecoDAO enderecoDAO = new EnderecoDAO();
            enderecoDAO.alter(endereco, endereco.getCodigo());

            funcionario.setCpf(textCpf.getText());
            funcionario.setNome(textNome.getText());
            funcionario.setSexo(verificaRadio());
            funcionario.setDataNascimento(getDate(dataNascimento));
            funcionario.setDataAdmissao(getDate(dataAdmissao));
            funcionario.setSalario(Double.parseDouble(textSalario.getText()));
            funcionario.setEndereco(endereco);
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            funcionarioDAO.alter(funcionario, funcionario.getCpf());
        }
    }

    @FXML
    void acaoPesquisar(ActionEvent event) {
        if (!vazio()) {
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
                textCidade.setText(funcionario.getEndereco().getCidade());
                textEstado.setText(funcionario.getEndereco().getEstado());
                comboDepartamento.setValue(funcionario.getDepartamento());
                textSalario.setText(String.valueOf(funcionario.getSalario()));
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Editar Família");
                alert.setContentText("Não encontrado");
                alert.showAndWait();
            }
            getCodigoEndereco();
        }
    }

    private void marcarRadio() {
        if (funcionario.getSexo() == 'M') {
            radioM.setSelected(true);
        } else {
            radioF.setSelected(true);
        }
    }

    public char verificaRadio() {
        if (radioM.isSelected()) {
            return 'M';
        }
        return 'F';
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

    private void getCodigoEndereco() {
        endereco = new Endereco();
        int numero = Integer.parseInt(textNumero.getText());
        endereco.setNumero(numero);
        endereco.setCep(textCep.getText());
        endereco.setLogradouro(textLogradouro.getText());
        endereco.setBairro(textBairro.getText());
        endereco.setCidade(textCidade.getText());
        endereco.setEstado(textEstado.getText());
        EnderecoDAO enderecoDAO = new EnderecoDAO();

        Integer enderecoId = enderecoDAO.find(endereco);

        enderecoId = enderecoDAO.find(endereco);
        endereco.setCodigo(enderecoId);
    }

    private boolean vazio() {
        if (textNome.getText().equals("") || textCpf.getText().equals("") || textUser.getText().equals("") || textSenha.getText().equals("")
                || dataNascimento.getValue() == null || dataAdmissao.getValue() == null || textSalario.getText().equals("") || dataAdmissao.getValue().equals("")
                || textLogradouro.getText().equals("") || textNumero.getText().equals("") || textBairro.getText().equals("") || textCep.getText().equals("")
                || textEstado.getText().equals("") || (radioF.isSelected() == false && radioM.isSelected() == false) || comboDepartamento.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Editar Família");
            alert.setContentText("Algum campo vazio!");
            alert.showAndWait();
            return true;
        }
        return false;
    }
}
