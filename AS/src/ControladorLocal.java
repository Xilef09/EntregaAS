import java.util.ArrayList;

public interface ControladorLocal {
	public Local get(String nomLocal);
	public Boolean exists(String nomLocal);
	public ArrayList<Local> all ();
}
