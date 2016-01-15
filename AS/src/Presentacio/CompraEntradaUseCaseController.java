package Presentacio;

import java.util.ArrayList;

import org.javatuples.Pair;
import org.javatuples.Quintet;

import Domini.ControladorEspectacle;
import Domini.CtrlComprarEntrada;
import Domini.CtrlConsultaOcupacio;
import Domini.CtrlConsultaRepresentacions;
import Domini.Espectacle;
import Domini.FactoryControladors;
import Domini.FactoryCtrlCasDus;

public class CompraEntradaUseCaseController {
	
	private String titol;
	private String data;
	private String nomLocal;
	private String sessio;
	private ArrayList<Pair<Integer, Integer>> seients;
	private Float preuTotal;
	
	
	public ArrayList<Quintet<String, String, Integer, Boolean, Float>> ObteRepresentacions (String titol, String data) throws Exception {
		System.out.println("t->"+titol+"   dat->"+data);

		FactoryControladors myFactoryControlador = Domini.FactoryControladors.getInstance();

		CtrlConsultaRepresentacions ctrRep = myFactoryControlador.getCtrlConsultaRepresentacions();

		return ctrRep.consultaRepresentacions(titol,data);
	}
	
	public ArrayList<Pair<Integer, Integer>> obteOcupacio(String nomLocal, String sessio, Integer nombreEsppectadors) throws Exception {
		System.out.println("1");
		FactoryControladors myFactoryControlador = Domini.FactoryControladors.getInstance();
		System.out.println("2");

	    CtrlConsultaOcupacio ctrConsOcup = myFactoryControlador.getCtrlConsultaOcupacio();
		System.out.println("3");

	    return ctrConsOcup.consultaOcupacio(nomLocal, sessio, nombreEsppectadors);
	}
	
	public Pair<Float, Pair<String, String>> seleccionaSeients(ArrayList<Pair<Integer, Integer>> seients) throws Exception{
		FactoryCtrlCasDus myFactoryControladorCU = Domini.FactoryCtrlCasDus.getInstance();
	    CtrlComprarEntrada ctrCU = myFactoryControladorCU.getCtrlComprarEntrada();
	    return ctrCU.seleccionarSeients(seients);
	}
	
	public Float obtePreuMoneda(String moneda) throws Exception {
		FactoryCtrlCasDus myFactoryControladorCU = Domini.FactoryCtrlCasDus.getInstance();
	    CtrlComprarEntrada ctrCU = myFactoryControladorCU.getCtrlComprarEntrada();
	    return ctrCU.obtePreuMoneda(moneda);
	}
	
	public void pagament (String dni, Integer codiB, String numCompte) throws Exception {
		FactoryCtrlCasDus myFactoryControladorCU = Domini.FactoryCtrlCasDus.getInstance();
	    CtrlComprarEntrada ctrCU = myFactoryControladorCU.getCtrlComprarEntrada();
	    ctrCU.pagament(dni, codiB, numCompte);
	}
	
	public ArrayList<String> obteEspectacles() {
		FactoryControladors myFactoryControlador = Domini.FactoryControladors.getInstance();
		ControladorEspectacle ctrEspec = myFactoryControlador.getCtrlEspectacle();
		ArrayList<Espectacle> le = ctrEspec.getAll();
		ArrayList<String> res = new ArrayList<String>();
		for (Espectacle e:le) {
			res.add(e.getTitol());
		}
		return res;
	}

}
