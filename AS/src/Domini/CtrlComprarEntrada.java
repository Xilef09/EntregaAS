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
	
	private FactoryControladors myFactory = FactoryControladors.getInstance();
	private FactoryCtrlCasDus myfactoryCU = FactoryCtrlCasDus.getInstance();
	
	public ArrayList<Quintet<String,String,Integer,Boolean,Float>> obteRepresentacions(String titol, String date) throws Exception{
		CtrlConsultaRepresentacions ctrConsultaRep = myFactory.getCtrlConsultaRepresentacions();
		ArrayList<Quintet<String,String,Integer,Boolean,Float>> ll = ctrConsultaRep.consultaRepresentacions(titol,date);
		if (ll==null || ll.isEmpty())
			throw new Exception ("Error: noHiHaRepresentacions\n");
		this.titol=titol;
		this.date=date;
		return ll;
	}
	public ArrayList<Pair<Integer,Integer>> obteOcupacio(String nomLocal, String sessio, Integer nombEspectadors) throws Exception{
		CtrlConsultaOcupacio co = myfactoryCU.getCtrlConsultaOcupacio();
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
