package gui;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Utils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class desenhoController implements Initializable{
	
	@FXML
	private TextField txt_codigo;
	@FXML
	private Button btn_novo;
	@FXML
	private Button btn_editar;
	@FXML
	private Button btn_pesquisar;
	@FXML
	private Label lbl_usuario;
	@FXML
	private Label lbl_data;
	@FXML
	private TextField txt_codSetor;
	@FXML
	private TextField txt_namSetor;
	@FXML
	private Button btn_pesquisaSetor;
	@FXML
	private TextField txt_codClasse;
	@FXML
	private TextField txt_namClasse;
	@FXML
	private Button btn_pesquisaClasse;
	@FXML
	private TextField txt_codEquipamento;
	@FXML
	private TextField txt_namEquipamento;
	@FXML
	private Button btn_pesquisaEquipamento;
	@FXML
	private TextField txt_desenhoAntigo;
	@FXML
	private Button btn_selecionarArquivo;
	@FXML
	private TextField txt_numeroDesenho;
	@FXML
	private TextField txt_descricaoDesenho;
	@FXML
	private TextField txt_revisaoDesenho;
	@FXML
	private TextField txt_caminhoDesenho;
	@FXML
	private Button btn_salvar;
	@FXML
	private Button btn_cancelar;
	@FXML
	private Button btn_abrirnoCad;
	@FXML
	private Button btn_excluir;
	@FXML
	private Button btn_adicionarEncomenda;
	@FXML
	private Button btn_excluirEncomenda;
	@FXML
	private Button btn_sair;
	
	

	public static Stage getStage() {
		return stage;
	}
	
	public static void setStage(Stage stage) {
		desenhoController.stage = stage;
	}
	
	private static Stage stage;

	@FXML
	public void onbtn_sair() {
		Utils utils = new Utils();
		utils.fechar();
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle rgb) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
