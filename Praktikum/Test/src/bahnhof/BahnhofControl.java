package bahnhof;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import bahnhof.Bahnhof;
import bahnhof.BahnhofModel;
import bahnhof.BahnhofView;
import javafx.stage.Stage;
import bahnhof.Bahnhof;

public class BahnhofControl {

	private BahnhofView bahnhofView;
	private BahnhofModel bahnhofModel;
	private Bahnhof bahnhof;

	public BahnhofControl(Stage primaryStage) {
		
		this.bahnhofModel = new BahnhofModel();
		this.bahnhofView = new BahnhofView(primaryStage, this, this.bahnhofModel);
	}


	public void nehmeBahnhofAuf(){
    	try{
    		bahnhofModel.setBahnhof(new Bahnhof(
    			bahnhofView.getTxtName().getText(), 
   	            bahnhofView.getTxtOrt().getText(),
   	            Integer.parseInt(bahnhofView.getTxtAnzGleisen().getText()),
    		    Integer.parseInt(bahnhofView.getTxtLetzteRenovierung().getText()),
    		    bahnhofView.getTxtZugarten().getText().split(";")));
    			bahnhofView.zeigeInformationsfensterAn("Das Bahnhof wurde aufgenommen!");
       	}
       	catch(Exception exc){
       		bahnhofView.zeigeFehlermeldungsfensterAn(exc.getMessage());
     	}
	}
    
	public void schreibeBahnhofInCsvDatei() {
		try {
			bahnhofModel.schreibeBahnhofInCsvDatei();
   			bahnhofView.zeigeInformationsfensterAn(
	   			"Die Bürgerämter wurden gespeichert!");
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
    
	 public void leseAusDatei(String typ){
	    	try {
	      		if("csv".equals(typ)){
	      				bahnhofModel.leseAusDatei(typ);
	      	  			bahnhofView.zeigeInformationsfensterAn(
	      	  	   			"Die Bürgerämter wurden gelesen!");
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

    
    
}
