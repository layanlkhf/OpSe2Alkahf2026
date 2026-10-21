package bahnhof;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import bahnhof.Bahnhof;
import bahnhof.BahnhofControl;
import bahnhof.BahnhofView;
import bahnhof.Bahnhof;

public class BahnhofModel {

	private BahnhofView bahnhofView;
	private BahnhofControl bahnhofControl;
	
	// speichert temporaer ein Objekt vom Typ Buergeramt
    private Bahnhof bahnhof;

	

	public BahnhofView getBahnhofView() {
		return bahnhofView;
	}

	public void setBahnhofView(BahnhofView bahnhofView) {
		this.bahnhofView = bahnhofView;
	}

	public BahnhofControl getBahnhofControl() {
		return bahnhofControl;
	}

	public void setBahnhofControl(BahnhofControl bahnhofControl) {
		this.bahnhofControl = bahnhofControl;
	}

	public Bahnhof getBahnhof() {
		return bahnhof;
	}

	public void setBahnhof(Bahnhof bahnhof) {
		this.bahnhof = bahnhof;
	}
	
	public void schreibeBahnhofInCsvDatei() throws Exception{
		
			BufferedWriter aus 
				= new BufferedWriter(new FileWriter("Bahnhof.csv", true));
			aus.write(bahnhof.gibBahnhofZurueck(';'));
			aus.close();
   			
		}	

	public void leseAusDatei(String typ) throws Exception{
    	
      			BufferedReader ein = new BufferedReader(new FileReader("Bahnhof.csv"));
      			String[] zeile = ein.readLine().split(";");
      			this.bahnhof = new Bahnhof(zeile[0], 
      				zeile[1], 
      				Integer.parseInt(zeile[2]), 
      				Integer.parseInt(zeile[3]), 
      				zeile[4].split("_"));
      				ein.close();
      	  			
      		}
       		
	
	
    
}
