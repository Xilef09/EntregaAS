package Domini;

import org.javatuples.Pair;

public class Showsdotcom {
	private static Showsdotcom instance= null;
	private Integer codiBanc;
	private String numeroCompte;
	private Float comissio;
	private String moneda; //eur usd gbp
	private Pair<String,String> canvis;
	
	private Showsdotcom(){
	}
	
	public static Showsdotcom getInstance(){
		if(instance == null) {
	         instance = new Showsdotcom();
	      }
		return instance;
	}

	public Float getComisio() {
		return comissio;
	}
	public Pair<String,String> getCanvis(){
		return canvis;
	}

	public Integer getCodiBancShows() {
		return codiBanc;
	}

	public String getNumCompteShows() {
		return numeroCompte;
	}
	
}
