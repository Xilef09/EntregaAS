import java.util.Date;

public class Representacio {
	
	public enum TipusSessio {
	    matí, tarda, nit
	}
	
	private TipusSessio sessio;
	
	private String titolEspectacle;
	
	private String nomLocal;
	
	private Float preu;
	private Date data;
	private Integer nombreSeientsLliures;
	
	public Representacio(Float preu, Date data, Integer nombreSeientsLliures, TipusSessio sessio, String titolEspectacle, String nomLocal) {
		super();
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
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

	public TipusSessio getSessio() {
		return sessio;
	}

	public void setSessio(TipusSessio sessio) {
		this.sessio = sessio;
	}

}
