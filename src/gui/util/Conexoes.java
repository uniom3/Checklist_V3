package gui.util;

import java.io.IOException;

import gui.ColaboradorController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.entities.Colaborador;
import model.services.ColaboradorService;

public class Conexoes {

	private static Stage stage;
	
	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	public void conexaoScrollPane(Object obj,String caminho ) {
		ScrollPane root = null;
		try {
			root = FXMLLoader.load(getClass().getClassLoader().getResource(caminho));
		} catch (IOException e) {
			e.printStackTrace();
		} 
		Scene scene = new Scene(root, 1064, 775);
		Stage stage1 = new Stage();	
		stage1.setTitle("Checklist");
		stage1.setScene(scene);
		stage1.setMaximized(true);
		stage1.show();
		setStage(stage1);
	}
	
	
	public void createDialogForm(Colaborador obj, String absoluteName)  {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			ScrollPane pane;
			pane = loader.load();
			ColaboradorController controller = loader.getController();
			controller.setColaborador(obj);
			controller.setColaboradorService(new ColaboradorService());
			controller.updateFormData();			
			Scene scene = new Scene(pane, 1064, 775);
			Stage stage1 = new Stage();	
			stage1.setTitle("Checklist");
			stage1.setScene(scene);
			stage1.setMaximized(true);
			stage1.show();
			setStage(stage1);
		} catch (IOException e) {
			e.printStackTrace();
			Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}	
		
	}

}
