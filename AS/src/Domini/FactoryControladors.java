package Domini;

public class FactoryControladors {

	private static FactoryControladors instance = null;
	
	private ControladorRepresentacio ctrlRepresentacio = new ControladorRepresentacio();
	private ControladorEspectacle ctrlEspectacle = new ControladorEspectacle();
	private ControladorEntrada ctrlEntrada = new ControladorEntrada();
	private ControladorSeientsEnRepresentacio ctrlSeientsEnRepresentacio = new ControladorSeientsEnRepresentacio();
	private CtrlConsultaOcupacio ctrlConsultaOcupacio = new CtrlConsultaOcupacio();
	private CtrlConsultaRepresentacions ctrlConsultaRepresentacions = new CtrlConsultaRepresentacions();

	protected FactoryControladors() {}

	public static FactoryControladors getInstance() {
        if (instance == null) {
            instance = new FactoryControladors();
        }
        return instance;
    }

	public ControladorRepresentacio getCtrlRepresentacio() {
		return ctrlRepresentacio;
	}

	public ControladorEspectacle getCtrlEspectacle() {
		return ctrlEspectacle;
	}

	public ControladorEntrada getCtrlEntrada() {
		return ctrlEntrada;
	}

	public CtrlConsultaRepresentacions getCtrlConsultaRepresentacions() {
		return ctrlConsultaRepresentacions;
	}

	public ControladorSeientsEnRepresentacio getCtrlSeientsEnRepresentacio() {
		return ctrlSeientsEnRepresentacio;
	}

	public CtrlConsultaOcupacio getCtrlConsultaOcupacio() {
		return ctrlConsultaOcupacio;
	}	
}
