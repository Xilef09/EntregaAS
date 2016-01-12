/**
 * 
 */

/**
 * @author GerardDuch
 *
 */
public class Espectacle {

	private String titol;
	private Integer participants;
	
	/**
	 * @throws Exception 
	 * 
	 */
	public Espectacle(String titol, Integer participants) throws Exception {
		super();
		if (titol.isEmpty() || titol == null)
			throw new Exception ("Error: falta escriure un titol\n");
		if (participants<=0)
			throw new Exception ("Error: El numero de participants ha de ser un enter major que 0\n");
		this.titol = titol;
		this.participants = participants;
	}

	public String getTitol() {
		return titol;
	}

	public void setTitol(String titol) {
		this.titol = titol;
	}

	public Integer getParticipants() {
		return participants;
	}

	public void setParticipants(Integer participants) {
		this.participants = participants;
	}

}
