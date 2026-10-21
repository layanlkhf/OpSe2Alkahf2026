package bahnhof;

public class Bahnhof {
	
	// Name des Buergeramtes
    private String name;
    // Oeffnungszeiten
    private String ort;
    private int anzGleisen;
    // Strasse und Hausnummer des Buergeramtes
    private int letzteRenovierung;
    // Dienstleistungen des Buergeramtes
    private String[] zugarten;

    public Bahnhof(String name, String ort, int anzGleisen,
    	int letzteRenovierung, String[] zugarten){
   		this.name = name;
  	    this.ort = ort;
   	    this.anzGleisen = anzGleisen;
   	    this.letzteRenovierung = letzteRenovierung;
   	    this.zugarten = zugarten;
    }
    
	

	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getOrt() {
		return ort;
	}




	public void setOrt(String ort) {
		this.ort = ort;
	}




	public int getAnzGleisen() {
		return anzGleisen;
	}




	public void setAnzGleisen(int anzGleisen) {
		this.anzGleisen = anzGleisen;
	}




	public int getLetzteRenovierung() {
		return letzteRenovierung;
	}




	public void setLetzteRenovierung(int letzteRenovierung) {
		this.letzteRenovierung = letzteRenovierung;
	}




	public String[] getZugarten() {
		return zugarten;
	}




	public void setZugarten(String[] zugarten) {
		this.zugarten = zugarten;
	}




	public String getZugartenAlsString(char trenner) {
		String ergebnis = "";
		int i = 0;
		for(i = 0; i < this.getZugarten().length - 1; i++) {
			ergebnis = ergebnis + this.getZugarten()[i] + trenner; 
		}
		return ergebnis	+ this.getZugarten()[i];
	}
	
	public String gibBahnhofZurueck(char trenner){
  		return this.getName() + trenner 
  			+ this.getOrt() + trenner
  		    + this.getAnzGleisen() + trenner
  		    + this.getLetzteRenovierung() + trenner
  		    + getZugartenAlsString(trenner) + "\n";
  		    
  	}
}
