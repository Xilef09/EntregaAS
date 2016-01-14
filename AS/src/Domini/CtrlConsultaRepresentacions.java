package Domini;

import java.util.ArrayList;

import org.javatuples.*;

public class CtrlConsultaRepresentacions {
	private FactoryControladors myFactory = FactoryControladors.getInstance();
	
	
	public ArrayList<String> consultaEspectacles() throws Exception{
		ControladorEspectacle ce = myFactory.getCtrEspectacle();
		ArrayList<Espectacle> es = ce.getAll();
		if(es.size()==0) throw new Exception("No hi ha espectacles");
		ArrayList<String> result = new ArrayList<>();
		for(int i=0;i<es.size();++i){
			result.add(es.get(i).getTitol());
		}
		return result;
	}
	
	public ArrayList <Quintet<String, String, Integer, Boolean, Float>> consultaRepresentacions(String titol, String date){
		ControladorEspectacle ce = myFactory.getCtrEspectacle();
		Espectacle espectacle = ce.getEspectacle(titol);
		return espectacle.consultaRepresentacions(date);
	}
	


}
