package Domini;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="representacio")
public class Representacio implements Serializable {
	
	@Id
	@Column (name="sessio")
	private String sessio;
	
	@Column (name="titol")
	private String titolEspectacle;
	
	@Id
	@Column (name="nomlocal")
	private String nomLocal;
	
	@Column (name="preu")
	private Float preu;
	
	@Column (name="data")
	private String data;
	
	@Column (name="nombreseientslliures")
	private Integer nombreSeientsLliures;
	
	public Representacio() {
		
	}
	
	public Representacio(Float preu, String data, Integer nombreSeientsLliures, String sessio, String titolEspectacle, String nomLocal) throws Exception {
		super();
		if (titolEspectacle.isEmpty() || titolEspectacle == null)
			throw new Exception ("Error: falta escriure un titol d'espectacle\n");
		if (nomLocal.isEmpty() || nomLocal == null)
			throw new Exception ("Error: falta escriure un nom de local\n");
		this.preu = preu;
		this.data = data;
		this.nombreSeientsLliures = nombreSeientsLliures;		
		this.sessio = sessio;		
		this.titolEspectacle = titolEspectacle;		
		this.nomLocal = nomLocal;			
	}

	public Float getPreu() {
		return preu;
	}

	public void setPreu(Float preu) {
		this.preu = preu;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getNombreSeientsLliures() {
		return nombreSeientsLliures;
	}

	public void setNombreSeientsLliures(Integer nombreSeientsLliures) {
		this.nombreSeientsLliures = nombreSeientsLliures;
	}

	public String getNomLocal() {
		return nomLocal;
	}

	public void setNomLocal(String nomLocal) {
		this.nomLocal = nomLocal;
	}

	public String getTitolEspectacle() {
		return titolEspectacle;
	}

	public void setTitolEspectacle(String titolEspectacle) {
		this.titolEspectacle = titolEspectacle;
	}

	public String getSessio() {
		return sessio;
	}

	public void setSessio(String sessio) {
		this.sessio = sessio;
	}

}