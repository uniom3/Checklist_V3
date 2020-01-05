package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import db.DbException;
import gui.listener.DataChangeListener;
import gui.util.Alerts;
import gui.util.Conexoes;
import gui.util.LblUsuario;
import gui.util.MaskFieldUtil;
import gui.util.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.entities.Colaborador;
import model.exceptions.ValidationException;
import model.services.ColaboradorService;

public class ColaboradorController implements Initializable {

	private String string_sexo;
	
	private String string_estadoCivil;
	private String string_grau;
	private String string_grau1;	
	private String string_conta;
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
	private ComboBox<String> cbb_sexo;
	@FXML
	private ComboBox<String> cbb_estadoCivil;
	@FXML
	private ComboBox<String> cbb_grau;
	@FXML
	private ComboBox<String> cbb_grau1;
	@FXML
	private ComboBox<String> cbb_conta;
	@FXML
	private AnchorPane conteudoColaborador;



	public void setColaboradorService(ColaboradorService service) {
		this.service = service;
	}

	public void setColaborador(Colaborador entity) {
		this.entity = entity;
	}

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

	private void tela() {
		PrincipalController principal = new PrincipalController();

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
	public void onbtn_sair() {
		fecharColaborador();
	}

	
	public void comboBoxSexo() {
		cbb_sexo.getItems();
	}
	@FXML
	public void onradioAtivo() {
		if (rd_Ativo.isSelected() == true) {
			rd_Ativo.setSelected(true);
			entity.setAtivo(true);
		} else {
			rd_Ativo.setSelected(false);
			entity.setAtivo(false);
		}
	}

	@FXML
	public void onradioUsuarioDoSistema() {
		if (rd_UsuarioDoSistema.isSelected() == true) {
			rd_UsuarioDoSistema.setSelected(true);
			entity.setUsuarioSistema(true);
		} else {
			rd_UsuarioDoSistema.setSelected(false);
			entity.setUsuarioSistema(false);
		}
	}

	@FXML
	public void onbtnSalvar(ActionEvent event) {
		entity = getFormData();
		service.saveOrUpdate(entity);
		
		/*try {

			service.saveOrUpdate(entity);
			Utils.currentStage(event).close();
		} catch (ValidationException e) {

		} catch (DbException e) {
			Alerts.showAlert("Error saving object", null, e.getMessage(), AlertType.ERROR);
		}*/
	}

	private Colaborador getFormData() {
		Colaborador obj = new Colaborador();
		obj.setId(Utils.tryParseToInt(txt_Id.getText()));
		obj.setNome   (txt_Nome.getText());
		obj.setCpf (txt_Cpf.getText());
		obj.setRg(txt_Rg.getText());
		obj.setNacionalidade(txt_Nacionalidade.getText());
		obj.setNaturalidade(txt_Naturalidade.getText());
		//obj.setDataNascimento(txt_DataNascimento.getText());
		obj.setOrgaoemissor(txt_OrgaoEmissor.getText());
		//obj.setDataemissao(txt_DtaEmissao.getText());
		obj.setTituloeleitor(txt_TituloEleitor.getText());
		obj.setCid(txt_Cdi.getText());
		obj.setCnh(txt_Cnh.getText());
		obj.setCnpj(txt_Cnpj.getText());
		obj.setRazaosocial(txt_RazaoSocial.getText());
		obj.setCts(txt_Cts.getText());
		obj.setSeriects(txt_SerieCts.getText());
		//obj.setEmissaocts(txt_EmissaCts.getText());
		obj.setNis(txt_Nis.getText());
		obj.setReservista(txt_Reservista.getText());
		obj.setCartasus(txt_Sus.getText());
		obj.setEsposa(txt_Conjuge.getText());
		obj.setDependente(txt_Dependente.getText());
		obj.setDependente2(txt_Dependente1.getText());
		obj.setDependente3(txt_Dependente2.getText());
		obj.setCargo(txt_Cargo.getText());
		obj.setSetor(txt_Setor.getText());
		//obj.setDemissao(txt_Admissao.getText());
		obj.setCurso(txt_Curso.getText());
		obj.setConclusao(txt_Conclusao.getText());
		obj.setCurso(txt_Curso1.getText());
		obj.setConclusao1(txt_Conclusao1.getText());
		//obj.setAfastamento (txt_Afastamento.getText());
		obj.setMotivoafastamento(txt_MotivoAfastamento.getText());
		//obj.setRetorno(txt_RetornoAfastamento.getText());
		//obj.setVencimentocontrato(txt_VencimentoContrato.getText());
		//obj.setProrrogacaocontrato (txt_ProrrogacaoContrato.getText());
		obj.setFormapagamento(txt_FormaPagamento.getText());
		//obj.setDemissao (txt_Demissao.getText());
		obj.setBanco(txt_Banco.getText());
		obj.setAgencia(txt_Agencia.getText());
		obj.setConta(txt_Conta.getText());
		obj.setDigito(txt_Digito.getText());
		obj.setEmail(txt_Email.getText());
		obj.setTelefone(txt_Telefone.getText());
		obj.setCelular1(txt_Celular.getText());
		obj.setCelular2(txt_Celular1.getText());
		obj.setLogradouro(txt_Logradouro.getText());
		obj.setNumero(txt_Numero.getText());
		obj.setComplemento(txt_Complemento.getText());
		obj.setBairro(txt_Bairro.getText());
		obj.setCidade(txt_Cidade.getText());
		obj.setUf(txt_Uf.getText());
		obj.setCEP(txt_Cep.getText());
		obj.setPais(txt_Pais.getText());
		return obj;	
	}

	public void onBtnNovo(ActionEvent e) {
		novo();
	}

	public void onLabelUsuario() {
		LblUsuario dao = new LblUsuario();
		String login = dao.getUsuario();
		lbl_Usuario.setText(login);

	}

	public void inicializeComboBox() {
		gui.util.ComboBox.sexo(cbb_sexo);
		gui.util.ComboBox.estadoCivil(cbb_estadoCivil);
		gui.util.ComboBox.grau(cbb_grau);
		gui.util.ComboBox.grau(cbb_grau1);
		gui.util.ComboBox.conta(cbb_conta);
	}

	public void inicializeMascara() {
		MaskFieldUtil.foneField(this.txt_Telefone);
		MaskFieldUtil.cepField(this.txt_Cep);
		MaskFieldUtil.cpfField(this.txt_Cpf);
		MaskFieldUtil.dateField(this.txt_DataNascimento);
		MaskFieldUtil.dateField(this.txt_Demissao);
		MaskFieldUtil.dateField(this.txt_Admissao);
		MaskFieldUtil.dateField(this.txt_Afastamento);
		MaskFieldUtil.dateField(this.txt_RetornoAfastamento);
		MaskFieldUtil.dateField(this.txt_EmissaCts);
		MaskFieldUtil.dateField(this.txt_DtaEmissao);
		MaskFieldUtil.cepField(this.txt_Cep);
		MaskFieldUtil.cnpjField(this.txt_Cnpj);
		MaskFieldUtil.foneField(this.txt_Telefone);
		MaskFieldUtil.foneField(this.txt_Celular);
		MaskFieldUtil.foneField(this.txt_Celular1);
		MaskFieldUtil.rgField(this.txt_Rg);
	}

	public void updateFormData() {
		if(entity == null) {
			throw new IllegalStateException("Entidade nula");
		}

		txt_Id.setText(String.valueOf(entity.getId()));
		txt_Nome.setText(entity.getNome());
		txt_Cpf.setText(entity.getCpf());
		txt_Rg.setText(entity.getRg());
		txt_Nacionalidade.setText(entity.getNacionalidade());
		txt_Naturalidade.setText(entity.getNaturalidade());
	  //  rd_Ativo.setSelected(entity.getAtivo());
	//	rd_UsuarioDoSistema.setSelected(entity.getUsuarioSistema());
		// txt_DataNascimento .setText(entity.getDataNascimento());
		txt_OrgaoEmissor.setText(entity.getOrgaoemissor());
		// txt_DtaEmissao .setText( entity.getDataemissao());
		txt_TituloEleitor.setText(entity.getTituloeleitor());
		txt_Cdi.setText(entity.getCid());
		txt_Cnh.setText(entity.getCnh());
		txt_Cnpj.setText(entity.getCnpj());
		txt_RazaoSocial.setText(entity.getRazaosocial());
		txt_Cts.setText(entity.getCts());
		txt_SerieCts.setText(entity.getSeriects());
		// txt_EmissaCts .setText(entity.getEmissaocts() );
		txt_Nis.setText(entity.getNis());
		txt_Reservista.setText(entity.getReservista());
		txt_Sus.setText(entity.getCartasus());
		txt_Conjuge.setText(entity.getEsposa());
		txt_Dependente.setText(entity.getDependente());
		txt_Dependente1.setText(entity.getDependente2());
		txt_Dependente2.setText(entity.getDependente3());
		txt_Cargo.setText(entity.getCargo());
		txt_Setor.setText(entity.getSetor());
		// txt_Admissao .setText( entity.getAdmissao());
		txt_Curso.setText(entity.getCurso());
		txt_Conclusao.setText(entity.getConclusao());
		txt_Curso1.setText(entity.getCurso1());
		txt_Conclusao1.setText(entity.getConclusao1());
		// txt_Afastamento .setText(entity.getAfastamento());
		txt_MotivoAfastamento.setText(entity.getMotivoafastamento());
		// txt_RetornoAfastamento .setText(entity.getRetorno() );
		// txt_VencimentoContrato .setText(entity.getVencimentocontrato() );
		// txt_ProrrogacaoContrato .setText(entity.getProrrogacaocontrato() );
		txt_FormaPagamento.setText(entity.getFormapagamento());
		// txt_Demissao .setText(entity.getDemissao() );
		txt_Banco.setText(entity.getBanco());
		txt_Agencia.setText(entity.getAgencia());
		txt_Conta.setText(entity.getConta());
		txt_Digito.setText(entity.getDigito());
		txt_Telefone.setText(entity.getTelefone());
		txt_Celular.setText(entity.getCelular1());
		txt_Celular1.setText(entity.getCelular2());
		txt_Email.setText(entity.getEmail());
		txt_Logradouro.setText(entity.getLogradouro());
		txt_Numero.setText(entity.getNumero());
		txt_Complemento.setText(entity.getComplemento());
		txt_Bairro.setText(entity.getBairro());
		txt_Cidade.setText(entity.getCidade());
		txt_Uf.setText(entity.getUf());
		txt_Cep.setText(entity.getCEP());
		txt_Pais.setText(entity.getPais());
		 cbb_sexo .setPromptText(entity.getSexo());
		 cbb_estadoCivil .setPromptText(entity.getEstadocivil() );
		// cbb_grau .setText(entity.get );
		// cbb_grau1 .setText(entity.get );
		// cbb_conta.setText( entity.get);
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		camposInativos();
		onLabelUsuario();
		inicializeComboBox();
		inicializeMascara();
	}

	public void subscribeDataChangeListener(Conexoes conexoes) {
		
		
	}

}
