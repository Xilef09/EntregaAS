package Persistencia;
import java.util.ArrayList;

import Domini.Local;

public interface ControladorLocal {
	public Local get(String nomLocal) throws Exception;
	public Boolean exists(String nomLocal);
	public ArrayList<Local> all ();
}
