import java.util.ArrayList;

public interface ControladorSeientsEnRepresentacio {
	public SeientEnRepresentacio get(String nomSessio, String nomLocal,String nomLocalSeient,
										int fila, int columna, String identificador);
	public Boolean exists(String nomSessio, String nomLocal,String nomLocalSeient,
			int fila, int columna, String identificador);
	public ArrayList<SeientEnRepresentacio> all ();
}
