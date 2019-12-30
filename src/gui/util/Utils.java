package gui.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Optional;

import gui.ColaboradorController;
import gui.PrincipalController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class Utils {
	
	private static Stage stage;

	public static Stage currentStage(ActionEvent event) {
		return (Stage) ((Node) event.getSource()).getScene().getWindow();
	}

	public static Integer tryParseToInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return null;
		}
	}

	
	public static Double tryParseToDouble(String str) {
		try {
			return Double.parseDouble(str);
		} catch (NumberFormatException e) {
			return null;
		}
	}
	public static <T> void formatTableColumnDate(TableColumn<T, Date> tableColumn, String format) {
		tableColumn.setCellFactory(column -> {
			TableCell<T, Date> cell = new TableCell<T, Date>() {
				private SimpleDateFormat sdf = new SimpleDateFormat(format);

				@Override
				protected void updateItem(Date item, boolean empty) {
					super.updateItem(item, empty);
					if (empty) {
						setText(null);
					} else {
						setText(sdf.format(item));
					}
				}
			};
			return cell;
		});
	}

	public static <T> void formatTableColumnDouble(TableColumn<T, Double> tableColumn, int decimalPlaces) {
		tableColumn.setCellFactory(column -> {
			TableCell<T, Double> cell = new TableCell<T, Double>() {
				@Override
				protected void updateItem(Double item, boolean empty) {
					super.updateItem(item, empty);
					if (empty) {
						setText(null);
					} else {
						Locale.setDefault(Locale.US);
						setText(String.format("%." + decimalPlaces + "f", item));
					}
				}
			};
			return cell;
		});
	}

	public static void formatDatePicker(DatePicker datePicker, String format) {
		datePicker.setConverter(new StringConverter<LocalDate>() {
			DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(format);
			{
				datePicker.setPromptText(format.toLowerCase());
			}

			@Override
			public String toString(LocalDate date) {
				if (date != null) {
					return dateFormatter.format(date);
				} else {
					return "";
				}
			}

			@Override
			public LocalDate fromString(String string) {
				if (string != null && !string.isEmpty()) {
					return LocalDate.parse(string, dateFormatter);
				} else {
					return null;
				}
			}
		});
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public void conexaoAnchorPane(String caminho) {
		AnchorPane root = null;
		try {
			root = FXMLLoader.load(getClass().getClassLoader().getResource(caminho));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Stage stage1 = new Stage();
		Scene scene = new Scene(root, 400, 240);
		Stage stage1 = new Stage();	
		stage1.setTitle("Checklist");
		stage1.setScene(scene);
		stage1.setMaximized(true);
		stage1.show();
		setStage(stage1);
		//stage1.close();
	//	fechar();
		}
	
	public void fechar() {
		Optional<ButtonType> result = Alerts.showConfirmation("Confirmação", "Deseja realmente sair?");

		if (result.get() == ButtonType.OK) {
			getStage().close();
		}
		
	}
	
public void conexaoScrollPane(String caminho) {
		ScrollPane root = null;
		try {
			root = FXMLLoader.load(getClass().getClassLoader().getResource(caminho));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Stage stage1 = new Stage();
		Scene scene = new Scene(root, 400, 240);
		Stage stage1 = new Stage();	
		stage1.setTitle("Checklist");
		stage1.setScene(scene);
		stage1.setMaximized(true);
		stage1.show();
		setStage(stage1);
		//stage1.close();
	//	fechar();
	}
	

}
