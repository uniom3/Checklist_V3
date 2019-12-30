package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Utils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.services.PrincipalService;

public class PrincipalController implements Initializable {

	
	private static Stage stage;

	@FXML
	private MenuItem menuItemPessoa;
	@FXML
	private MenuItem menuItemColaborador;
	@FXML
	private MenuItem menuItemcadastroCliente;
	@FXML
	private MenuItem menuItemcadastroFornecedor;
	@FXML
	private MenuItem menuItemcadastroOrcamento;
	@FXML
	private MenuItem menuItemcadastroOrdemServico;
	@FXML
	private MenuItem menuItemdesenhoEquipamento;
	@FXML
	private MenuItem menuItemdocumentos;
	@FXML
	private MenuItem menuItemremessa;
	@FXML
	private MenuItem menuItemgrupo;
	@FXML
	private MenuItem menuItemusuario;
	@FXML
	private MenuItem menuItemsenha;
	@FXML
	private MenuItem menuItemsenhaUsuario;
	@FXML
	private MenuItem menuItemsair;
	@FXML
	private ScrollPane scroll;

	@FXML
	public void onmenuItemdesenhoEquipamento() {
		Utils utils = new Utils();		
		utils.conexaoScrollPane("gui/Desenho.fxml");
	}

	@FXML
	public void onmenuItemPessoa() {

	}

	@FXML
	public void onmenuItemsenhaUsuario() {

	}

	@FXML
	public void onmenuItemsenha() {

	}

	@FXML
	public void onmenuItemusuario() {

	}

	@FXML
	public void onmenuItemgrupo() {

	}

	@FXML
	public void onmenuItemremessa() {

	}

	@FXML
	public void onmenuItemdocumentos() {

	}

	@FXML
	public void onmenuItemcadastroOrdemServico() {

	}

	@FXML
	public void onmenuItemcadastroOrcamento() {

	}

	@FXML
	public void onmenuItemcadastroFornecedor() {

	}

	@FXML
	public void onmenuItemCadastroColaborador() {
ColaboradorController colaborador = new ColaboradorController();
colaborador.conexao();
	}

	@FXML
	public void onmenuItemcadastroCliente() {

	}

	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		PrincipalController.stage = stage;
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}
	
	public void conexao() {
		AnchorPane root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("../gui/Principal.fxml"));
			Scene scene = new Scene(root, 1024,	768);
			Stage stage1 = new Stage();
			stage1.setTitle("Checklist");
			stage1.setScene(scene);
			stage1.setMaximized(true);
			stage1.show();
			setStage(stage1);
			
		} catch (IOException e) {
			e.printStackTrace();
		}	

	}
	@FXML
	public void onmenuItemsair() {
		Utils utils = new Utils();
		utils.fechar();
	}

	public void setPrincipalService(PrincipalService principalService) {
		// TODO Auto-generated method stub

	}

}
