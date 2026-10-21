package cafe;


import java.io.IOException;
import cafe.Cafe;
import javafx.stage.Stage;

public class CafeControl {

	private CafeModel cafeModel;
	private CafeView cafeView;
	
	
	
    public CafeControl(Stage primaryStage) {
	
		this.cafeModel = new CafeModel();
		this.cafeView = new CafeView(primaryStage, cafeModel, this);
	}


	public void nehmeCafeAuf(){
    	try{
    		cafeModel.setCafe(new Cafe(
    			cafeView.getTxtName().getText(),
    			cafeView.getTxtOrt().getText(), 
    			cafeView.getTxtBeschreibung().getText(),
   	            Boolean.parseBoolean(cafeView.getTxtMitBaeckerei().getText()),
    		    cafeView.getTxtKaffeProdukte().getText().split(";")));
    		cafeView.zeigeInformationsfensterAn("Das Cafe wurde aufgenommen!");
       	}
       	catch(Exception exc){
       		cafeView.zeigeFehlermeldungsfensterAn(exc.getMessage());
     	}
    }
    
    
	public void schreibeCafeInCsvDatei(){
		try {
			cafeModel.schreibeCafeInCsvDatei();
   			cafeView.zeigeInformationsfensterAn(
	   			"Die Cafes wurden gespeichert!");
		}	
		catch(IOException exc){
			cafeView.zeigeFehlermeldungsfensterAn(
				"IOException beim Speichern!");
		}
		catch(Exception exc){
			cafeView.zeigeFehlermeldungsfensterAn(
				"Unbekannter Fehler beim Speichern!");
		}
	}
	
    public void leseAusDatei(String typ){
    	try {
      		if("csv".equals(typ)){
      			
      			cafeModel.leseAusDatei(typ);
      			
      	  			cafeView.zeigeInformationsfensterAn(
      	  	   			"Die Cafes wurden gelesen!");
      		}
       		else{
	   			cafeView.zeigeInformationsfensterAn(
	   				"Noch nicht implementiert!");
	   		}
		}
		catch(IOException exc){
			exc.printStackTrace();
			cafeView.zeigeFehlermeldungsfensterAn(
				"IOException beim Lesen!");
		}
		catch(Exception exc){
			cafeView.zeigeFehlermeldungsfensterAn(
				"Unbekannter Fehler beim Lesen!");
		}
	
    }
}
