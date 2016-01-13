import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ControladorLocalDB implements ControladorLocal{

	public ControladorLocalDB() {	
	}
	
	@Override
	public Local get(String nomLocal) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		List<Local> l = session.createQuery("from Local where nomlocal = :nl").setParameter("nomlocal", nomLocal).list();
		session.getTransaction().commit();
		factory.close();
		if (!l.isEmpty()) return l.get(0);
		throw new Exception ("Local no existe");
	}

	@Override
	public Boolean exists(String nomLocal) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		List<Local> l = session.createQuery("from Local where nomlocal = :nl").setParameter("nomlocal", nomLocal).list();
		session.getTransaction().commit();
		factory.close();
		return !l.isEmpty();
	}

	@Override
	public ArrayList<Local> all() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		ArrayList<Local> l = (ArrayList<Local>) session.createQuery("from Local").list();
		session.getTransaction().commit();
		factory.close();
		return l;
	}

}
