import java.util.Date;

public class Representacio {
	
	private Float preu;
	private Date data;
	private Integer nombreSeientsLliures;
	
	public Representacio(Float preu, Date data, Integer nombreSeientsLliures) {
		super();
		this.preu = preu;
		this.data = data;
		this.nombreSeientsLliures = nombreSeientsLliures;		
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

}
