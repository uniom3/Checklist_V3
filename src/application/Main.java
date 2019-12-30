package application;

import java.io.IOException;

import gui.util.Utils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	private static Stage stage;
	
	 Scene mainScene;
		
	@Override
	public void start(Stage primaryStage) throws IOException {
		AnchorPane loader =  FXMLLoader.load(getClass().getResource("../gui/MainView.fxml"));
		mainScene = new Scene(loader);
		primaryStage.setTitle("Checklist");
		primaryStage.setScene(mainScene);
		//primaryStage.setMaximized(true);
		primaryStage.show();
		setStage(primaryStage);			
		
	}
	

	
	public static Stage getStage() {
		return stage;
	}



	public static void setStage(Stage stage) {
		Main.stage = stage;
	}



	public static void main(String[] args) {
		launch(args);
	}

	public void fechar() {
		Main.getStage().close();
	}
	
}
