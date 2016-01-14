package Presentacio;

import java.util.ArrayList;

import org.javatuples.Pair;

public class CompraEntradaController {

	private CompraEntradaUseCaseController compEntrCU;
	private CompraEntradaOfficialView comprEntrOV;
	private MostraRepresentacions mostraRepre;
	private MostraOcupacio mostraOcupa;
	
	public CompraEntradaController() {
		
	}
	
	void prObteEspectacles() {
		ArrayList<String> espectacles = compEntrCU.obteEspectacles();
		// Enviar para que se muestre por pantalla el array, en caso de que este vacio mostrar mensaje
		// de error correspondiete
	}
	
	void PrOkobteRepresentacions(String titulo, String data) {
		//Obtener representaciones 
		mostraRepre = new MostraRepresentacions(this);
		mostraRepre.mostra();
	}
	
	void PrObteOcupacio(String nomLocal, String sessio, Integer nombEspectadors) {
		//Obtener Ocupacio
		mostraOcupa = new MostraOcupacio(this);
		mostraOcupa.mostra();
	}
	
	void PrOkSeleccionarSeients(ArrayList<Pair<Integer, Integer>> myArray) {
		
	}
	
	void PrObtePreuMoneda(String moneda) {
		
	}
	
	void PrPagament(String dni, Integer codiB, String numCompte) {
		
	}
	
	void PrOkFinalitza() {
		
	}
	
	void PrCancela() {
		
	}

	public void inicializar() {
		System.out.println("Ventana 1");
		comprEntrOV = new CompraEntradaOfficialView(this); 
		comprEntrOV.mostra();
	}
	
}
