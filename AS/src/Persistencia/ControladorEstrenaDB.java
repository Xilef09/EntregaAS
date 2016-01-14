package Persistencia;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Domini.Estrena;
import Domini.Seient;


public class ControladorEstrenaDB implements ControladorEstrena{
	public Estrena get(String nomSessio, String nomLocal) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        ArrayList<Estrena> l = (ArrayList<Estrena>) session.createQuery("FROM Estrena WHERE nomSessio = :em AND nomLocal = :em2").setParameter("em2", nomLocal).setParameter("em", nomSessio).list();
        session.getTransaction().commit();
        factory.close();
        Estrena ret = new Estrena();
        for(int i = 0; i < l.size(); ++i) {
        	if(l.get(i).getNomLocal().equals(nomLocal) && l.get(i).getSessio().equals(nomSessio)){
        		ret = l.get(i);
        		break;
        	}
        }
		return ret;
	};
	
	public Boolean exists(String nomSessio, String nomLocal){
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        ArrayList<Estrena> l = (ArrayList<Estrena>) session.createQuery("FROM Estrena WHERE nomSessio = :em AND nomLocal = :em2").setParameter("em2", nomLocal).setParameter("em", nomSessio).list();
        session.getTransaction().commit();
        factory.close();
		return l != null;
	};
	public ArrayList<Estrena> all (){
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        ArrayList<Estrena> l = (ArrayList<Estrena>) session.createQuery("FROM Estrena").list();
        session.getTransaction().commit();
        factory.close();
		return l;
	};
}
