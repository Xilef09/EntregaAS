package Domini;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="local")
public class Local {
	@Id
	@Column(name ="nom")
	private String nom;
	
	@Column (name="adreca")
	private String adreca;

	public Local() {
		super();
	}

	public Local(String nom, String adreca) throws Exception {
		super();
		if (nom.isEmpty() || nom == null)
			throw new Exception ("Error: falta escriure un nom\n");
		this.nom = nom;
		this.adreca = adreca;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getAdreca() {
		return adreca;
	}
	
	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}	
	
}
