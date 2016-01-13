package Persistencia;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Domini.Espectacle;
import Domini.SeientEnRepresentacio;


public class ControladorSeientsEnRepresentacioDB implements ControladorSeientsEnRepresentacio{

	public ControladorSeientsEnRepresentacioDB() {
		
	}
	
	@Override
	public SeientEnRepresentacio get(String nomSessio, String nomLocal,
			String nomLocalSeient, int fila, int columna, String identificador) throws Exception{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		List<SeientEnRepresentacio> l = session.createQuery("from SeientEnRepresentacio where "
				+ "sessio = :a1 and nomlocal = :a2 and nomlocalseient = :a3, and fila = :a4 and "
				+ "columna = a5 and identrada = :a6")
				.setParameter("a1", nomSessio)
				.setParameter("a2", nomLocal)
				.setParameter("a3", nomLocalSeient)
				.setParameter("a4", fila)
				.setParameter("a5", columna)
				.setParameter("a6", identificador).list();
		session.getTransaction().commit();
		factory.close();
		if (!l.isEmpty()) return l.get(0);
		throw new Exception ("Espectacle no existeix");
	}

	@Override
	public Boolean exists(String nomSessio, String nomLocal,
			String nomLocalSeient, int fila, int columna, String identificador) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		List<SeientEnRepresentacio> l = session.createQuery("from SeientEnRepresentacio where "
				+ "sessio = :a1 and nomlocal = :a2 and nomlocalseient = :a3, and fila = :a4 and "
				+ "columna = a5 and identrada = :a6")
				.setParameter("a1", nomSessio)
				.setParameter("a2", nomLocal)
				.setParameter("a3", nomLocalSeient)
				.setParameter("a4", fila)
				.setParameter("a5", columna)
				.setParameter("a6", identificador).list();
		session.getTransaction().commit();
		factory.close();
		return !l.isEmpty();
	}

	@Override
	public ArrayList<SeientEnRepresentacio> all() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		ArrayList<SeientEnRepresentacio> l = (ArrayList<SeientEnRepresentacio>) session.createQuery("from SeientEnRepresentacio").list();
		session.getTransaction().commit();
		factory.close();
		return l;
	}

}
