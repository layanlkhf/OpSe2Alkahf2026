
package business;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BahnhofModel {
	private Bahnhof bahnhof;

	public Bahnhof getBahnhof() {
		return bahnhof;
	}

	public void setBahnhof(Bahnhof bahnhof) {
		this.bahnhof = bahnhof;
	}
	
	public void leseAusDatei(String typ) throws Exception{
      			BufferedReader ein = new BufferedReader(new FileReader("Bahnhof.csv"));
      			String[] zeile = ein.readLine().split(";");
      			this.bahnhof = new Bahnhof(
      					zeile[0], 
      					zeile[1], 
      					zeile[2], 
      					zeile[3],
      					zeile[4].split("_"));
      			ein.close();
		
	}
	
	public void schreibeBahnhofInCsvDatei() throws Exception{
			BufferedWriter aus 
				= new BufferedWriter(new FileWriter("BahnhofAusgabe.csv", true));
			aus.write(bahnhof.gibBahnhofZurueck(';'));
			aus.close();
	}
}
