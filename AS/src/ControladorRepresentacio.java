import java.util.ArrayList;

import Domini.Representacio;

public interface ControladorRepresentacio {

	public Representacio get(String sessio, String nomLocal) throws Exception;
	
	public Boolean exists(String sessio, String nomLocal) throws Exception;
	
	public ArrayList<Representacio> all()throws Exception;
}
