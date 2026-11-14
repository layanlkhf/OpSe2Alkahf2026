package teppich;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import teppich.Teppich;
import teppich.TeppichControl;

public class TeppichModel {

	
	// speichert temporaer ein Objekt vom Typ Buergeramt
    private Teppich teppich;
    private TeppichControl teppichControl;

	public Teppich getTeppich() {
		return teppich;
	}

	public void setTeppich(Teppich teppich) {
		this.teppich = teppich;
	}
    
	public void leseAusDatei(String typ) throws Exception{
    	
      			BufferedReader ein = new BufferedReader(new FileReader("Teppich.csv"));
      			String[] zeile = ein.readLine().split(";");
      			this.teppich = new Teppich( 
      				Float.parseFloat(zeile[0]), 
      				zeile[1], 
      				Integer.parseInt(zeile[2]),
      				Integer.parseInt(zeile[3]),
      				zeile[4].split("_"));
      				ein.close();
      	  			
       		
	}
	
	public void schreibeTeppichInCsvDatei() throws Exception {
		
			BufferedWriter aus 
				= new BufferedWriter(new FileWriter("Teppich.csv", true));
			aus.write(teppich.gibTeppichZurueck(';'));
			aus.close();
   			
		}
	}
    

