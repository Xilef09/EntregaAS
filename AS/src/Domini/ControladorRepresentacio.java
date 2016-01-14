package Domini;
import Persistencia.*;

import java.util.ArrayList;

public class ControladorRepresentacio {
	
	private CtrlDataFactory ctrlDataFactory;

	public ControladorRepresentacio() {
		ctrlDataFactory = CtrlDataFactory.getInstance();
	}

	public Representacio getRepresentacio(String nomLocal, String sessio) throws Exception{
		Persistencia.ControladorRepresentacio ctrRep = ctrlDataFactory.getControladorRepresentacio();
		return ctrRep.get(nomLocal, sessio);
	}
	
	public ArrayList<Representacio> getAll() throws Exception{
		Persistencia.ControladorRepresentacio ctrRep = ctrlDataFactory.getControladorRepresentacio();
		return ctrRep.all();
	}
}
