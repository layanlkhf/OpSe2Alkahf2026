package uebung1;

import java.io.*;

public class ArtikelModel {
	
	private Artikel[] artikel = new Artikel[100];
	private int anzahlArtikel;
	
	public int getAnzahlArtikel() {
		return anzahlArtikel;
	}

	public void setAnzahlArtikel(int anzahlArtikel) {
		this.anzahlArtikel = anzahlArtikel;
	}

	public void leseArtikelAusCsvDatei()
        throws IOException{
		BufferedReader ein = new BufferedReader(new FileReader("Artikel.csv"));
		this.setAnzahlArtikel(Integer.parseInt(ein.readLine().split(";")[0]));
		String[] zeile = null;
		for(int i = 0; i < this.getAnzahlArtikel(); i++) {
			zeile = ein.readLine().split(";");
			this.artikel[i] = new Artikel(
				Integer.parseInt(zeile[0]), zeile[1],
				Double.parseDouble(zeile[2]));
		}    
	    ein.close();
	}
	
	public void schreibeArtikelInTxtDatei()
	    throws IOException{
		BufferedWriter aus = new BufferedWriter(new FileWriter("Artikel.txt"));
		aus.write(this.getAnzahlArtikel() + "");
		aus.newLine();
		for(int i = 0; i < this.getAnzahlArtikel(); i++) {
			aus.write(this.artikel[i].getArtikelnummer() + "");
			aus.newLine();
			aus.write(this.artikel[i].getArtikelname());
			aus.newLine();
			aus.write(this.artikel[i].getBasispreis() + "");
			aus.newLine();
		}    
		aus.close();
	}

}