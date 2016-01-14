package Domini;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

import org.javatuples.*;



public class CtrlComprarEntrada {
	private String titol;
	private String date;
	private String nomLocal;
	private String sessio;
	private Integer nombEspectadors;
	private ArrayList<Pair<Integer,Integer>> seients;
	private Float preuTotal;
	
	private FactoryAdapters myFactoryAdapter = FactoryAdapters.getInstance();
	private FactoryControladors myFactory = FactoryControladors.getInstance();
	private FactoryCtrlCasDus myFactoryCU = FactoryCtrlCasDus.getInstance();
	private FactoryAdapters myFactoryAdap = FactoryAdapters.getInstance();
	private Showsdotcom myShowsdotCom = Showsdotcom.getInstance();
	
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
		CtrlConsultaOcupacio co = myFactoryCU.getCtrlConsultaOcupacio();
		ArrayList<Pair<Integer,Integer>> result = co.consultaOcupacio(nomLocal, sessio, nombEspectadors);
		this.nomLocal=nomLocal;
		this.sessio = sessio;
		this.nombEspectadors= nombEspectadors;
		return result;
	}
	public Pair<Float,Pair<String,String>> seleccionarSeients (ArrayList<Pair<Integer, Integer>> seients)throws Exception{
		int numSeients = seients.size();
		ControladorRepresentacio cr = myFactory.getCtrlRepresentacio();
		Representacio representacio = cr.getRepresentacio(nomLocal, sessio);
		Float preu = representacio.getPreu();
		Integer recarrec = representacio.getRecarrec();
		Float comissio = myShowsdotCom.getComisio();
		Pair<String,String> canvis = myShowsdotCom.getCanvis();
		Float pfinal = numSeients*(preu+recarrec+comissio);
		this.seients= seients;
		this.preuTotal = pfinal;
		return Pair.with(pfinal, canvis);
	}
	
	public float obtePreuMoneda(String moneda) throws Exception{
		ConversorAdapter ca = myFactoryAdapter.getConversorAdapter();
		String divisa = myShowsdotCom.getMoneda();
		float c = ca.obteConversionRate(divisa, moneda);
		return this.preuTotal*c;
	}
	public void pagament (String dni, Integer codiB, String numCompte) throws Exception{
		iBankAdapter myBankAdapter = myFactoryAdap.getBankAdapter();
		Integer codiBancShows = myShowsdotCom.getCodiBancShows();
		String numCompteShows = myShowsdotCom.getNumCompteShows();
		String dataActual = Integer.toString(Calendar.DATE) + "/"+ Integer.toString(Calendar.MONTH)+1 + "/"+ Integer.toString(Calendar.YEAR);
		Boolean b = myBankAdapter.autoritza(dni, codiBancShows, numCompteShows, codiB, numCompte, dataActual);
		if (!b) throw new Exception("pagament no autoritzat MOROSO!!!!");
		ControladorEntrada ce = myFactory.getCtrlEntrada();
		Boolean existeixID = true;
		Random ran = new Random();
		String id= Integer.toString(ran.nextInt(10000));
		while(existeixID){
			id = Integer.toString(ran.nextInt(10000));
			existeixID = ce.existeixEntrada(id);
		}
		Integer nSeients = seients.size();
		Entrada e = new Entrada(id,dni,nSeients,dataActual,preuTotal);
		
		//pre fer
		
		
	}
	public ArrayList<String> obteEspectacles() throws Exception{
		CtrlConsultaRepresentacions cr = myFactoryCU.getCtrlConsultaRepresentacions();
		return cr.consultaEspectacles();
	}
	
	

}
