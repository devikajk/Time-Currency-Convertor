package timecurrency1;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class main extends Application {
	private static Stage primaryStage;
	private static BorderPane mainLayout;
	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setResizable(false);
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Time and Currency Converter");
		showMainView();
		showmainmenu();
	}
	private void showMainView() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(main.class.getResource("view/MainView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void showmainmenu() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(main.class.getResource("view/mainmenu.fxml"));
		BorderPane mainmenu = loader.load();
		mainLayout.setCenter(mainmenu);
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void showDisplayScene() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(main.class.getResource("display/Display.fxml"));
		BorderPane displaymain = loader.load();
		mainLayout.setCenter(displaymain);
		
	}
	public static void showTimeConvertScene() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(main.class.getResource("timeconvert/timeconvert.fxml"));
		BorderPane timeconvert = loader.load();
		mainLayout.setCenter(timeconvert);
	}
	public static void showCurrencyConvertScene() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(main.class.getResource("convert/convert.fxml"));
		BorderPane convert = loader.load();
		mainLayout.setCenter(convert);
	}
	public static void showcredits() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(main.class.getResource("view/credits.fxml"));
		BorderPane credits = loader.load();
		Stage huh = new Stage();
		huh.setTitle("Credits");
		huh.initModality(Modality.NONE);
		huh.initOwner(primaryStage);
		Scene scene = new Scene(credits);
		huh.setScene(scene);
		huh.showAndWait();
	}
}
