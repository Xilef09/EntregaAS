
public class Sessio {
	
	public enum TipusSessio {
	    matí, tarda, nit
	}
	
	private TipusSessio sessio;

	public Sessio(TipusSessio sessio) {
		this.sessio=sessio;
	}

	public TipusSessio getSessio() {
		return sessio;
	}

	public void setSessio(TipusSessio sessio) {
		this.sessio = sessio;
	}

}
