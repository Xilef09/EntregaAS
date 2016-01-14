package Persistencia;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Domini.Representacio;

public class ControladorRepresentacioDB implements ControladorRepresentacio{

	public ControladorRepresentacioDB() {
		
	}
	
	@Override
	public Representacio get(String sessio, String nomlocal) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		List<Representacio> l = session.createQuery("from Representacio where sessio = :ses and "
				+ "nomlocal = :nl").setParameter("ses", sessio).setParameter("nl", nomlocal).list();
		session.getTransaction().commit();
		factory.close();
		if (!l.isEmpty()) return l.get(0);
		throw new Exception ("Representacion no existe");
		
	}

	@Override
	public Boolean exists(String sessio, String nomLocal) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		List<Representacio> l = session.createQuery("from Representacio where sessio = :ses and "
				+ "nomlocal = :nl").setParameter("ses", sessio).setParameter("nl", nomLocal).list();
		session.getTransaction().commit();
		factory.close();
		return !l.isEmpty();
	}

	@Override
	public ArrayList<Representacio> all() throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		ArrayList<Representacio> l = (ArrayList<Representacio>) session.createQuery("from Representacio").list();
		session.getTransaction().commit();
		factory.close();
		return l;
	}
}
