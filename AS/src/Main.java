import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class Main {
	
	private static void mostrarOpciones() {
		System.out.println("1. Introduce/Modifica X Asientos");
		System.out.println("2. Introduce/Modifica un Local");
		System.out.println("3. Obten todos los asientos de la BD");
		System.out.println("4. Obten todos los locales de la BD");
		System.out.println("5. Elimina un asiento de la BD");
		System.out.println("6. Elimina un local de la BD");
		System.out.println("7. Elimina informacion de la BD");
		System.out.println("8. Finaliza");
	}
	
	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		mostrarOpciones();
		
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		while (num != 8) {
			
			switch (num) {
			case 1: // Introduce X Asientos
				session.beginTransaction();
				System.out.println("Introduzca numero de asientos que quiere introducir");
				int numAs = sc.nextInt();
				int fila,columna;
				String nomLoc = "";
				System.out.println("Fila, columna, nombre Local");
				for (int i=0; i<numAs; ++i) {
					fila = sc.nextInt();
					columna = sc.nextInt();
					nomLoc = sc.next();		
					Seients s = new Seients();
					s.setFila(fila);
					s.setColumna(columna);
					s.setNomlocal(nomLoc);
					session.save(s);	
				}
				try {
					session.getTransaction().commit();
				}
				catch (Exception e) {
					System.out.println("No existe el local " + nomLoc + ". Crealo antes de introducir asientos");
				}
				break;
				
			case 2: // Introduce Local
				session.beginTransaction();
				System.out.println("Introduce nom, adreça");
				String nom = sc.next();
				String adreca = sc.next();
				Local l = new Local ();
				l.setNom(nom);
				l.setAdreca(adreca);
				session.save(l);
				session.getTransaction().commit();
				break;
				
			case 3: //Obtiene Asientos
				session.beginTransaction();
				String vec = "FROM Seients";
				List as = session.createQuery(vec).list();
				for (Iterator iter = as.iterator(); iter.hasNext();) {
					Seients s = (Seients) iter.next();
					System.out.println(Integer.toString(s.getFila()) + Integer.toString(s.getColumna()) + s.getNomlocal());
				}
				session.getTransaction().commit();
				break;
				
			case 4: //Obtiene locales
				session.beginTransaction();
				String orden = "FROM Local";
				List locales = session.createQuery(orden).list();
				for (Iterator iter = locales.iterator(); iter.hasNext();) {
					Local loc = (Local) iter.next();
					System.out.println(loc.getNom() + " " + loc.getAdreca());
				}
				session.getTransaction().commit();
				break;
				
			case 5: //Elimina Asiento
				session.beginTransaction();
				System.out.println("Introduce fila columna y nombreLocal del asiento que quiera borrar");
				int filab = sc.nextInt();
				int columnab = sc.nextInt();
				String nombrel = sc.next();
				String MiOrden = "FROM Seients s where s.fila = "+ filab + "and s.columna =" + columnab;
				List borra = session.createQuery(MiOrden).list();
				for (Iterator iter = borra.iterator(); iter.hasNext();) {
					Seients s = (Seients) iter.next();
					if (s.getNomlocal().equals(nombrel)) {
						session.delete(s);
					}
				}
				
				session.getTransaction().commit();
				break;
				
			case 6: //Elimina Local
				session.beginTransaction();
				System.out.println("Introduce nombre del local que desea borrar");
				String nombre = sc.next();
				Local a = (Local) session.get("Local", nombre);
				String miorden = "FROM Seients";
				List list = session.createQuery(miorden).list();
				for (Iterator iter = list.iterator(); iter.hasNext();) {
					Seients s1 = (Seients) iter.next();
					if (s1.getNomlocal().equals(nombre)) {
						session.delete(s1);
					}
				}
				try{
					session.delete(a);
				}
				catch (Exception e) {
					System.out.println("El local que ha introducido no existe \n");
				}
				session.getTransaction().commit();
				break;
				
			case 7: //Limpiar BD
				session.beginTransaction();
				//Elimina todos los asientos
				String vec2 = "FROM Seients";
				List as2 = session.createQuery(vec2).list();
				for (Iterator iter = as2.iterator(); iter.hasNext();) {
					Seients s1 = (Seients) iter.next();
					session.delete(s1);
				}
				// Elimina todos los locales
				String vec3 = "FROM Local";
				List as3 = session.createQuery(vec3).list();
				for (Iterator iter = as3.iterator(); iter.hasNext();) {
					Local l1 = (Local) iter.next();
					session.delete(l1);
				}
				session.getTransaction().commit();
				
				break;
			}
			
			mostrarOpciones();
			num = sc.nextInt();
		}
		System.out.println("FIN");
		
		/*
		System.out.println("Introduce 5 asientos: " + "\n");
		System.out.println("Fila, columna, nombre Local" + "\n");
		
		for (int i=0; i<5; ++i) {
			
			int fila = sc.nextInt();
			int columna = sc.nextInt();
			String nomLoc = sc.next();
						
			Seients s = new Seients(fila, columna, nomLoc);
			session.saveOrUpdate(s);
			
		}
		
		System.out.println("Introduce 1 locales: " + "\n");
		
		String nom = sc.next();
		String adreca = sc.next();
		Local l = new Local (nom, adreca);
		session.saveOrUpdate(l);
		
		System.out.println("FIN");
		
		session.getTransaction().commit();
		
		session.beginTransaction();
		String vec = "FROM Seients";
		List as = session.createQuery(vec).list();
		for (Iterator iter = as.iterator(); iter.hasNext();) {
			Seients s = (Seients) iter.next();
			System.out.println(Integer.toString(s.getFila()));
			System.out.println(Integer.toString(s.getColumna()));
			System.out.println(s.getNomLocal());
		}
		
		System.out.println("Elimina uno de los anteriores");
		
		
		Object a = session.get("Local", "a");
		session.delete(a);
		session.getTransaction().commit();
	
		
		session.close();
		*/
	}
	
}
