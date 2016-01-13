import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Main2 {

	private static Session session;
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		
		//probarEspectaculo();
		probarLocal();
		session.close();
		factory.close();
	}
	
	private static void probarLocal() {
		//Local l = new Local();
		//l.setNom("dddd");
		//l.setAdreca("sin calle");
		
		ControladorLocalDB cl = new ControladorLocalDB(); 
		session.beginTransaction();
		//session.save(l);
		session.getTransaction().commit();
		
		
		ArrayList<Local> al = cl.all();
		for (int i=0; i< al.size();++i) {
			System.out.println(al.get(i).getNom());
		}
	}
	
	private static void probarEspectaculo() {
		
		//Crear espectaculo
		Scanner sc = new Scanner(System.in);
		session.beginTransaction();
		
		System.out.println("Lista de espectaculos");
		session.beginTransaction();
		String vec = "FROM Espectacle";
		List as = session.createQuery(vec).list();
		for (Iterator iter = as.iterator(); iter.hasNext();) {
			Espectacle s = (Espectacle) iter.next();
			System.out.println(s.getTitol() + Integer.toString(s.getParticipants()));
		}
		session.getTransaction().commit();
	}
}
