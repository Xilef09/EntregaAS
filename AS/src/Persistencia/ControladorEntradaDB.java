package Persistencia;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Domini.Entrada;



public class ControladorEntradaDB implements ControladorEntrada {
	
	public ArrayList<Entrada> all() throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        ArrayList<Entrada> l = (ArrayList<Entrada>) session.createQuery("FROM Entrada").list();
        session.getTransaction().commit();
        factory.close();
		return l;
	}
	
	public Boolean exists(String identificador) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        ArrayList<Entrada> l = (ArrayList<Entrada>) session.createQuery("FROM Entrada WHERE identificador = :em").setParameter("em", identificador).list();
        session.getTransaction().commit();
        factory.close();
		return l != null;
	}
	
	public Entrada get(String identificador) throws Exception {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        ArrayList<Entrada> l = (ArrayList<Entrada>) session.createQuery("FROM Entrada WHERE identificador = :em").setParameter("em", identificador).list();
        session.getTransaction().commit();
        factory.close();
        Entrada ret = new Entrada();
        for(int i = 0; i < l.size(); ++i) {
        	if(l.get(i).getIdentificador().equals(identificador)){
        		ret = l.get(i);
        		break;
        	}
        }
		return ret;
	}
	
	public void set(Entrada x) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.save(x);
        session.getTransaction().commit();
        factory.close();
	}
}
