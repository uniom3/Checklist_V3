package gui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EquipamentoController {
	
	@FXML
	private Button btn_novo;
	@FXML
	private Button btn_editar;
	@FXML
	private Button btn_excluir;
	@FXML
	private Button btn_pesquisa;
	@FXML
	private Button btn_salvar;
	@FXML
	private Button btn_sair;
	@FXML
	private TextField txt_numeral;
	@FXML
	private TextField txt_classe;
	
	public void conexao() {
		ScrollPane root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("../gui/Desenho.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Stage stage1 = new Stage();
		stage1.setTitle("Cadastro de Desenho");
		Scene scene = new Scene(root, 400, 240);
		stage1.setScene(scene);
		stage1.setMaximized(true);
		stage1.show();
			
	}

}
