package timecurrency1.convert;
import java.io.IOException;
import java.text.DecimalFormat;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import timecurrency1.main;
public class convertController {
	 DecimalFormat df = new DecimalFormat("0.00");
	 private main main;
	 @FXML
	 private Text maintext;
	 @FXML
	 private Label fromlabel;
	 @FXML
	 private Button tomain;
	 @FXML
	 public void tomain() throws IOException {
			main.showmainmenu();
		}
	 @FXML
	 private ChoiceBox frombox,tobox;
	 @FXML
	 private TextField fromvalue;
	 @FXML
	 private Button convert;
	 ObservableList<String> fromlist = FXCollections.observableArrayList("Canadian Dollar","Dollar","Euro","Franc","Kuwaiti dinar","Pound","Rucle","Rupee","Yen","Yuan");
	 ObservableList<String> tolist = FXCollections.observableArrayList("Canadian Dollar","Dollar","Euro","Franc","Kuwaiti dinar","Pound","Rucle","Rupee","Yen","Yuan");
	 @FXML
	 void initialize() {
		 frombox.setItems(fromlist);
		 tobox.setItems(tolist);
	 }
	 public void fromlabelchange()
	 {
		 fromlabel.setText((String)frombox.getValue());
	 }
	 public void conversion() {
		 String m1,n1;
		 int m,n;
		 double mval,nval;
		 n1=(String)frombox.getValue();
		 m1=(String)tobox.getValue();
		 if(m1=="Canadian Dollar")
			 m=1;
		 else if(m1=="Yuan")
			 m=2;
		 else if(m1=="Euro")
			 m=3;
		 else if(m1=="Rupee")
			 m=4;
		 else if(m1=="Yen")
			 m=5;
		 else if(m1=="Kuwaiti dinar")
			 m=6;
		 else if(m1=="Pound")
			 m=7;
		 else if(m1=="Rucle")
			 m=8;
		 else if(m1=="Franc")
			 m=9;
		 else
			 m=10;
		 //////
		 if(n1=="Canadian Dollar")
			 n=1;
		 else if(n1=="Yuan")
			 n=2;
		 else if(n1=="Euro")
			 n=3;
		 else if(n1=="Rupee")
			 n=4;
		 else if(n1=="Yen")
			 n=5;
		 else if(n1=="Kuwaiti dinar")
			 n=6;
		 else if(n1=="Pound")
			 n=7;
		 else if(n1=="Rucle")
			 n=8;
		 else if(n1=="Franc")
			 n=9;
		 else
			 n=10;
		 if(m!=n)
		 {
			 nval=Double.valueOf(fromvalue.getText());
			 switch(n)
			 {
				 case 1: if(m==1)
						maintext.setText("\nNo need to convert");
						else if(m==2)
						{
							mval=nval*5.35;
							maintext.setText(nval+" Canadian Dollar = "+mval+" Chinese Yuan");
						}
						else if(m==3)
						{
							mval=nval*0.68;
							maintext.setText(nval+" Canadian Dollar = "+mval+" European Euro");
						}
						else if(m==4)
						{
							mval=nval*53.34;
							maintext.setText(nval+" Canadian Dollar = "+mval+" Indian Rupee");
						}
						else if(m==5)
						{
							mval=nval*80.71;
							maintext.setText(nval+" Canadian Dollar = "+mval+" Japanese Yen");
						}
						else if(m==6)
						{
							mval=nval*0.23;
							maintext.setText(nval+" Canadian Dollar = "+mval+" Kuwaiti Dinar");
						}
						else if(m==7)
						{
							mval=nval*0.61;
							maintext.setText(nval+" Canadian Dollar = "+mval+" Pound Sterling");
						}
						else if(m==8)
						{
							mval=nval*48.66;
							maintext.setText(nval+" Canadian Dollar = "+mval+" Russain Ruble");
						}
						
						else if(m==9)
						{
							mval=nval*0.75;
							maintext.setText(nval+" Canadian Dollar = "+mval+" Swis Franc");
						}
						else 
						{
							mval=(nval*0.75);
							maintext.setText(nval+" Canadian Dollar = "+mval+" USD");
						}
						break; 
				 case 2: if(m==2)
					 	maintext.setText("\nNo need to convert");
						else if(m==1)
						{
							mval=nval*107.48;
							maintext.setText(nval+" Chinese Yuan = "+mval+" Canadian Dollar");
						}
						else if(m==3)
						{
							mval=nval*107.48;
							maintext.setText(nval+" Chinese Yuan = "+mval+" European Euro");
						}
						else if(m==4)
						{
							mval=nval*71.11;
							maintext.setText(nval+" Chinese Yuan = "+mval+" Indian Rupee");
						}
						else if(m==5)
						{
							mval=nval*107.48;
							maintext.setText(nval+" Chinese Yuan = "+mval+" Japanese Yen");
						}
						else if(m==6)
						{
							mval=nval*107.48;
							maintext.setText(nval+" Chinese Yuan = "+mval+" Kuwaiti Dinar");
						}
						else if(m==7)
						{
							mval=nval*0.82;
							maintext.setText(nval+" Chinese Yuan = "+mval+" Pound Sterling");
						}
						else if(m==8)
						{
							mval=nval*107.48;
							maintext.setText(nval+" Chinese Yuan = "+mval+" Russain Ruble");
						}
						else if(m==9)
						{
							mval=nval*1.00;
							maintext.setText(nval+" Chinese Yuan = "+mval+" Swis Franc");
						}
						else 
						{
							mval=nval*71.11;
							maintext.setText(nval+" Chinese Yuan = "+mval+" USD");
						}
						break;
				 case 3: if(m==3)
						System.out.print("\nNo need to convert");
						else if(m==1)
						{
							mval=nval*1.46;
							maintext.setText(nval+" European Euro = "+mval+" Canadian Dollar");
						}
						else if(m==2)
						{
							mval=nval*7.83;
							maintext.setText(nval+" European Euro = "+mval+" Chinese Yuan");
						}
						else if(m==4)
						{
							mval=nval*78.02;
							maintext.setText(nval+" European Euro = "+mval+" Indian Rupee");
						}
						
						else if(m==5)
						{
							mval=nval*118.03;
							maintext.setText(nval+" European Euro = "+mval+" Japanese Yen");
						}
						else if(m==6)
						{
							mval=nval*0.33;
							maintext.setText(nval+" European Euro = "+mval+" Kuwaiti Dinar");
						}
						else if(m==7)
						{
							mval=nval*0.90;
							maintext.setText(nval+" European Euro = "+mval+" Pound Sterling");
						}
						else if(m==8)
						{
							mval=nval*71.16;
							maintext.setText(nval+" European Euro = "+mval+" Russain Ruble");
						}
						else if(m==9)
						{
							mval=nval*1.09;
							maintext.setText(nval+" European Euro = "+mval+" Swis Franc");
						}
						else 
						{
							mval=nval*1.10;
							maintext.setText(nval+" European Euro = "+mval+" USD");
						}
						break;
				 case 4: if(m==4)
						System.out.print("\nNo need to convert");
						else if(m==1)
						{
							mval=nval*0.019;
							maintext.setText(nval+" Indian Rupee = "+mval+" Canadian Dollar");
						}
						else if(m==2)
						{
							mval=nval*0.10;
							maintext.setText(nval+" Indian Rupee = "+mval+" Chinese Yuan");
						}
						else if(m==3)
						{
							mval=nval*0.013;
							maintext.setText(nval+" Indian Rupee = "+mval+" European Euro");
						}
						else if(m==5)
						{
							mval=nval*1.51;
							maintext.setText(nval+" Indian Rupee = "+mval+" Japanese Yen");
						}
						else if(m==6)
						{
							mval=nval*0.0043;
							maintext.setText(nval+" Indian Rupee = "+mval+" Kuwaiti Dinar");
						}
						else if(m==7)
						{
							mval=nval*0.012;
							maintext.setText(nval+" Indian Rupee = "+mval+" Pound Sterling");
						}
						else if(m==8)
						{
							mval=nval*0.91;
							maintext.setText(nval+" Indian Rupee = "+mval+" Russain Ruble");
						}
						else if(m==9)
						{
							mval=nval*0.014;
							maintext.setText(nval+" Indian Rupee = "+mval+" Swis Franc");
						}
						else 
						{
							mval=nval*0.014;
							maintext.setText(nval+" Indian Rupee = "+mval+" USD");
						}
						break;
				case 5: if(m==5)
						maintext.setText("\nNo need to convert");
						else if(m==1)
						{
							mval=nval*0.012;
							maintext.setText(nval+" Japanese Yen = "+mval+" Canadian Dollar");
						}
						else if(m==2)
						{
							mval=nval*0.066;
							maintext.setText(nval+" Japanese Yen = "+mval+" Chinese Yuan");
						}
						else if(m==3)
						{
							mval=nval*0.0085;
							maintext.setText(nval+" Japanese Yen = "+mval+" European Euro");
						}
						else if(m==4)
						{
							mval=nval*0.66;
							maintext.setText(nval+" Japanese Yen = "+mval+" Indian Rupee");
						}
						else if(m==6)
						{
							mval=nval*0.0028;
							maintext.setText(nval+" Japanese Yen = "+mval+" Kuwaiti Dinar");
						}
						else if(m==7)
						{
							mval=nval*0.0076;
							maintext.setText(nval+" Japanese Yen = "+mval+" Pound Sterling");
						}
						else if(m==8)
						{
							mval=nval*0.60;
							maintext.setText(nval+" Japanese Yen = "+mval+" Russain Ruble");
						}
						
						else if(m==9)
						{
							mval=nval*0.0093;
							maintext.setText(nval+" Japanese Yen = "+mval+" Swis Franc");
						}
						else 
						{
							mval=nval*0.0093;
							maintext.setText(nval+" Japanese Yen = "+mval+" USD");
						}
						break;
				case 6: if(m==6)
						maintext.setText("\nNo need to convert");
						else if(m==1)
						{
							mval=nval*4.38;
							maintext.setText(nval+" Kuwaiti Dinar = "+mval+" Canadian Dollar");
						}
						else if(m==2)
						{
							mval=nval*23.45;
							maintext.setText(nval+" Kuwaiti Dinar = "+mval+" Chinese Yuan");
						}
						else if(m==3)
						{
							mval=nval*2.99;
							maintext.setText(nval+" Kuwaiti Dinar = "+mval+" European Euro");
						}
						else if(m==4)
						{
							mval=nval*233.82;
							maintext.setText(nval+" Kuwaiti Dinar = "+mval+" Indian Rupee");
						}
						
						else if(m==5)
						{
							mval=nval*353.45;
							maintext.setText(nval+" Kuwaiti Dinar = "+mval+" Japanese Yen");
						}
						else if(m==7)
						{
							mval=nval*2.69;
							maintext.setText(nval+" Kuwaiti Dinar = "+mval+" Pound Sterling");
						}
						else if(m==8)
						{
							mval=nval*213.30;
							maintext.setText(nval+" Kuwaiti Dinar = "+mval+" Russain Ruble");
						}
						
						else if(m==9)
						{
							mval=nval*3.27;
							maintext.setText(nval+" Kuwaiti Dinar = "+mval+" Swis Franc");
						}
						else 
						{
							mval=nval*3.29;
							maintext.setText(nval+" Kuwaiti Dinar = "+mval+" USD");
						}
						
						break;
				case 7: if(m==7)
						maintext.setText("\nNo need to convert");
						else if(m==1)
						{
							mval=nval*1.63;
							maintext.setText(nval+" Pound Sterling = "+mval+" Canadian Dollar");
						}
						else if(m==2)
						{
							mval=nval*8.70;
							maintext.setText(nval+" Pound Sterling = "+mval+" Chinese Yuan");
						}
						else if(m==3)
						{
							mval=nval*1.11;
							maintext.setText(nval+" Pound Sterling = "+mval+" European Euro");
						}
						else if(m==4)
						{
							mval=nval*86.76;
							maintext.setText(nval+" Pound Sterling = "+mval+" Indian Rupee");
						}
						else if(m==5)
						{
							mval=nval*131.21;
							maintext.setText(nval+" Pound Sterling = "+mval+" Japanese Yen");
						}
						else if(m==6)
						{
							mval=nval*0.37;
							maintext.setText(nval+" Pound Sterling = "+mval+" Kuwaiti Dinar");
						}
						else if(m==8)
						{
							mval=nval*79.13;
							maintext.setText(nval+" Pound Sterling = "+mval+" Russain Ruble");
						}
						else if(m==9)
						{
							mval=nval*1.22;
							maintext.setText(nval+" Pound Sterling = "+mval+" Swis Franc");
						}
						else 
						{
							mval=nval*1.22;
							maintext.setText(nval+" Pound Sterling = "+mval+" USD");
						}
						break;
				case 8: if(m==8)
						maintext.setText("\nNo need to convert");
						else if(m==1)
						{
							mval=nval*0.021;
							maintext.setText(nval+" Russain Ruble = "+mval+" Canadian Dollar");
						
						}
						else if(m==2)
						{
							mval=nval*0.11;
							maintext.setText(nval+" Russain Ruble = "+mval+" Chinese Yuan");
						}
						else if(m==3)
						{
							mval=nval*0.014;
							maintext.setText(nval+" Russain Ruble = "+mval+" European Euro");
						}
						else if(m==4)
						{
							mval=nval*1.10;
							maintext.setText(nval+" Russain Ruble = "+mval+" Indian Rupee");
						}
						else if(m==5)
						{
							mval=nval*1.66;
							maintext.setText(nval+" Russain Ruble = "+mval+" Japanese Yen");
						}
						else if(m==6)
						{
							mval=nval*0.0047;
							maintext.setText(nval+" Russain Ruble = "+mval+" Kuwaiti Dinar");
						}
						else if(m==7)
						{
							mval=nval*0.013;
							maintext.setText(nval+" Russain Ruble = "+mval+" Pound Sterling");
						}
						else if(m==9)
						{
							mval=nval*0.015;
							maintext.setText(nval+" Russain Ruble = "+mval+" Swis Franc");
						}
						else 
						{
							mval=nval*0.015;
							maintext.setText(nval+" Russain Ruble = "+mval+" USD");
						}
						break;
				case 9: if(m==9)
						maintext.setText("\nNo need to convert");
						else if(m==1)
						{
							mval=nval*1.33;
							maintext.setText(nval+" Swis Franc = "+mval+" Canadian Dollar");
						}
						else if(m==2)
						{
							mval=nval*7.13;
							maintext.setText(nval+" Swis Franc = "+mval+" Chinese Yuan");
						}
						else if(m==3)
						{
							mval=nval*0.91;
							maintext.setText(nval+" Swis Franc = "+mval+" European Euro");
						}
						else if(m==4)
						{
							mval=nval*71.11;
							maintext.setText(nval+" Swis Franc = "+mval+" Indian Rupee");
						}
						else if(m==5)
						{
							mval=nval*107.48;
							maintext.setText(nval+" Swis Franc = "+mval+" Japanese Yen");
						}
						else if(m==6)
						{
							mval=nval*0.30;
							maintext.setText(nval+" Swis Franc = "+mval+" Kuwaiti Dinar");
						}
						else if(m==7)
						{
							mval=nval*0.82;
							maintext.setText(nval+" Swis Franc = "+mval+" Pound Sterling");
						}
						else if(m==8)
						{
							mval=nval*64.84;
							maintext.setText(nval+" Swis Franc = "+mval+" Russain Ruble");
						}
						else 
						{
							mval=nval*1.00;
							maintext.setText(nval+" Swis Franc = "+mval+" USD");
						}
						break;
				case 10: if(m==10)
						maintext.setText("\nNo need to convert");
						else if(m==1)
						{
							mval=nval*1.33;
							maintext.setText(nval+" USD = "+mval+" Canadian Dollar");
						}
						else if(m==2)
						{
							mval=nval*7.13;
							maintext.setText(nval+" USD = "+mval+" Chinese Yuan");
						}
						else if(m==3)
						{
							mval=nval*0.91;
							maintext.setText(nval+" USD = "+mval+" European Euro");
						}
						else if(m==4)
						{
							
							mval=nval*71.11;
							maintext.setText(nval+" USD = "+mval+" Indian Rupee");
						}
						else if(m==5)
						{
							mval=nval*107.48;
							maintext.setText(nval+" USD = "+mval+" Japanese Yen");
						}
						else if(m==6)
						{
							mval=nval*0.30;
							maintext.setText(nval+" USD = "+mval+" Kuwaiti Dinar");
						}else if(m==7)
						{
							
							mval=nval*0.82;
							maintext.setText(nval+" USD = "+mval+" Pound Sterling");
						}
						else if(m==8)
						{
							mval=nval*64.84;
							maintext.setText(nval+" USD = "+mval+" Russain Ruble");
						}
						else
						{
							mval=nval*1.49;
							maintext.setText((nval)+" USD = "+mval+" Swis Franc");
						}
						break;
				 }
			 }
		 	else 
			 maintext.setText("No need to convert");
	 }
}
