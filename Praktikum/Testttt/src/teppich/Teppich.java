package teppich;

public class Teppich {

	private float artikelnummer;
	private String kategorie;
	private double breite;
	private double laenge;
	private String [] farben;
	
	

	public float getArtikelnummer() {
		return artikelnummer;
	}

	public void setArtikelnummer(float artikelnummer) {
		this.artikelnummer = artikelnummer;
	}

	public String getKategorie() {
		return kategorie;
	}

	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public String[] getFarben() {
		return farben;
	}

	public void setFarben(String[] farben) {
		this.farben = farben;
	}

	public String gibTeppichZurueck(char trenner){
  		return this.getArtikelnummer() + trenner 
  			+ this.getKategorie() + trenner
  		    + this.getBreite() + trenner
  		    + this.getLaenge() + trenner
  		    + this.getFarbenAlsString(trenner) + "\n";
  	
	}
	
	public String getFarbenAlsString(char trenner) {
		String ergebnis = "";
		int i = 0;
		for(i = 0; i < this.getFarben().length - 1; i++) {
			ergebnis = ergebnis + this.getFarben()[i] + trenner; 
		}
		return ergebnis	+ this.getFarben()[i];
	}

	public Teppich(float artikelnummer, String kategorie, double breite, double laenge, String[] farben) {
		super();
		this.artikelnummer = artikelnummer;
		this.kategorie = kategorie;
		this.breite = breite;
		this.laenge = laenge;
		this.farben = farben;
	}

	
}
