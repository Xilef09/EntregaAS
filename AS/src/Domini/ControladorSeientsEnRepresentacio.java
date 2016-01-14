package Domini;

import Persistencia.*;
import Persistencia.CtrlDataFactory;

public class ControladorSeientsEnRepresentacio {

	private CtrlDataFactory ctrlDataFactory;

	public ControladorSeientsEnRepresentacio() {
		ctrlDataFactory = CtrlDataFactory.getInstance();
	}

	public SeientEnRepresentacio getSeientEnRepresentacio(String nomSessio, String nomLocal,String nomLocalSeient, int fila, int columna, String identificador) throws Exception{
		Persistencia.ControladorSeientsEnRepresentacio ctrSeientEnRep = ctrlDataFactory.getControladorSeientsEnRepresentacio();
		return ctrSeientEnRep.get(nomSessio, nomLocal, nomLocalSeient, fila, columna, identificador);
	}
}
