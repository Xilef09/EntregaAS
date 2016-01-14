package Presentacio;

import java.util.ArrayList;

import org.javatuples.Pair;

import Domini.ControladorEspectacle;
import Domini.FactoryControladors;

public class CompraEntradaController {

	private CompraEntradaUseCaseController compEntrCU;
	private CompraEntradaOfficialView comprEntrOV;
	private MostraRepresentacions mostraRepre;
	private MostraOcupacio mostraOcupa;
	private ComprarEntrada comprarEntrada;
	private FinCompra finCompra;
	
	public CompraEntradaController() {
		compEntrCU = new CompraEntradaUseCaseController();
	}
	
	void prObteEspectacles() {
		ArrayList<String> espectacles = new ArrayList<String>(); 
		espectacles = compEntrCU.obteEspectacles();
		// Enviar para que se muestre por pantalla el array, en caso de que este vacio mostrar mensaje
		// de error correspondiete
		comprEntrOV = new CompraEntradaOfficialView(this);
		comprEntrOV.assignaEspectacles(espectacles);
		comprEntrOV.mostra();
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
		comprarEntrada = new ComprarEntrada(this);
		comprarEntrada.mostra();
	}
	
	void PrObtePreuMoneda(String moneda) {
		
	}
	
	void PrPagament(String dni, Integer codiB, String numCompte) {
		
	}
	
	void PrOkFinalitza() {
		finCompra = new FinCompra(this);
		finCompra.mostra();
	}
	
	void PrCancela() {
		
	}
	
}
