import java.io.Serializable;


public class Seients implements Serializable{
	
	
	private int fila;
	private int columna;
	private String nomlocal;
	
	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public String getNomlocal() {
		return nomlocal;
	}

	public void setNomlocal(String nomlocal) {
		this.nomlocal = nomlocal;
	}
	
	public Seients(int fila, int columna, String nomlocal) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.nomlocal = nomlocal;
	}

	public Seients() {
		super();
	}


	
}
