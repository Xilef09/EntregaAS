package Domini;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sessio")
public class Sessio {
	@Id
	@Column(name="sessio")
	private String sessio;

	public Sessio(String sessio) throws Exception {
		super();
		if (sessio == null)
			throw new Exception ("Error: ha fallat la sessio\n");
		this.sessio=sessio;
	}

	public String getSessio() {
		return sessio;
	}

	public void setSessio(String sessio) {
		this.sessio = sessio;
	}

}
