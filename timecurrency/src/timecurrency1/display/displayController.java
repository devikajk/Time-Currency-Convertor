package timecurrency1.display;
import timecurrency1.main;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
public class displayController {
	SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("hh:mm aa\ndd MMMMMMMMM yyyy");
	private main main;
	ObservableList<String> countrylist = FXCollections.observableArrayList("Argentina", "Australia", "Bahrain","Belgium","Brazil","Canada","Denmark","Finland","France","India","Ireland","Japan","Latvia","Mexico","Netherlands","Norway","Samoa","Switzerland","United Kingdom");
	@FXML
	private ChoiceBox countrybox;
	@FXML
	private Text countryname,countrycapital,countrycurrency,countrytimezone,time;
	@FXML
	private Button displaybutton,displaytomain;
	@FXML
	private void initialize() {
		countrybox.setItems(countrylist);
		dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		time.setText(dateTimeInGMT.format(new Date()));
	}
	 @FXML
	 public void displaytomain() throws IOException {
			main.showmainmenu();
		}
	 //SETTING VALUES OF THE TEXT :(
	 @FXML
	 void setvalues(ActionEvent event) {
	    	countryname.setText((String) countrybox.getValue());
	    	if(countrybox.getValue()=="India")
	    		{	countrycapital.setText("Delhi");
	    			countrycurrency.setText("Rupees");
	    			countrytimezone.setText("GMT+5:30");
	    			dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
	    			time.setText(dateTimeInGMT.format(new Date()));
	    		}
	    	else if(countrybox.getValue()=="Canada")
	    	{	countrycapital.setText("Ottawa");
				countrycurrency.setText("Canadian dollar");
				countrytimezone.setText("GMT-2:30\nGMT-3\nGMT-5\nGMT-6\nGMT-7");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("America/Grenada"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Samoa")
	    		{
	    			countrycapital.setText("Apia");
	    			countrycurrency.setText("Samoan tala");
					countrytimezone.setText("GMT+14");
					dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("Pacific/Kiritimati"));
	    			time.setText(dateTimeInGMT.format(new Date()));
	    		}
	    	else if(countrybox.getValue()=="Argentina")
	    	{
	    		countrycapital.setText("Buenos Aires");
    			countrycurrency.setText("Peso");
				countrytimezone.setText("GMT-3");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("America/Argentina/Buenos_Aires"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Australia")
	    	{
	    		countrycapital.setText("Canberra");
    			countrycurrency.setText("Australian dollar");
				countrytimezone.setText("GMT+11\nGMT+10:30\nGMT+8\nGMT+7\n");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("Asia/Sakhalin"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Bahrain")
	    	{
	    		countrycapital.setText("Manama");
    			countrycurrency.setText("Bahraini dinar");
				countrytimezone.setText("GMT+3\n");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("Africa/Juba"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Belgium")
	    	{
	    		countrycapital.setText("Brussels");
    			countrycurrency.setText("Euro");
				countrytimezone.setText("GMT+2\n");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("Asia/Istanbul"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Belgium")
	    	{
	    		countrycapital.setText("Brussels");
    			countrycurrency.setText("Euro");
				countrytimezone.setText("GMT+2\n");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("Asia/Istanbul"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Brazil")
	    	{
	    		countrycapital.setText("Brasilia");
    			countrycurrency.setText("Brasilian real");
				countrytimezone.setText("GMT-2\nGMT-3\nGMT-4\nGMT-5\n");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("America/Bahia"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Denmark")
	    	{
	    		countrycapital.setText("Copenhagen");
    			countrycurrency.setText("Danish krone");
				countrytimezone.setText("GMT+2\n");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("Asia/Istanbul"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Finland")
	    	{
	    		countrycapital.setText("Helsinki");
    			countrycurrency.setText("Euro");
				countrytimezone.setText("GMT+3\n");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("Europe/Minsk"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="France")
	    	{
	    		countrycapital.setText("Paris");
    			countrycurrency.setText("Euro");
				countrytimezone.setText("GMT+2\n");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("Asia/Istanbul"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Ireland")
	    	{
	    		countrycapital.setText("Dublin");
    			countrycurrency.setText("Euro");
				countrytimezone.setText("GMT+0\n");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("WET"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Japan")
	    	{
	    		countrycapital.setText("Tokyo");
    			countrycurrency.setText("Yen");
				countrytimezone.setText("GMT+9\n");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("ACT"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Latvia")
	    	{
	    		countrycapital.setText("Riga");
    			countrycurrency.setText("Euro");
				countrytimezone.setText("GMT+3\n");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("Europe/Minsk"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Mexico")
	    	{
	    		countrycapital.setText("Mexico City");
    			countrycurrency.setText("Mexican peso");
				countrytimezone.setText("GMT-6\nGMT-7");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("America/Havana"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Netherlands")
	    	{
	    		countrycapital.setText("Amsterdam");
    			countrycurrency.setText("Euro");
				countrytimezone.setText("GMT+2");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("Europe/Athens"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Norway")
	    	{
	    		countrycapital.setText("Oslo");
    			countrycurrency.setText("Norwegian krone");
				countrytimezone.setText("GMT+2");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("Europe/Athens"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="Switzerland")
	    	{
	    		countrycapital.setText("Berne");
    			countrycurrency.setText("Swiss franc");
				countrytimezone.setText("GMT+2");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("Europe/Athens"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    	else if(countrybox.getValue()=="United Kingdom")
	    	{
	    		countrycapital.setText("London");
    			countrycurrency.setText("Pound sterling");
				countrytimezone.setText("GMT+1");
				dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("MET"));
    			time.setText(dateTimeInGMT.format(new Date()));
	    	}
	    }
	 // end of setvalues
	
}
