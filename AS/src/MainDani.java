import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Domini.Entrada;
import Domini.Estrena;
import Domini.Local;
import Domini.Representacio;
import Domini.Seient;
import Persistencia.ControladorEstrenaDB;
import Domini.Sessio;
import Persistencia.ControladorRepresentacioDB;
import Persistencia.*;
import Domini.*;


public class MainDani {
	public static void main(String[] args) throws Exception {
		//Local l = new Local("l1", "a1");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        //session.save(l);
        //session.save(z);
        //session.save(x);
        //session.getTransaction().commit();
        factory.close();
		ControladorRepresentacioDB aux = new ControladorRepresentacioDB();
		System.out.println(aux.all().get(0));
	}
}
