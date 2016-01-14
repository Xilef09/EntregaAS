package Domini;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estrena")
public class Estrena extends Representacio{

	
	@Column (name="recarrec")
	private Integer recarrec;
	
	public Estrena() {

	}
	
	public Estrena(Integer recarrec, Float preu, Date data, String sessio, String nomLocal, String titolEspectacle, Integer numSeientsLliures) throws Exception {
		super(preu, data, numSeientsLliures, sessio, titolEspectacle, nomLocal);
		if (titolEspectacle.isEmpty() || titolEspectacle == null)
			throw new Exception ("Error: falta escriure un titol d'espectacle\n");
		if (nomLocal.isEmpty() || nomLocal == null)
			throw new Exception ("Error: falta escriure un nom de local\n");
		if (recarrec<=0)
			throw new Exception("El recarrec ha de ser superior a 0\n");
		this.recarrec = recarrec;
	}

	public Integer getRecarrec() {
		return recarrec;
	}

	public void setRecarrec(Integer recarrec) {
		this.recarrec = recarrec;
	}
	public Boolean etsEstrena(){
		return true;
	}
}
