package Domini;
import Persistencia.*;

import java.util.ArrayList;

public class ControladorEspectacle {
	private CtrlDataFactory ctrlDataFactory;

	public ControladorEspectacle() {
		// TODO Auto-generated constructor stub
		ctrlDataFactory = CtrlDataFactory.getInstance();
	}

	public Espectacle getEspectacle(String nom) throws Exception{
		Persistencia.ControladorEspectacle ctrEspectacle = ctrlDataFactory.getControladorEspectacle();
		return ctrEspectacle.get(nom);
	}
	
	public ArrayList<Espectacle> getAll(){
		Persistencia.ControladorEspectacle ctrEspectacle = ctrlDataFactory.getControladorEspectacle();
		return ctrEspectacle.all();
	}
}