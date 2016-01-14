package Domini;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Domini.Espectacle;
import Domini.Local;
import Persistencia.ControladorLocalDB;

public class Main2 {

	private static Session session;
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		
		//probarEspectaculo();
		probarLocal();
		session.close();
		factory.close();
	}
	
	private static void probarLocal() {
		//Local l = new Local();
		//l.setNom("dddd");
		//l.setAdreca("sin calle");
		
		ControladorLocalDB cl = new ControladorLocalDB(); 
		session.beginTransaction();
		//session.save(l);
		session.getTransaction().commit();
		
		
		ArrayList<Local> al = cl.all();
		for (int i=0; i< al.size();++i) {
			System.out.println(al.get(i).getNom());
		}
	}

}
