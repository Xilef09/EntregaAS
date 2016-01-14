package Presentacio;

import java.util.ArrayList;

import org.javatuples.Pair;
import org.javatuples.Quintet;

public class CompraEntradaUseCaseController {
	
	private String titol;
	private String data;
	private String nomLocal;
	private String sessio;
	private ArrayList<Pair<Integer, Integer>> seients;
	private Float preuTotal;
	
	
	public ArrayList<Quintet<String, String, Integer, Boolean, Float>> 
		ObteRepresentacions (String titol, String data) {
		
	}
	
	public ArrayList<Pair<Integer, Integer>> obteOcupacio(String nomLocal, String sessio, 
			Integer nombreEsppectadors) {
		
		
	}
	
	public Pair<Float, Pair<String, String>> seleccionaSeients(ArrayList<Pair<Integer, Integer>> seients){
		
	}
	
	public Float obtePreuMoneda(String moneda) {
		
	}
	
	public void pagament (String dni, Integer codiB, String numCompte) {
		
	}
	
	public ArrayList<String> obteEspectacles() {
		
	}

}
