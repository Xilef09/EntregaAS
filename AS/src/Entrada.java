import java.util.Date;

public class Entrada {
	
	private String identificador;
	private String dniClient;
	private Integer nombreEspectadors;
	private String data;
	private Float preu;
	
	public enum TipusSessio {
	    mati, tarda, nit
	}
	
	private TipusSessio sessio;
	private String titol;
	private String nomLocal;

	public Entrada(String identificador, String dniClient, Integer nombreEspectadors, String data, Float preu, TipusSessio sessio, String titol, String nomLocal) throws Exception {
		super();
		if (identificador.isEmpty() || identificador == null)
			throw new Exception ("Error: l'identificador no es correcte\n");
		if (nombreEspectadors<=0)
			throw new Exception ("Error: el nombre d'espectadors ha de ser un enter mes gran que 0\n");
		if (preu<=0)
			throw new Exception ("Error: el preu ha de ser un enter mes gran que 0\n");
		this.identificador = identificador;
		this.dniClient = dniClient;
		this.data = data;
		this.preu = preu;
		this.nombreEspectadors = nombreEspectadors;	
		this.sessio=sessio;
		this.titol=titol;
		this.nomLocal=nomLocal;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDniClient() {
		return dniClient;
	}

	public void setDniClient(String dniClient) {
		this.dniClient = dniClient;
	}

	public Integer getNombreEspectadors() {
		return nombreEspectadors;
	}

	public void setNombreEspectadors(Integer nombreEspectadors) {
		this.nombreEspectadors = nombreEspectadors;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Float getPreu() {
		return preu;
	}

	public void setPreu(Float preu) {
		this.preu = preu;
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

	public String getNomLocal() {
		return nomLocal;
	}

	public void setNomLocal(String nomLocal) {
		this.nomLocal = nomLocal;
	}

}
