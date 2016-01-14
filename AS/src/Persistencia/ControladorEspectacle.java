package Persistencia;
import java.util.ArrayList;

import Domini.Espectacle;

public interface ControladorEspectacle {
	
	public Espectacle get(String titol) throws Exception;
	
	public Boolean exists(String titol) throws Exception;
	
	public ArrayList<Espectacle> all();
}
