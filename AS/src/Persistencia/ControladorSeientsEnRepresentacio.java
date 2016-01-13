package Persistencia;
import java.util.ArrayList;

import Domini.SeientEnRepresentacio;

public interface ControladorSeientsEnRepresentacio {
	public SeientEnRepresentacio get(String nomSessio, String nomLocal,String nomLocalSeient,
										int fila, int columna, String identificador) throws Exception;
	public Boolean exists(String nomSessio, String nomLocal,String nomLocalSeient,
			int fila, int columna, String identificador);
	public ArrayList<SeientEnRepresentacio> all ();
}
