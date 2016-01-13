
public class Local {
	
	private String nom;
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
