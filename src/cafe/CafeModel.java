package cafe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import cafe.Cafe;
import cafe.CafeView;

public class CafeModel {

	private Cafe cafe;
	private CafeView cafeView;

	public Cafe getCafe() {
		return cafe;
	}

	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}
	
    public void leseAusDatei(String typ) throws Exception{
      		
      			BufferedReader ein = new BufferedReader(new FileReader("Cafe.csv"));
      			
      			String[] zeile = ein.readLine().split(";");
      			
      			
      			this.cafe = new Cafe(zeile[0], 
      				zeile[1], 
      				zeile[2], 
      				Boolean.parseBoolean(zeile[3]),
      				zeile[4].split("_"));
      				
      	  			
      		
   
		ein.close();
		}
		
	
    
    
	public void schreibeCafeInCsvDatei() throws Exception{
		
			BufferedWriter aus 
				= new BufferedWriter(new FileWriter("Cafe.csv", true));
			aus.write(cafe.gibCafeZurueck(';'));
			aus.close();
   			
		}
	}
    
    
    
    
