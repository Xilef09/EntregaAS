import java.util.Date;

public class Estrena extends Representacio{

	private Integer recarrec;
	
	public Estrena(Integer recarrec, Float preu, Date data, TipusSessio sessio, String nomLocal) {
		super(preu, data, recarrec, sessio, nomLocal, nomLocal);
		this.recarrec = recarrec;
	}

	public Integer getRecarrec() {
		return recarrec;
	}

	public void setRecarrec(Integer recarrec) {
		this.recarrec = recarrec;
	}

}
