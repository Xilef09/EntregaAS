package Persistencia;
import java.util.ArrayList;

import Domini.Seient;

public interface ControladorSeients {
	public Seient get(String nomLocal, int fila, int columna);
	public Boolean exists(String nomLocal, int fila, int columna);
	public ArrayList<Seient> all ();
}
