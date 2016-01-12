
public class Seient {
	
	private Integer fila;
	private Integer columna;

	private String nomLocal;
	
	public Seient(Integer fila, Integer columna, String nomLocal) {
		// TODO Auto-generated constructor stub
		super();
		this.fila=fila;
		this.nomLocal=nomLocal;
		this.columna=columna;
	}

	public Integer getFila() {
		return fila;
	}

	public void setFila(Integer fila) {
		this.fila = fila;
	}

	public Integer getColumna() {
		return columna;
	}

	public void setColumna(Integer columna) {
		this.columna = columna;
	}

	public String getNomLocal() {
		return nomLocal;
	}

	public void setNomLocal(String nomLocal) {
		this.nomLocal = nomLocal;
	}

}
