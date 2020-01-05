package gui.util;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;




public class ComboBox {
		
	
	
	
	public static void sexo(javafx.scene.control.ComboBox<String> cbb_generico) {
		ObservableList<String> obsSexo;
		List<String> listSexo = new ArrayList<>();
		listSexo.add("Masculino");
		listSexo.add("Feminino");
		obsSexo = FXCollections.observableArrayList(listSexo);
		cbb_generico.setItems(obsSexo);
	}
	
	public static void estadoCivil(javafx.scene.control.ComboBox<String> cbb_generico) {
		ObservableList<String> obsEstadoCivil;
		List<String> listestado = new ArrayList<>();
		listestado.add("Solteiro");
		listestado.add("Casado");
		listestado.add("Divorciado");
		listestado.add("União Estável");
		obsEstadoCivil = FXCollections.observableArrayList(listestado);
		cbb_generico.setItems(obsEstadoCivil);
	}

	public static void grau(javafx.scene.control.ComboBox<String> cbb_generico) {
		ObservableList<String> obsgrau;
		List<String> listGrau = new ArrayList<>();
		listGrau.add("Graduação");
		listGrau.add("Técnico");
		listGrau.add("Pós Graduação");
		obsgrau = FXCollections.observableArrayList(listGrau);
		cbb_generico.setItems(obsgrau);
	}
	
	public static void conta(javafx.scene.control.ComboBox<String> cbb_generico) {
		ObservableList<String> obsConta;
		List<String> listConta = new ArrayList<>();
		listConta.add("Corrente");
		listConta.add("Poupança");
		listConta.add("Salário");
		obsConta = FXCollections.observableArrayList(listConta);
		cbb_generico.setItems(obsConta);
	}
	
	


}
