package Persistencia;
import Persistencia.ControladorEspectacle;
import Persistencia.ControladorEspectacleDB;
import Persistencia.ControladorLocal;
import Persistencia.ControladorLocalDB;
import Persistencia.ControladorSeientsEnRepresentacio;
import Persistencia.ControladorSeientsEnRepresentacioDB;
import Persistencia.ControladorSessio;
import Persistencia.ControladorSessioDB;


public class CtrlDataFactory {
	private static CtrlDataFactory instance= null;
	private ControladorRepresentacio controladorRepresentacio = new ControladorRepresentacioDB();
	private ControladorEspectacle controladorEspectacle = new ControladorEspectacleDB();
	private ControladorSessio controladorSessio = new ControladorSessioDB();
	private ControladorSeients controladorSeients = new ControladorSeientsDB();
	private ControladorSeientsEnRepresentacio controladorSeientsEnRepresentacio = new ControladorSeientsEnRepresentacioDB();
	private ControladorLocal controladorLocal = new ControladorLocalDB();
	private ControladorEstrena controladorEstrena = new ControladorEstrenaDB();
	private ControladorEntrada controladorEntrada = new ControladorEntradaDB();
	
	
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
