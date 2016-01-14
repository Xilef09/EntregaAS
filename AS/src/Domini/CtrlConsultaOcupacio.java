package Domini;

import java.util.ArrayList;

import org.javatuples.*;

public class CtrlConsultaOcupacio {
	
	private FactoryControladors myFactory = FactoryControladors.getInstance();

	public ArrayList<Pair<Integer,Integer>> consultaOcupacio(String nomLocal, String sessio, Integer nombEspectadors) throws Exception{
		ControladorRepresentacio ctrConsultaRep = myFactory.getCtrRepresentacio();
		Representacio r = ctrConsultaRep.getRepresentacio(nomLocal, sessio);
		r.hiHaEspai(nombEspectadors);
		return r.consultaOcupacio("lliure");
	}
	
	public ArrayList<Septet<String,String,String,String,Integer,Boolean,Float>> totesRepresentacions(){
		return null; //TO DO 
	}
}
