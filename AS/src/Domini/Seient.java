package Domini;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seient")
public class Seient implements Serializable{
	@Id
	@Column (name="fila")
	private Integer fila;
	@Id
	@Column (name="columna")
	private Integer columna;
	@Id
	@Column (name="nomlocal")
	private String nomLocal;
	
	public Seient() {
		this.fila=12;
		this.nomLocal="casa";
		this.columna=13;
	}
	
	public Seient(Integer fila, Integer columna, String nomLocal) throws Exception {
		// TODO Auto-generated constructor stub
		super();
		if (nomLocal.isEmpty() || nomLocal == null)
			throw new Exception ("Error: falta escriure el nom del local\n");
		if (fila<=0)
			throw new Exception ("Error: la fila no es correcte\n");
		if (columna<=0)
			throw new Exception ("Error: la columna no es correcte\n");
		this.fila=fila;
		this.nomLocal=nomLocal;
		this.columna=columna;
	}

	public Integer getFila() {
		return fila;
	}

	public void setFila(Integer fila) {
		this.fila = fila;
	}

	public Integer getColumna() {
		return columna;
	}

	public void setColumna(Integer columna) {
		this.columna = columna;
	}

	public String getNomLocal() {
		return nomLocal;
	}

	public void setNomLocal(String nomLocal) {
		this.nomLocal = nomLocal;
	}

}
