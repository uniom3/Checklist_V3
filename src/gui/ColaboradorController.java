package gui;

import java.net.URL;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import db.DbException;
import gui.listener.DataChangeListener;
import gui.util.Alerts;
import gui.util.LblUsuario;
import gui.util.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.entities.Colaborador;
import model.exceptions.ValidationException;
import model.services.ColaboradorService;

public class ColaboradorController implements Initializable {

	private static Stage stage;
	private Colaborador entity;
	private ColaboradorService service;
	private List<DataChangeListener> dataChangeListeners = new ArrayList<>();

	@FXML
	private Button btn_Novo;
	@FXML
	private Button btn_Editar;
	@FXML
	private Button btn_Excluir;
	@FXML
	private Button btn_Relatorio;
	@FXML
	private Button btn_Pesquisa;
	@FXML
	private Label lbl_Usuario;
	@FXML
	private Label lbl_Data;
	@FXML
	private TextField txt_Id;
	@FXML
	private TextField txt_Nome;
	@FXML
	private Button btn_adicionarImagem;
	@FXML
	private TextField txt_Cpf;
	@FXML
	private TextField txt_Rg;
	@FXML
	private TextField txt_Nacionalidade;
	@FXML
	private TextField txt_Naturalidade;
	@FXML
	private RadioButton rd_Ativo;
	@FXML
	private RadioButton rd_UsuarioDoSistema;
	@FXML
	private TextField txt_DataNascimento;

	@FXML
	private TextField txt_OrgaoEmissor;
	@FXML
	private TextField txt_DtaEmissao;
	@FXML
	private TextField txt_TituloEleitor;
	@FXML
	private TextField txt_Cdi;
	@FXML
	private TextField txt_Cnh;
	@FXML
	private TextField txt_Cnpj;
	@FXML
	private TextField txt_RazaoSocial;
	@FXML
	private TextField txt_Cts;
	@FXML
	private TextField txt_SerieCts;
	@FXML
	private TextField txt_EmissaCts;
	@FXML
	private TextField txt_Nis;
	@FXML
	private TextField txt_Reservista;
	@FXML
	private TextField txt_Sus;
	@FXML
	private TextField txt_Conjuge;
	@FXML
	private TextField txt_Dependente;
	@FXML
	private TextField txt_Dependente1;
	@FXML
	private TextField txt_Dependente2;
	@FXML
	private TextField txt_Cargo;
	@FXML
	private TextField txt_Setor;
	@FXML
	private TextField txt_Admissao;

	@FXML
	private TextField txt_Curso;
	@FXML
	private TextField txt_Conclusao;

	@FXML
	private TextField txt_Curso1;
	@FXML
	private TextField txt_Conclusao1;
	@FXML
	private TextField txt_Afastamento;
	@FXML
	private TextField txt_MotivoAfastamento;
	@FXML
	private TextField txt_RetornoAfastamento;
	@FXML
	private TextField txt_VencimentoContrato;
	@FXML
	private TextField txt_ProrrogacaoContrato;
	@FXML
	private TextField txt_FormaPagamento;
	@FXML
	private TextField txt_Demissao;
	@FXML
	private TextField txt_Banco;
	@FXML
	private TextField txt_Agencia;
	@FXML
	private TextField txt_Conta;
	@FXML
	private TextField txt_Digito;
	@FXML
	private TextField txt_Telefone;
	@FXML
	private TextField txt_Celular;
	@FXML
	private TextField txt_Celular1;
	@FXML
	private TextField txt_Email;
	@FXML
	private TextField txt_Logradouro;
	@FXML
	private TextField txt_Numero;
	@FXML
	private TextField txt_Complemento;
	@FXML
	private TextField txt_Bairro;
	@FXML
	private TextField txt_Cidade;
	@FXML
	private TextField txt_Uf;
	@FXML
	private TextField txt_Cep;
	@FXML
	private TextField txt_Pais;
	@FXML
	private Button btn_Documentos;
	@FXML
	private Button btn_Salvar;
	@FXML
	private Button btn_Sair;
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

	@FXML
	public void onradioAtivo() {
		if (rd_Ativo.isSelected() == true) {
			rd_Ativo.setSelected(true);
		} else {
			rd_Ativo.setSelected(false);
		}
	}

	@FXML
	public void onradioUsuarioDoSistema() {
		if (rd_UsuarioDoSistema.isSelected() == true) {
			rd_UsuarioDoSistema.setSelected(true);
		} else {
			rd_UsuarioDoSistema.setSelected(false);
		}
	}

	private void tela() {
		PrincipalController principal = new PrincipalController();

	}

	public void setColaborador(Colaborador entity) {
		this.entity = entity;
	}

	private void camposInativos() {
		btn_Editar.setDisable(true);
		btn_Excluir.setDisable(true);
		btn_Relatorio.setDisable(true);
		lbl_Usuario.setDisable(true);
		// lblData.setDisable(true);
		// txtId.setDisable(true);
		txt_Nome.setDisable(true);
		btn_adicionarImagem.setDisable(true);
		txt_Cpf.setDisable(true);
		txt_Rg.setDisable(true);
		txt_Nacionalidade.setDisable(true);
		txt_Naturalidade.setDisable(true);
		txt_DataNascimento.setDisable(true);
		txt_OrgaoEmissor.setDisable(true);
		txt_DtaEmissao.setDisable(true);
		txt_TituloEleitor.setDisable(true);
		txt_Cdi.setDisable(true);
		txt_Cnh.setDisable(true);
		txt_Cnpj.setDisable(true);
		txt_RazaoSocial.setDisable(true);
		txt_Cts.setDisable(true);
		txt_SerieCts.setDisable(true);
		txt_EmissaCts.setDisable(true);
		txt_Nis.setDisable(true);
		txt_Reservista.setDisable(true);
		txt_Sus.setDisable(true);
		txt_Conjuge.setDisable(true);
		txt_Dependente.setDisable(true);
		txt_Dependente1.setDisable(true);
		txt_Dependente2.setDisable(true);
		txt_Cargo.setDisable(true);
		txt_Setor.setDisable(true);
		txt_Admissao.setDisable(true);
		txt_Curso.setDisable(true);
		txt_Conclusao.setDisable(true);
		txt_Curso1.setDisable(true);
		txt_Conclusao1.setDisable(true);
		txt_Afastamento.setDisable(true);
		txt_MotivoAfastamento.setDisable(true);
		txt_RetornoAfastamento.setDisable(true);
		txt_VencimentoContrato.setDisable(true);
		txt_ProrrogacaoContrato.setDisable(true);
		txt_FormaPagamento.setDisable(true);
		txt_Demissao.setDisable(true);
		txt_Banco.setDisable(true);
		txt_Agencia.setDisable(true);
		txt_Conta.setDisable(true);
		txt_Digito.setDisable(true);
		txt_Telefone.setDisable(true);
		txt_Celular.setDisable(true);
		txt_Celular1.setDisable(true);
		txt_Email.setDisable(true);
		txt_Logradouro.setDisable(true);
		txt_Numero.setDisable(true);
		txt_Complemento.setDisable(true);
		txt_Bairro.setDisable(true);
		txt_Cidade.setDisable(true);
		txt_Uf.setDisable(true);
		txt_Cep.setDisable(true);
		txt_Pais.setDisable(true);
		btn_Documentos.setDisable(true);
		btn_Salvar.setDisable(true);

	}

	private void novo() {
		btn_Editar.setDisable(false);
		btn_Excluir.setDisable(false);
		btn_Relatorio.setDisable(false);
		lbl_Usuario.setDisable(false);
		// lblData.setDisable(false);
		// txtId.setDisable(false);
		txt_Nome.setDisable(false);
		btn_adicionarImagem.setDisable(false);
		txt_Cpf.setDisable(false);
		txt_Rg.setDisable(false);
		txt_Nacionalidade.setDisable(false);
		txt_Naturalidade.setDisable(false);
		txt_DataNascimento.setDisable(false);
		txt_OrgaoEmissor.setDisable(false);
		txt_DtaEmissao.setDisable(false);
		txt_TituloEleitor.setDisable(false);
		txt_Cdi.setDisable(false);
		txt_Cnh.setDisable(false);
		txt_Cnpj.setDisable(false);
		txt_RazaoSocial.setDisable(false);
		txt_Cts.setDisable(false);
		txt_SerieCts.setDisable(false);
		txt_EmissaCts.setDisable(false);
		txt_Nis.setDisable(false);
		txt_Reservista.setDisable(false);
		txt_Sus.setDisable(false);
		txt_Conjuge.setDisable(false);
		txt_Dependente.setDisable(false);
		txt_Dependente1.setDisable(false);
		txt_Dependente2.setDisable(false);
		txt_Cargo.setDisable(false);
		txt_Setor.setDisable(false);
		txt_Admissao.setDisable(false);
		txt_Curso.setDisable(false);
		txt_Conclusao.setDisable(false);
		txt_Curso1.setDisable(false);
		txt_Conclusao1.setDisable(false);
		txt_Afastamento.setDisable(false);
		txt_MotivoAfastamento.setDisable(false);
		txt_RetornoAfastamento.setDisable(false);
		txt_VencimentoContrato.setDisable(false);
		txt_ProrrogacaoContrato.setDisable(false);
		txt_FormaPagamento.setDisable(false);
		txt_Demissao.setDisable(false);
		txt_Banco.setDisable(false);
		txt_Agencia.setDisable(false);
		txt_Conta.setDisable(false);
		txt_Digito.setDisable(false);
		txt_Telefone.setDisable(false);
		txt_Celular.setDisable(false);
		txt_Celular1.setDisable(false);
		txt_Email.setDisable(false);
		txt_Logradouro.setDisable(false);
		txt_Numero.setDisable(false);
		txt_Complemento.setDisable(false);
		txt_Bairro.setDisable(false);
		txt_Cidade.setDisable(false);
		txt_Uf.setDisable(false);
		txt_Cep.setDisable(false);
		txt_Pais.setDisable(false);
		btn_Documentos.setDisable(false);
		btn_Salvar.setDisable(false);

	}

	@FXML
	public void onbtnSalvar(ActionEvent event) {	
		try {
				System.out.println("01");
			service.saveOrUpdate(entity);
			System.out.println("01");
			Utils.currentStage(event).close();
			System.out.println("01");
		} catch (ValidationException e) {

		} catch (DbException e) {
			Alerts.showAlert("Error saving object", null, e.getMessage(), AlertType.ERROR);
		}
	}

	public void onBtnNovo(ActionEvent e) {
		novo();
	}

	public void onLabelUsuario() {
		LblUsuario dao = new LblUsuario();
		String login = dao.getUsuario();
		lbl_Usuario.setText(login);

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		camposInativos();
		onLabelUsuario();
	}

}
