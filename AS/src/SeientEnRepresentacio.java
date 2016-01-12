public class SeientEnRepresentacio {
	
	public enum Estat {
	    ocupat, lliure
	}
	
	public enum TipusSessio {
	    matí, tarda, nit
	}
	
	private TipusSessio sessio;
	private String titol;
	private String nomLocal;
	private String idEntrada;
	private String nomLocalSeient;
	private Integer fila;
	private Integer columna;
	private Estat estat;
	
	public SeientEnRepresentacio(Estat estat, TipusSessio sessio, String titol, String idEntrada, String nomLocal, String nomLocalSeient, Integer fila, Integer columna) {
		this.estat=estat;
		this.sessio=sessio;
		this.titol=titol;
		this.nomLocal=nomLocal;
		this.idEntrada=idEntrada;
		this.nomLocalSeient=nomLocalSeient;
		this.fila=fila;
		this.columna=columna;
	}

	public Estat getEstat() {
		return estat;
	}

	public void setEstat(Estat estat) {
		this.estat = estat;
	}

	public TipusSessio getSessio() {
		return sessio;
	}

	public void setSessio(TipusSessio sessio) {
		this.sessio = sessio;
	}

	public String getTitol() {
		return titol;
	}

	public void setTitol(String titol) {
		this.titol = titol;
	}

	public String getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(String idEntrada) {
		this.idEntrada = idEntrada;
	}

	public String getNomLocalSeient() {
		return nomLocalSeient;
	}

	public void setNomLocalSeient(String nomLocalSeient) {
		this.nomLocalSeient = nomLocalSeient;
	}

	public String getNomLocal() {
		return nomLocal;
	}

	public void setNomLocal(String nomLocal) {
		this.nomLocal = nomLocal;
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

}
