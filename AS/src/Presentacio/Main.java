package Presentacio;

import java.awt.EventQueue;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Domini.Espectacle;
import Domini.Estrena;


public class Main {
	/*
	 * Per fer proves
	 */
	private static Session session;

	private static void creaEspec() throws Exception{
		System.out.println("entrooooooooooo");
		/*SessionFactory factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		
		Espectacle e = new Espectacle("Espe1",10);
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		
		e = new Espectacle("Espe2",10);
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		
		e = new Espectacle("Espe3",10);
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		
		session.close();
		factory.close();*/
		
	}
	//-------------------------------------------------------
	
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //System.out.println("Main");
                    CompraEntradaController ctrlPresentacio = new CompraEntradaController();
                    creaEspec();//Proves
                    ctrlPresentacio.prObteEspectacles();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	
}
