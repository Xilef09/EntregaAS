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
import Persistencia.ControladorEspectacleDB;
import Persistencia.ControladorLocalDB;

public class Main2 {

	private static Session session;
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		
		probarEspectaculo();
		//probarLocal();
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

	private static void probarEspectaculo() {
		//Espectacle e = new Espectacle();
		//e.setTitol("Sin titulo");
		//e.setParticipants(5);
		
		ControladorEspectacleDB ce = new ControladorEspectacleDB();
		//session.beginTransaction();
		//session.save(e);
		//session.getTransaction().commit();
		
		try {
			Espectacle e = ce.get("Sin titulo");
			System.out.println(e.getTitol() + " " + e.getParticipants().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Espectacle> al = ce.all();
		for (int i=0; i< al.size();++i) {
			System.out.println(al.get(i).getTitol());
		}
		
	}
}
