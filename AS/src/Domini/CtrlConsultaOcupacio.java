package Domini;

import java.util.ArrayList;

import org.javatuples.*;

public class CtrlConsultaOcupacio {
	private FactoryControladors myFactory;
	
	public ArrayList<Pair<Integer,Integer>> consultaOcupacio(String nomLocal, String sessio, Integer nombEspectadors) throws Exception{
		myFactory = FactoryControladors.getInstance();
		System.out.println("3.1");
		ControladorRepresentacio ctrConsultaRep = myFactory.getCtrlRepresentacio();
		System.out.println("3.2");

		Representacio r = ctrConsultaRep.getRepresentacio(nomLocal, sessio);
		System.out.println("3.3");

		//r.hiHaEspai(nombEspectadors);
		System.out.println("3.4");
		return r.consultaOcupacio("lliure");
	}
	public ArrayList<Septet<String,String,String,String,Integer,Boolean,Float>> totesRepresentacions() throws Exception{
		myFactory = FactoryControladors.getInstance();
		ControladorRepresentacio cr = myFactory.getCtrlRepresentacio();
		ArrayList<Representacio> representacions = cr.getAll();
		if(representacions.isEmpty()) throw new Exception ("No hi ha Representacions");
		ArrayList<Septet<String,String,String, String, Integer, Boolean, Float>> ll = new ArrayList<>();
		for(int i =0; i<representacions.size();++i){
			Quintet<String, String, Integer, Boolean, Float> qaux= representacions.get(i).obteDades();
			Pair<String, String> paux = representacions.get(i).obteMesDades();
			Septet<String,String,String, String, Integer, Boolean, Float> saux= Septet.with(paux.getValue0(),paux.getValue1(),qaux.getValue0(),qaux.getValue1(), qaux.getValue2(),qaux.getValue3(),qaux.getValue4());
			ll.add(saux);
		}
		return ll;

	}
}
