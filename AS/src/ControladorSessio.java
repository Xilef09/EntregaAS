import java.util.ArrayList;

public interface ControladorSessio {
	
	public Sessio get(String sessio) throws Exception;
	
	public Boolean exists(String sessio) throws Exception;
	
	public ArrayList<Sessio> all()throws Exception;
	
}
