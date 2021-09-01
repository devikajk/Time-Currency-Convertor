package timecurrency1.timeconvert;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import timecurrency1.main;
public class timeconvertController {
	private main main;
	ObservableList<String> country1list = FXCollections.observableArrayList("India", "Japan", "Dubai");
	ObservableList<String> country2list = FXCollections.observableArrayList("India", "Japan","Dubai");
	ObservableList<String> amlist = FXCollections.observableArrayList("AM","PM");
	@FXML
	private ChoiceBox country1;
	@FXML
	private ChoiceBox country2;
	@FXML
	private ChoiceBox ampm;
	@FXML
	private void initialize() {
		country1.setItems(country1list);
		country2.setItems(country2list);
		ampm.setItems(amlist);
	}
	 @FXML
	 private Button timeconverttomain;
	 @FXML
	 public void timeconverttomain() throws IOException {
			main.showmainmenu();
		}
}
