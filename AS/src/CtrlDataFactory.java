import Persistencia.ControladorEspectacle;
import Persistencia.ControladorEspectacleDB;
import Persistencia.ControladorEstrena;
import Persistencia.ControladorEstrenaDB;
import Persistencia.ControladorLocal;
import Persistencia.ControladorLocalDB;
import Persistencia.ControladorSeientsEnRepresentacio;
import Persistencia.ControladorSeientsEnRepresentacioDB;
import Persistencia.ControladorSessio;
import Persistencia.ControladorSessioDB;


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
	public ControladorRepresentacio getControladorRepresentacio(){
		return controladorRepresentacio;
	}
	public ControladorEspectacle getControladorEspectacle(){
		return controladorEspectacle;
	}
	public ControladorSessio getControladorSessio(){
		return controladorSessio;
	}
	public ControladorSeients getControladorSeients(){
		return controladorSeients;
	}
	public ControladorSeientsEnRepresentacio getControladorSeientsEnRepresentacio(){
		return controladorSeientsEnRepresentacio;
	}
	public ControladorLocal getControladorLocal(){
		return controladorLocal;
	}
	public ControladorEstrena getControladorEstrena(){
		return controladorEstrena;
	}
	public ControladorEntrada getControladorEntrada(){
		return controladorEntrada;
	}
	
}
