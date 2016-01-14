package Domini;
import Persistencia.*;

public class ControladorEntrada {
	private CtrlDataFactory ctrlDataFactory;

	public ControladorEntrada() {
		// TODO Auto-generated constructor stub
		ctrlDataFactory = CtrlDataFactory.getInstance();
	}
	
	public Boolean existeixEntrada(String ID) throws Exception{
		Persistencia.ControladorEntrada ctrEntrada = ctrlDataFactory.getControladorEntrada();
		return ctrEntrada.exists(ID);
	}

}
