package Persistencia;
import java.util.ArrayList;

import Domini.Sessio;

public interface ControladorSessio {
	
	public Sessio get(String sessio) throws Exception;
	
	public Boolean exists(String sessio) throws Exception;
	
	public ArrayList<Sessio> all()throws Exception;
	
}
