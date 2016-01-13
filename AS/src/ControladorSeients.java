import java.util.ArrayList;

public interface ControladorSeients {
	public Seient get(String nomLocal, int fila, int columna);
	public Boolean exists(String nomLocal, int fila, int columna);
	public ArrayList<Seient> all ();
}
