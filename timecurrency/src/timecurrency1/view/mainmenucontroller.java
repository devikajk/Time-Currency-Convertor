package timecurrency1.view;
import timecurrency1.main;
import java.io.IOException;
import javafx.fxml.*;
public class mainmenucontroller {
	private main main;
	@FXML
	public void goDisplay() throws IOException {
		main.showDisplayScene();
	}
	@FXML
	public void goTimeConvert() throws IOException {
		main.showTimeConvertScene();
	}
	@FXML 
	public void goCurrency() throws IOException {
		main.showCurrencyConvertScene();
	}
	public void showcredits() throws IOException {
		main.showcredits();
	}
}
