import java.util.ArrayList;

public interface ControladorEntrada {
	
	public Entrada get(String identificador) throws Exception;
	
	public Boolean exists(String identificador) throws Exception;
	
	public ArrayList<Entrada> all()throws Exception;
}
