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
	
	void PrOkobteRepresentacions(String titulo, String data) throws Exception {
		System.out.println("entro aqui biatch");
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
		ArrayList<String> info = new ArrayList<String>();
		ArrayList<Pair<Integer,Integer>> ocupacio = new ArrayList<Pair<Integer,Integer>>();
		try {
			 ocupacio = compEntrCU.obteOcupacio(nomLocal, sessio, nombEspectadors); 
		}
		catch (Exception e) {
			
		}
		for(int i = 0; i < ocupacio.size(); ++i) {
			String auxs = ocupacio.get(i).getValue0() + ","+ ocupacio.get(i).getValue1()  + "";
			info.add(auxs);
		}
		
		mostraOcupa = new MostraOcupacio(this);
		mostraOcupa.asignaSeients(info);
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
