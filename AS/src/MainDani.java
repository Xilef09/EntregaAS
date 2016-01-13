import java.util.ArrayList;


public class MainDani {
	public static void main(String[] args) {
		ControladorEntradaDB aux = new ControladorEntradaDB();
		Entrada l = new Entrada();
		//aux.set(l);
		Entrada x = aux.get("a");
		System.out.println(aux.exist("a"));
	}
}
