package Domini;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="entrada")
public class Entrada {
	
	@Id
	@Column(name ="identificador")
	private String identificador;
	
	@Column(name="dniclient")
	private String dniClient;
	
	@Column(name="nombreespectadors")
	private Integer nombreEspectadors;
	
	@Column(name="data")
	private String data;
	
	@Column(name="preu")
	private Float preu;
	
	@Column (name="sessio")
	private String sessio;
	
	@Column (name="nomlocal")
	private String nomLocal;
	private ArrayList<SeientEnRepresentacio> sr = new ArrayList<>();


	public Entrada(String identificador, String dniClient, Integer nombreEspectadors, String data, Float preu, String sessio, String nomLocal) throws Exception {
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
		this.nomLocal=nomLocal;
	}

	public Entrada(String id, String dni, Integer nSeients, String dataActual, Float preuTotal) {
		this.identificador=id;
		this.dniClient=dni;
		this.nombreEspectadors=nSeients;
		this.data=dataActual;
		this.preu=preuTotal;
	}
	public Entrada() {
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

	public String getSessio() {
		return sessio;
	}

	public void setSessio(String sessio) {
		this.sessio = sessio;
	}

	public String getNomLocal() {
		return nomLocal;
	}

	public void setNomLocal(String nomLocal) {
		this.nomLocal = nomLocal;
	}
	public void asignarSeient(SeientEnRepresentacio r) {
		sr.add(r);
		
	}

}
