import java.util.Date;

public class Estrena extends Representacio{

	private Integer recarrec;
	
	public Estrena(Integer recarrec, Float preu, Date data) {
		super(preu, data, recarrec);
		this.recarrec = recarrec;
	}

	public Integer getRecarrec() {
		return recarrec;
	}

	public void setRecarrec(Integer recarrec) {
		this.recarrec = recarrec;
	}

}
