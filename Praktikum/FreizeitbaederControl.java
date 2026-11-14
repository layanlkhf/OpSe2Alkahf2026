package mvc2.gui;

import javafx.stage.Stage;
import mvc2.business.Freizeitbad;
import mvc2.business.FreizeitbaederModel;
import mvc2.ownUtil.PlausiException;

public class FreizeitbaederControl {
	
	private FreizeitbaederView freizeitbaederView;
	private FreizeitbaederModel freizeitbaederModel;
	
	public FreizeitbaederControl(Stage primaryStage) {
		
		//moddel zu erst
		this.freizeitbaederModel = new FreizeitbaederModel();
		this.freizeitbaederView = new FreizeitbaederView(this,primaryStage,freizeitbaederModel);
		
	}
	
	
	 public void nehmeFreizeitbadAuf(){
	    	try{
	    		//
	    		//wir sindd in control rufen model, weil sei die sepicher ist und rufen ddie methodde setfreizeitbaddd von dddder Klasse
	    		//Freizeitbadd
	    		//
	    		freizeitbaederModel.setFreizeitbad(new Freizeitbad(
	    				//
	    				//zu jeder attribute den attribute  "freizeitbaederView" getvor jedem einsetzten undd das erste T gross schrieben 
	    				//das sind die getters undd setterrs in unserr view klasse
	    			freizeitbaederView.getTxtName().getText(), 
	    			freizeitbaederView.getTxtGeoeffnetVon().getText(),
	    			freizeitbaederView.getTxtGeoeffnetBis().getText(),
	    			freizeitbaederView.getTxtBeckenlaenge().getText(),
	    			freizeitbaederView.getTxtWassTemperatur().getText()));
	    		//
	    		//selbe hier  nur das Attribute "freizeitbaederView" rufen
	    		//
	    		freizeitbaederView.zeigeInformationsfensterAn("Das Freizeitbad wurde aufgenommen!");
	       	}
	       	catch(PlausiException exc){
	       		freizeitbaederView.zeigeFehlermeldungsfensterAn(exc.getPlausiTyp() + "er ", exc.getMessage());
	     	}
	    }

}
