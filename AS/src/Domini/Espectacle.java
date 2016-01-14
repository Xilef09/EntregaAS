package Domini;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.javatuples.Quintet;

import Persistencia.CtrlDataFactory;


@Entity
@Table(name="espectacle")
public class Espectacle {
	
	@Id
	@Column(name = "titol")
	private String titol;
	@Column(name = "participants")
	private Integer participants;
	private ArrayList<Representacio> representacions = new ArrayList<>();
	

	private CtrlDataFactory ctrlDataFactory;

	
	public Espectacle() {
		ctrlDataFactory = CtrlDataFactory.getInstance();
	}
	
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
		ctrlDataFactory = CtrlDataFactory.getInstance();
	
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

	public ArrayList<Quintet<String, String, Integer, Boolean, Float>> consultaRepresentacions(String date) {
		
		ArrayList<Representacio> myRepresentacions;
		try {
			myRepresentacions = ctrlDataFactory.getControladorRepresentacio().all();
			for (int j=0; j<myRepresentacions.size(); ++j) {
				if (myRepresentacions.get(j).getTitolEspectacle().equals(titol)) {
						representacions.add(myRepresentacions.get(j));
					}
			}		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("HOOOOOOOOOOOOOOOOOOOOOOO" + " " + representacions.size());
		ArrayList<Quintet<String,String,Integer,Boolean,Float>> r = new ArrayList();
		for(int i=0;i<representacions.size();++i){
			if(date==representacions.get(i).getData()) 
					r.add(representacions.get(i).obteDades());
		}
		return r;
	}
	
	public void setRepresentacions(ArrayList<Representacio> myArray) {
		representacions = myArray;
		}

}
