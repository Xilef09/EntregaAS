package Domini;

public class FactoryControladors {

	private static FactoryControladors instance = new FactoryControladors();
	
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
		System.out.println("Primera creacion");

	}

	public static FactoryControladors getInstance() {
        if (instance == null) {
        	System.out.println("Singleton sucks");
        	instance = new FactoryControladors();
        }
        System.out.println("Singleton sucks2");
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
