import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Domini.Entrada;
import Domini.Estrena;
import Domini.Local;
import Domini.Representacio;
import Domini.Seient;
import Domini.Sessio;


public class MainDani {
	public static void main(String[] args) throws Exception {
		//Representacio x = new Representacio();
		//Sessio z = new Sessio("s1");
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
