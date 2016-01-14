package Domini;
import Persistencia.*;

import java.util.ArrayList;

public class ControladorEspectacle {
	private CtrlDataFactory ctrlDataFactory;
	private ArrayList<Espectacle> esp = new ArrayList();

	public ControladorEspectacle() {
		// TODO Auto-generated constructor stub
		ctrlDataFactory = CtrlDataFactory.getInstance();
		esp = ctrlDataFactory.getControladorEspectacle().all();
		setRepresentacionsintoEspectacle();
		
	}

	public Espectacle getEspectacle(String nom) throws Exception{
		Persistencia.ControladorEspectacle ctrEspectacle = ctrlDataFactory.getControladorEspectacle();
		return ctrEspectacle.get(nom);
	}
	
	public ArrayList<Espectacle> getAll(){
		Persistencia.ControladorEspectacle ctrEspectacle = ctrlDataFactory.getControladorEspectacle();
		return ctrEspectacle.all();
	}
	
	public void setRepresentacionsintoEspectacle() {
		try {
			ArrayList <Representacio> myRepresentacions = ctrlDataFactory.getControladorRepresentacio().all();
			//ArrayList <Espectacle> myEspectacles = ctrlDataFactory.getControladorEspectacle().all();
			
			for (int i=0; i<esp.size(); ++i) {
				ArrayList<Representacio> repreEsp = new ArrayList<>();
				for (int j=0; j<myRepresentacions.size(); ++j) {
					if (myRepresentacions.get(j).getTitolEspectacle().equals(esp.get(i).getTitol())) {
						repreEsp.add(myRepresentacions.get(j));
					}
				}
				esp.get(i).setRepresentacions(repreEsp);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}