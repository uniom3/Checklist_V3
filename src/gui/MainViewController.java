package gui;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import gui.util.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.dao.impl.MainViewDaoJDBC;

public class MainViewController implements Initializable {
	private Connection conn;
	private static Stage stage;

	@FXML
	private TextField txtUserName;

	@FXML
	private PasswordField psfUserPassword;

	@FXML
	private Button btnsave;

	@FXML
	private Button btnclose;

	@FXML
	private ScrollPane conteudo;

	
	
	
	public TextField getTxtUserName() {
		return txtUserName;
	}

	public void setTxtUserName(TextField txtUserName) {
		this.txtUserName = txtUserName;
	}

	public PasswordField getPsfUserPassword() {
		return psfUserPassword;
	}

	public void setPsfUserPassword(PasswordField psfUserPassword) {
		this.psfUserPassword = psfUserPassword;
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

	@FXML
	public void onBtnClose(ActionEvent event) {
		fechar();		
	}
	
	@FXML
	public void onBtnSaveAction(ActionEvent event) throws IOException {	
		verificacao();
		
	}
	
	@FXML
	public void onCliqueEnter(KeyEvent evt) {
		if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
			try {
				verificacao();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@FXML
	void goTo(ActionEvent event) {

	}
	
	private void fechar() {
		Main.getStage().close();
	}

	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		MainViewController.stage = stage;
	}
	
	@SuppressWarnings("null")
	private void verificacao() throws IOException { 		
	MainViewDaoJDBC mainDAO = new MainViewDaoJDBC(conn);
		mainDAO.findByUser(txtUserName.getText().toString(), psfUserPassword.getText().toString());
		System.out.println(mainDAO.getUsuario() + mainDAO.getSenha() );
		if(getTxtUserName().getText().equals(mainDAO.getUsuario()) && getPsfUserPassword().getText().equals(mainDAO.getSenha())) {	
		
	//	if(getTxtUserName().getText().equals("root") && getPsfUserPassword().getText().equals("1234")) {
					PrincipalController principal = new PrincipalController();
				//principal.conexao();	
					Utils utils = new Utils();		
					utils.conexaoAnchorPane("gui/Principal.fxml");
				fechar();
			} 
				else {
					Alerts.showAlert("Erro ao logar", null, "Usuário ou senha incorreta", AlertType.ERROR);
					
				}
			
			}
}
//}
