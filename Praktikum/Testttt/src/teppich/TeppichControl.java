package teppich;

import teppich.Teppich;


import java.io.IOException;

import javafx.stage.Stage;
import teppich.TeppichView;
import teppich.TeppichModel;

public class TeppichControl {

	private TeppichView teppichView;
	private Teppich teppich;
	private TeppichModel teppichModel;
	
	public TeppichControl(Stage primaryStage) {
		this.teppichModel = new TeppichModel();
		this.teppichView = new TeppichView(primaryStage, this, this.teppichModel);
	}
	
	public void nehmeTeppichAuf(){
    	try{
    		 teppichModel.setTeppich( new Teppich(
    			Float.parseFloat(teppichView.getTxtArtikelnummer().getText()),
    			teppichView.getTxtKategorie().getText(),
    			Double.parseDouble(teppichView.getTxtBreite().getText()),
    			Double.parseDouble(teppichView.getTxtLaenge().getText()),
    		    teppichView.getTxtFarben().getText().split(";")));
    		teppichView.zeigeInformationsfensterAn("Der Teppich wurde aufgenommen!");
       	}
       	catch(Exception exc){
       		teppichView.zeigeFehlermeldungsfensterAn(exc.getMessage());
     	}
    }
	
    
    public void leseAusDatei(String typ) {
    	try {
      		if("csv".equals(typ)){
      			teppichModel.leseAusDatei(typ);
      	  			teppichView.zeigeInformationsfensterAn(
      	  	   			"Die Teppiche wurden gelesen!");
      		}
       		else{
	   			teppichView.zeigeInformationsfensterAn(
	   				"Noch nicht implementiert!");
	   		}
		}
		catch(IOException exc){
			teppichView.zeigeFehlermeldungsfensterAn(
				"IOException beim Lesen!");
		}
    	catch(Exception exc){
    	    teppichView.zeigeFehlermeldungsfensterAn(
    	        exc.getClass().getSimpleName() + ": " + exc.getMessage()
    	    );
    	    exc.printStackTrace();
    	}
	}
    
    public void schreibeTeppichInCsvDatei() {
		try {
			teppichModel.schreibeTeppichInCsvDatei();
   			teppichView.zeigeInformationsfensterAn(
	   			"Die Teppiche wurden gespeichert!");
		}	
		catch(IOException exc){
			teppichView.zeigeFehlermeldungsfensterAn(
				"IOException beim Speichern!");
		}
		catch(Exception exc){
			teppichView.zeigeFehlermeldungsfensterAn(
				"Unbekannter Fehler beim Speichern!");
		}
	}
    
    
}
