package Persistencia;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Domini.Representacio;
import Domini.Sessio;


public class ControladorSessioDB implements ControladorSessio{

	public ControladorSessioDB() {
	}
	
	@Override
	public Sessio get(String sessio) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		List<Sessio> l = session.createQuery("from Sessio where sessio = :ses")
				.setParameter("ses", sessio).list();
		session.getTransaction().commit();
		factory.close();
		if (!l.isEmpty()) return l.get(0);
		throw new Exception ("Session no existe");
	}

	@Override
	public Boolean exists(String sessio) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		List<Sessio> l = session.createQuery("from Sessio where sessio = :ses")
				.setParameter("ses", sessio).list();
		session.getTransaction().commit();
		factory.close();
		return !l.isEmpty();
	}

	@Override
	public ArrayList<Sessio> all() throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		ArrayList<Sessio> l = (ArrayList<Sessio>) session.createQuery("from Sessio").list();
		session.getTransaction().commit();
		factory.close();
		return l;
	}

}
