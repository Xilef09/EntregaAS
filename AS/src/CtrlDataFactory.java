
public class CtrlDataFactory {
	private static CtrlDataFactory instance= null;
	private ControladorRepresentacio controladorRepresentacio = new ControladorRepresentacio();
	private ControladorEspectacle controladorEspectacle = new ControladorEspectacle();
	private ControladorSessio controladorSessio = new ControladorSessio();
	private ControladorSeients controladorSeients = new ControladorSeients();
	private ControladorSeientsEnRepresentacio controladorSeientsEnRepresentacio = new ControladorSeientsEnRepresentacio();
	private ControladorLocal controladorLocal = new ControladorLocal();
	private ControladorEstrena controladorEstrena = new ControladorEstrena();
	private ControladorEntrada controladorEntrada = new ControladorEntrada();
	protected CtrlDataFactory(){
	}
	
	public static CtrlDataFactory getInstance(){
		if(instance == null) {
	         instance = new CtrlDataFactory();
	      }
		return instance;
	}
	
}
