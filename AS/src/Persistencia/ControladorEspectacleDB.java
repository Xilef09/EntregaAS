package Persistencia;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Domini.Espectacle;
import Domini.Local;


public class ControladorEspectacleDB implements ControladorEspectacle{

	public ControladorEspectacleDB() {
		
	}
	
	@Override
	public Espectacle get(String titol) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		List<Espectacle> l = session.createQuery("from Espectacle where titol = :t")
				.setParameter("t", titol).list();
		session.getTransaction().commit();
		factory.close();
		if (!l.isEmpty()) return l.get(0);
		throw new Exception ("Espectacle no existeix");
	}

	@Override
	public Boolean exists(String titol) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		List<Espectacle> l = session.createQuery("from Espectacle where titol = :t")
				.setParameter("t", titol).list();
		session.getTransaction().commit();
		factory.close();
		return !l.isEmpty();
	}

	@Override
	public ArrayList<Espectacle> all() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		ArrayList<Espectacle> l = (ArrayList<Espectacle>) session.createQuery("from Espectacle").list();
		session.getTransaction().commit();
		factory.close();
		return l;
	}

}
