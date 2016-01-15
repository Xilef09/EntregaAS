package Domini;

import java.util.ArrayList;

import org.javatuples.*;

public class CtrlConsultaRepresentacions {
	private FactoryControladors myFactory;
	
	
	public ArrayList<String> consultaEspectacles() throws Exception{
		myFactory = FactoryControladors.getInstance();
		ControladorEspectacle ce = myFactory.getCtrlEspectacle();
		ArrayList<Espectacle> es = ce.getAll();
		if(es.size()==0) throw new Exception("No hi ha espectacles");
		ArrayList<String> result = new ArrayList<>();
		for(int i=0;i<es.size();++i){
			result.add(es.get(i).getTitol());
		}
		return result;
	}
	
	public ArrayList <Quintet<String, String, Integer, Boolean, Float>> consultaRepresentacions(String titol, String date) throws Exception{
		System.out.println("t->"+titol+"   dattt->"+date);
		myFactory = FactoryControladors.getInstance();
		ControladorEspectacle ce = myFactory.getCtrlEspectacle();
		Espectacle espectacle = ce.getEspectacle(titol);
		System.out.println("jklfdskjladfsjk->"+espectacle.consultaRepresentacions(date)+"<----");
		return espectacle.consultaRepresentacions(date);
	}
	


}
