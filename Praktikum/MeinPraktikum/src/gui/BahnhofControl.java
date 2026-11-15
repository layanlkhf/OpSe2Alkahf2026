package gui;

import java.io.IOException;


import business.Bahnhof;
import business.BahnhofModel;

import javafx.stage.Stage;
import javafx.stage.*;

public class BahnhofControl {
	
	private BahnhofView bahnhofView;
	private BahnhofModel bahnhofModel;
	
	public BahnhofControl(Stage primaryStage) {
		this.bahnhofModel = new BahnhofModel();
		this.bahnhofView = new BahnhofView(primaryStage, bahnhofModel, this);
	}
	
	public void nehmeBahnhofAuf(){
	   	try{
	   		bahnhofModel.setBahnhof(new Bahnhof(
	   			bahnhofView.getTxtName().getText(), 
	   			bahnhofView.getTxtOrt().getText(),
	  	        bahnhofView.getTxtAnzahlGleise().getText(),
	   		    bahnhofView.getTxtLetzteRenovierung().getText(),
	   		    bahnhofView.getTxtAnzahlGleise().getText().split(";"))
	   				);
	   		bahnhofView.zeigeInformationsfensterAn("Das Bahnhof wurde aufgenommen!");
	      	}
	      	catch(Exception exc){
	      		bahnhofView.zeigeFehlermeldungsfensterAn(exc.getMessage());
	    	}
	   }
	
	public void leseAusDatei(String typ){
    	try {
      		if("csv".equals(typ)){
      			bahnhofModel.leseAusDatei(typ);
      			bahnhofView.zeigeInformationsfensterAn(
      	  	   			"Die Bahnhöfe wurden gelesen!");
      		}
       		else{
       			bahnhofView.zeigeInformationsfensterAn(
	   				"Noch nicht implementiert!");
	   		}
		}
		catch(IOException exc){
			bahnhofView.zeigeFehlermeldungsfensterAn(
				"IOException beim Lesen!");
		}
		catch(Exception exc){
			bahnhofView.zeigeFehlermeldungsfensterAn(
				"Unbekannter Fehler beim Lesen!");
		}
	}
	
	public void schreibeBahnhofInCsvDatei() {
		try {
			bahnhofModel.schreibeBahnhofInCsvDatei();
			bahnhofView.zeigeInformationsfensterAn(
	   			"Die Bahnhöfe wurden gespeichert!");
		}	
		catch(IOException exc){
			bahnhofView.zeigeFehlermeldungsfensterAn(
				"IOException beim Speichern!");
		}
		catch(Exception exc){
			bahnhofView.zeigeFehlermeldungsfensterAn(
				"Unbekannter Fehler beim Speichern!");
		}
	}
}