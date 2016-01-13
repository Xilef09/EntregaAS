import java.util.Date;

public class Entrada {
	
	private String identificador;
	private String dniClient;
	private Integer nombreEspectadors;
	private Date data;
	private Float preu;
	
	public enum TipusSessio {
	    mati, tarda, nit
	}
	
	private TipusSessio sessio;
	private String titol;
	private String nomLocal;

	public Entrada(String identificador, String dniClient, Integer nombreEspectadors, Date data, Float preu, TipusSessio sessio, String titol, String nomLocal) {
		super();
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
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
