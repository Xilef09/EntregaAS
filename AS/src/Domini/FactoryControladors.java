package Domini;

public class FactoryControladors {

	private static FactoryControladors instance = null;
	
	private ControladorRepresentacio ctrRepresentacio = new ControladorRepresentacio();
	private ControladorEspectacle ctrEspectacle = new ControladorEspectacle();
	private ControladorEntrada ctrEntrada = new ControladorEntrada();
	private ControladorSeientsEnRepresentacio ctrSeientsEnRepresentacio = new ControladorSeientsEnRepresentacio();
	private CtrlConsultaOcupacio ctrlConsultaOcupacio = new CtrlConsultaOcupacio();
	private CtrlConsultaRepresentacions ctrlConsultaRepresentacions = new CtrlConsultaRepresentacions();

	protected FactoryControladors() {}

	public static FactoryControladors getInstance() {
        if (instance == null) {
            instance = new FactoryControladors();
        }
        return instance;
    }

	public ControladorRepresentacio getCtrRepresentacio() {
		return ctrRepresentacio;
	}

	public ControladorEspectacle getCtrEspectacle() {
		return ctrEspectacle;
	}

	public ControladorEntrada getCtrEntrada() {
		return ctrEntrada;
	}

	public CtrlConsultaRepresentacions getCtrlConsultaRepresentacions() {
		return ctrlConsultaRepresentacions;
	}

	public ControladorSeientsEnRepresentacio getCtrSeientsEnRepresentacio() {
		return ctrSeientsEnRepresentacio;
	}

	public CtrlConsultaOcupacio getCtrlConsultaOcupacio() {
		return ctrlConsultaOcupacio;
	}	
}
