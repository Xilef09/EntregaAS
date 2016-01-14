package Presentacio;

import java.util.ArrayList;

import org.javatuples.Pair;
import org.javatuples.Quintet;

import Domini.ControladorEspectacle;
import Domini.FactoryControladors;

public class CompraEntradaController {

	private CompraEntradaUseCaseController compEntrCU;
	private CompraEntradaOfficialView comprEntrOV;
	private MostraRepresentacions mostraRepre;
	private MostraOcupacio mostraOcupa;
	
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
	
	void PrOkobteRepresentacions(String titulo, String data) throws Exception {
		ArrayList<Quintet<String, String, Integer, Boolean, Float>> lr = compEntrCU.ObteRepresentacions(titulo, data);
		
		ArrayList<String> informacio = new ArrayList<String>();
		
		for (Quintet<String, String, Integer, Boolean, Float> qr: lr) {
			String info = ""+qr.getValue0()+","+qr.getValue1()+","+qr.getValue2()+","+qr.getValue3()+","+qr.getValue4();
			informacio.add(info); //informacio te un string per cada representacio, es posa directament al box
		}
		
		//Obtener representaciones 
		mostraRepre = new MostraRepresentacions(this);
		mostraRepre.asignaRepresentacions(informacio);
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
	
}
