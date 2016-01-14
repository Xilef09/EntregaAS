package Domini;

public class FactoryControladors {

	private static FactoryControladors instance;
	
	private ControladorRepresentacio ctrlRepresentacio;
	private ControladorEspectacle ctrlEspectacle;
	private ControladorEntrada ctrlEntrada;
	private ControladorSeientsEnRepresentacio ctrlSeientsEnRepresentacio;
	private CtrlConsultaOcupacio ctrlConsultaOcupacio;
	private CtrlConsultaRepresentacions ctrlConsultaRepresentacions;

	private FactoryControladors() {
		ctrlRepresentacio = new ControladorRepresentacio();
		ctrlEspectacle = new ControladorEspectacle();
		ctrlEntrada = new ControladorEntrada();
		ctrlSeientsEnRepresentacio = new ControladorSeientsEnRepresentacio();
		ctrlConsultaOcupacio = new CtrlConsultaOcupacio();
		ctrlConsultaRepresentacions = new CtrlConsultaRepresentacions();

	}

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
