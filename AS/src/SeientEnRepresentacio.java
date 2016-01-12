
public class SeientEnRepresentacio {
	
	public enum Estat {
	    ocupat, lliure
	}

	private Estat estat;
	
	public SeientEnRepresentacio(Estat estat) {
		this.estat=estat;
	}

	public Estat getEstat() {
		return estat;
	}

	public void setEstat(Estat estat) {
		this.estat = estat;
	}

}
