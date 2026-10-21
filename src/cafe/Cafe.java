package cafe;



public class Cafe {

	private String name;
	private String ort;
	private String beschreibung;
	private boolean mitBaeckerei;
	private String [] kaffeProdukte;
	
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

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public boolean isMitBaeckerei() {
		return mitBaeckerei;
	}

	public void setMitBaeckerei(boolean mitBaeckerei) {
		this.mitBaeckerei = mitBaeckerei;
	}

	public String[] getKaffeProdukte() {
		return kaffeProdukte;
	}

	public void setKaffeProdukte(String[] kaffeProdukte) {
		this.kaffeProdukte = kaffeProdukte;
	}

	public String gibCafeZurueck(char trenner){
  		return this.getName() + trenner 
  			+ this.getOrt() + trenner
  		    + this.getBeschreibung() + trenner
  		    + this.isMitBaeckerei() + trenner
  		    + this.getKaffeProdukteAlsString(trenner) + "\n";
  	
	}
	
	public String getKaffeProdukteAlsString(char trenner) {
		String ergebnis = "";
		int i = 0;
		for(i = 0; i < this.getKaffeProdukte().length - 1; i++) {
			ergebnis = ergebnis + this.getKaffeProdukte()[i] + trenner; 
		}
		return ergebnis	+ this.getKaffeProdukte()[i];
	}

	public Cafe(String name, String ort, String beschreibung, boolean mitBaeckerei, String[] kaffeProdukte) {
		super();
		this.name = name;
		this.ort = ort;
		this.beschreibung = beschreibung;
		this.mitBaeckerei = mitBaeckerei;
		this.kaffeProdukte = kaffeProdukte;
	}
	
	
}
