import java.util.ArrayList;

public interface ControladorEstrena {
	public Estrena get(String nomSessio, String nomLocal);
	public Boolean exists(String nomSessio, String nomLocal);
	public ArrayList<Estrena> all ();
}
