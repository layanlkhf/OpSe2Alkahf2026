package uebung1;

import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		ArtikelModel artikelModel = new ArtikelModel();
		try {
			artikelModel.leseArtikelAusCsvDatei();
			artikelModel.schreibeArtikelInTxtDatei();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}