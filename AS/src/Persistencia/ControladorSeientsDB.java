package Persistencia;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Domini.Entrada;
import Domini.Seient;


public class ControladorSeientsDB implements ControladorSeients{
	public Seient get(String nomLocal, int fila, int columna){
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        ArrayList<Seient> l = (ArrayList<Seient>) session.createQuery("FROM Seient WHERE nomLocal = :em AND fila = :em2 AND columna = :em3").setParameter("em", nomLocal).setParameter("em2", fila).setParameter("em3", columna).list();
        session.getTransaction().commit();
        factory.close();
        Seient ret = new Seient();
        for(int i = 0; i < l.size(); ++i) {
        	if(l.get(i).getColumna().equals(columna) && l.get(i).getFila().equals(fila) && l.get(i).getNomLocal().equals(nomLocal)){
        		ret = l.get(i);
        		break;
        	}
        }
		return ret;
	};
	public Boolean exists(String nomLocal, int fila, int columna){
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        ArrayList<Seient> l = (ArrayList<Seient>) session.createQuery("FROM Seient WHERE nomLocal = :em AND fila = :em2 AND columna = :em3").setParameter("em", nomLocal).setParameter("em2", fila).setParameter("em3", columna).list();
        session.getTransaction().commit();
        factory.close();
		return l != null;
	};
	public ArrayList<Seient> all () {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        ArrayList<Seient> l = (ArrayList<Seient>) session.createQuery("FROM Seient").list();
        session.getTransaction().commit();
        factory.close();
		return l;
	};
}
