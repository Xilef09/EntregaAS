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
	 * 
	 */
	public Espectacle(String titol, Integer participants) {
		super();
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
