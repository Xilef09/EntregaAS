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
		
		//probarEspectaculo(); OK
		probarSesion();
		
	}
	
	private static void probarSesion() {
		Scanner sc = new Scanner(System.in);
		session.beginTransaction();
		
		String session;
		
		session = sc.next();
		
	}
	
	private static void probarEspectaculo() {
		
		//Crear espectaculo
		Scanner sc = new Scanner(System.in);
		session.beginTransaction();
		
		String titulo;
		int participantes;
		
		titulo = sc.next();
		participantes = sc.nextInt();
		Espectacle e = new Espectacle();
		
		e.setTitol(titulo);
		e.setParticipants(participantes);
		session.save(e);
		System.out.println("GUARDADO");
		session.getTransaction().commit();
		
	
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
