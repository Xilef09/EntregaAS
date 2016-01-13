
public class CtrlDataFactory {
	private static CtrlDataFactory instance= null;
	private ControladorRepresentacioDB controladorRepresentacio = new ControladorRepresentacioDB();
	private ControladorEspectacleDB controladorEspectacle = new ControladorEspectacleDB();
	private ControladorSessioDB controladorSessio = new ControladorSessioDB();
	private ControladorSeientsDB controladorSeients = new ControladorSeientsDB();
	private ControladorSeientsEnRepresentacioDB controladorSeientsEnRepresentacio = new ControladorSeientsEnRepresentacioDB();
	private ControladorLocalDB controladorLocal = new ControladorLocalDB();
	private ControladorEstrenaDB controladorEstrena = new ControladorEstrenaDB();
	private ControladorEntradaDB controladorEntrada = new ControladorEntradaDB();
	protected CtrlDataFactory(){
	}
	
	public static CtrlDataFactory getInstance(){
		if(instance == null) {
	         instance = new CtrlDataFactory();
	      }
		return instance;
	}
	
}
