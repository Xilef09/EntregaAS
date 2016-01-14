import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Domini.Entrada;
import Domini.Estrena;
import Domini.Seient;
import Persistencia.ControladorEstrenaDB;


public class MainDani {
	public static void main(String[] args) throws Exception {
		Estrena x = new Estrena();
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.save(x);
        session.getTransaction().commit();
        factory.close();
		ControladorEstrenaDB aux = new ControladorEstrenaDB();
		System.out.println(aux.get("", "").getNomLocal());
	}
}
