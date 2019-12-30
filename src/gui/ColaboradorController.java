package gui;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ColaboradorController implements Initializable {
	
	private static Stage stage;

	@FXML
	private Button btnNovo;
	@FXML
	private Button btnEditar;
	@FXML
	private Button btnExcluir;
	@FXML
	private Button btnRelatorio;
	@FXML
	private Button btnPesquisa;
	@FXML
	private Label lblUsuario;
	@FXML
	private Label lblData;
	@FXML
	private TextField txtCodigo;
	@FXML
	private TextField txtNome;
	@FXML
	private Button btnadicionarImagem;
	@FXML
	private TextField txtCpf;
	@FXML
	private TextField txtRg;
	@FXML
	private TextField txtNacionalidade;
	@FXML
	private TextField txtNaturalidade;

	@FXML
	private TextField txtDataNascimento;

	@FXML
	private TextField txtOrgaoEmissor;
	@FXML
	private TextField txtDtaEmissao;
	@FXML
	private TextField txtTituloEleitor;
	@FXML
	private TextField txtCdi;
	@FXML
	private TextField txtCnh;
	@FXML
	private TextField txtCnpj;
	@FXML
	private TextField txtRazaoSocial;
	@FXML
	private TextField txtCts;
	@FXML
	private TextField txtSerieCts;
	@FXML
	private TextField txtEmissaCts;
	@FXML
	private TextField txtNis;
	@FXML
	private TextField txtReservista;
	@FXML
	private TextField txtSus;
	@FXML
	private TextField txtConjuge;
	@FXML
	private TextField txtDependente;
	@FXML
	private TextField txtDependente1;
	@FXML
	private TextField txtDependente2;
	@FXML
	private TextField txtCargo;
	@FXML
	private TextField txtSetor;
	@FXML
	private TextField txtAdmissao;

	@FXML
	private TextField txtCurso;
	@FXML
	private TextField txtConclusao;

	@FXML
	private TextField txtCurso1;
	@FXML
	private TextField txtConclusao1;
	@FXML
	private TextField txtAfastamento;
	@FXML
	private TextField txtMotivoAfastamento;
	@FXML
	private TextField txtRetornoAfastamento;
	@FXML
	private TextField txtVencimentoContrato;
	@FXML
	private TextField txtProrrogacaoContrato;
	@FXML
	private TextField txtFormaPagamento;
	@FXML
	private TextField txtDemissao;
	@FXML
	private TextField txtBanco;
	@FXML
	private TextField txtAgencia;
	@FXML
	private TextField txtConta;
	@FXML
	private TextField txtDigito;
	@FXML
	private TextField txtTelefone;
	@FXML
	private TextField txtCelular;
	@FXML
	private TextField txtCelular1;
	@FXML
	private TextField txtEmail;
	@FXML
	private TextField txtLogradouro;
	@FXML
	private TextField txtNumero;
	@FXML
	private TextField txtComplemento;
	@FXML
	private TextField txtBairro;
	@FXML
	private TextField txtCidade;
	@FXML
	private TextField txtUf;
	@FXML
	private TextField txtCep;
	@FXML
	private TextField txtPais;
	@FXML
	private Button btnDocumentos;
	@FXML
	private Button btnSalvar;
	@FXML
	private Button btnSair;
	@FXML
	private AnchorPane conteudoColaborador;
	
	
	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		ColaboradorController.stage = stage;
	}
	
	

	private void fecharColaborador() {
		Utils utils = new Utils();
		utils.fechar();
	}
	@FXML
	public void onbtn_sair() {
		fecharColaborador();
	}
	
	private void tela() {
		PrincipalController principal = new PrincipalController();
		
	}

	private void camposInativos() {
		btnEditar.setDisable(true);
		btnExcluir.setDisable(true);
		btnRelatorio.setDisable(true);
		lblUsuario.setDisable(true);
		lblData.setDisable(true);
		txtCodigo.setDisable(true);
		txtNome.setDisable(true);
		btnadicionarImagem.setDisable(true);
		txtCpf.setDisable(true);
		txtRg.setDisable(true);
		txtNacionalidade.setDisable(true);
		txtNaturalidade.setDisable(true);
		txtDataNascimento.setDisable(true);
		txtOrgaoEmissor.setDisable(true);
		txtDtaEmissao.setDisable(true);
		txtTituloEleitor.setDisable(true);
		txtCdi.setDisable(true);
		txtCnh.setDisable(true);
		txtCnpj.setDisable(true);
		txtRazaoSocial.setDisable(true);
		txtCts.setDisable(true);
		txtSerieCts.setDisable(true);
		txtEmissaCts.setDisable(true);
		txtNis.setDisable(true);
		txtReservista.setDisable(true);
		txtSus.setDisable(true);
		txtConjuge.setDisable(true);
		txtDependente.setDisable(true);
		txtDependente1.setDisable(true);
		txtDependente2.setDisable(true);
		txtCargo.setDisable(true);
		txtSetor.setDisable(true);
		txtAdmissao.setDisable(true);
		txtCurso.setDisable(true);
		txtConclusao.setDisable(true);
		txtCurso1.setDisable(true);
		txtConclusao1.setDisable(true);
		txtAfastamento.setDisable(true);
		txtMotivoAfastamento.setDisable(true);
		txtRetornoAfastamento.setDisable(true);
		txtVencimentoContrato.setDisable(true);
		txtProrrogacaoContrato.setDisable(true);
		txtFormaPagamento.setDisable(true);
		txtDemissao.setDisable(true);
		txtBanco.setDisable(true);
		txtAgencia.setDisable(true);
		txtConta.setDisable(true);
		txtDigito.setDisable(true);
		txtTelefone.setDisable(true);
		txtCelular.setDisable(true);
		txtCelular1.setDisable(true);
		txtEmail.setDisable(true);
		txtLogradouro.setDisable(true);
		txtNumero.setDisable(true);
		txtComplemento.setDisable(true);
		txtBairro.setDisable(true);
		txtCidade.setDisable(true);
		txtUf.setDisable(true);
		txtCep.setDisable(true);
		txtPais.setDisable(true);
		btnDocumentos.setDisable(true);
		btnSalvar.setDisable(true);

	}

	private void novo() {
		btnEditar.setDisable(false);
		btnExcluir.setDisable(false);
		btnRelatorio.setDisable(false);
		lblUsuario.setDisable(false);
		lblData.setDisable(false);
		txtCodigo.setDisable(false);
		txtNome.setDisable(false);
		btnadicionarImagem.setDisable(false);
		txtCpf.setDisable(false);
		txtRg.setDisable(false);
		txtNacionalidade.setDisable(false);
		txtNaturalidade.setDisable(false);
		txtDataNascimento.setDisable(false);
		txtOrgaoEmissor.setDisable(false);
		txtDtaEmissao.setDisable(false);
		txtTituloEleitor.setDisable(false);
		txtCdi.setDisable(false);
		txtCnh.setDisable(false);
		txtCnpj.setDisable(false);
		txtRazaoSocial.setDisable(false);
		txtCts.setDisable(false);
		txtSerieCts.setDisable(false);
		txtEmissaCts.setDisable(false);
		txtNis.setDisable(false);
		txtReservista.setDisable(false);
		txtSus.setDisable(false);
		txtConjuge.setDisable(false);
		txtDependente.setDisable(false);
		txtDependente1.setDisable(false);
		txtDependente2.setDisable(false);
		txtCargo.setDisable(false);
		txtSetor.setDisable(false);
		txtAdmissao.setDisable(false);
		txtCurso.setDisable(false);
		txtConclusao.setDisable(false);
		txtCurso1.setDisable(false);
		txtConclusao1.setDisable(false);
		txtAfastamento.setDisable(false);
		txtMotivoAfastamento.setDisable(false);
		txtRetornoAfastamento.setDisable(false);
		txtVencimentoContrato.setDisable(false);
		txtProrrogacaoContrato.setDisable(false);
		txtFormaPagamento.setDisable(false);
		txtDemissao.setDisable(false);
		txtBanco.setDisable(false);
		txtAgencia.setDisable(false);
		txtConta.setDisable(false);
		txtDigito.setDisable(false);
		txtTelefone.setDisable(false);
		txtCelular.setDisable(false);
		txtCelular1.setDisable(false);
		txtEmail.setDisable(false);
		txtLogradouro.setDisable(false);
		txtNumero.setDisable(false);
		txtComplemento.setDisable(false);
		txtBairro.setDisable(false);
		txtCidade.setDisable(false);
		txtUf.setDisable(false);
		txtCep.setDisable(false);
		txtPais.setDisable(false);
		btnDocumentos.setDisable(false);
		btnSalvar.setDisable(false);

	}

	public void onBtnNovo(ActionEvent e) {
		novo();
	}
	

	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		camposInativos();
	}

}
