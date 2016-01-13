import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="seientsenrepresentacio")
public class SeientEnRepresentacio implements Serializable{
	@Id
	@Column(name="sessio")
	private String sessio;
	
	@Id
	@Column(name="nomlocal")
	private String nomLocal;
	
	@Column(name="identrada")
	private String idEntrada;
	
	@Id
	@Column(name="nomlocalseien")
	private String nomLocalSeient;
	
	@Id
	@Column(name="fila")
	private Integer fila;
	
	@Id
	@Column(name="columna")
	private Integer columna;
	
	@Id
	@Column(name="estat")
	private Integer estat; // 0 libre 1 ocupado
	
	public SeientEnRepresentacio(Integer estat, String sessio, String idEntrada, String nomLocal, String nomLocalSeient, Integer fila, Integer columna) throws Exception {
		super();
		if (nomLocalSeient.isEmpty() || nomLocalSeient == null)
			throw new Exception ("Error: el nom del local del seient es incorrecte\n");
		if (fila<=0 || fila==null)
			throw new Exception ("Error: la fila no es correcte\n");
		if (columna<=0 || columna==null)
			throw new Exception ("Error: la columna no es correcte\n");
		if (sessio == null)
			throw new Exception ("Error: sessio incorrecte\n");
		if (nomLocal.isEmpty() || nomLocal == null)
			throw new Exception ("Error: falta escriure un nom de local\n");
		if (!nomLocal.equals(nomLocalSeient))
			throw new Exception ("Error: el nom del local ha de ser el matieix que el del local del seient\n");
		this.estat=estat;
		this.sessio=sessio;
		this.nomLocal=nomLocal;
		this.idEntrada=idEntrada;
		this.nomLocalSeient=nomLocalSeient;
		this.fila=fila;
		this.columna=columna;
	}

	public Integer getEstat() {
		return estat;
	}

	public void setEstat(Integer estat) {
		this.estat = estat;
	}

	public String getSessio() {
		return sessio;
	}

	public void setSessio(String sessio) {
		this.sessio = sessio;
	}

	public String getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(String idEntrada) {
		this.idEntrada = idEntrada;
	}

	public String getNomLocalSeient() {
		return nomLocalSeient;
	}

	public void setNomLocalSeient(String nomLocalSeient) {
		this.nomLocalSeient = nomLocalSeient;
	}

	public String getNomLocal() {
		return nomLocal;
	}

	public void setNomLocal(String nomLocal) {
		this.nomLocal = nomLocal;
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

}
