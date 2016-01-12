import java.util.Date;

public class Entrada {
	
	private String identificador;
	private String dniClient;
	private Integer nombreEspectadors;
	private Date data;
	private Float preu;

	public Entrada(String identificador, String dniClient, Integer nombreEspectadors, Date data, Float preu) {
		super();
		this.identificador = identificador;
		this.dniClient = dniClient;
		this.data = data;
		this.preu = preu;
		this.nombreEspectadors = nombreEspectadors;		
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

}
