package Persistencia;
import java.util.ArrayList;
import Domini.Entrada;

public interface ControladorEntrada {
	
	public Entrada get(String identificador) throws Exception;
	
	public Boolean exists(String identificador) throws Exception;
	
	public ArrayList<Entrada> all()throws Exception;
	
	public void set(Entrada x)throws Exception;
}
