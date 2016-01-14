package Domini;

import java.util.ArrayList;

import org.javatuples.*;



public class CtrlComprarEntrada {
	private String titol;
	private String date;
	private String nomLocal;
	private String sessio;
	private Integer nombEspectadors;
	private ArrayList<Pair<Integer,Integer>> seients;
	private Float preuTotal;
	private FactoryCtrlCasDus myfactory = FactoryCtrlCasDus.getInstance();
	
	public ArrayList<Quintet<String,String,Integer,Boolean,Float>> obteRepresentacions(String titol, String date){
		return null; //TO DO
	}
	public ArrayList<Pair<Integer,Integer>> obteOcupacio(String nomLocal, String sessio, Integer nombEspectadors){
		CtrlConsultaOcupacio co = myfactory.getCtrlConsultaOcupacio();
		ArrayList<Pair<Integer,Integer>> result = co.consultaOcupacio(nomLocal, sessio, nombEspectadors);
		this.nomLocal=nomLocal;
		this.sessio = sessio;
		this.nombEspectadors= nombEspectadors;
		return result;
	}
	public Pair<Float,ArrayList<String>> seleccionarSeients (ArrayList<Pair> seients){
		return null; //TO DO
	}
	public float obtePreuMoneda(String moneda){
		return (Float) null; //TO DO 
	}
	public void pagament (String dni, Integer codiB, String numCompte){
		//TO DO
	}
	public ArrayList<String> obteEspectacles() throws Exception{
		CtrlConsultaRepresentacions cr = myfactory.getCtrlConsultaRepresentacions();
		return cr.consultaEspectacles();
	}
	

}
