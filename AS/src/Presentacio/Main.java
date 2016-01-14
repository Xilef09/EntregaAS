package Presentacio;

import java.awt.EventQueue;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Domini.Entrada;
import Domini.Espectacle;
import Domini.Estrena;
import Domini.Local;
import Domini.Representacio;
import Domini.Seient;
import Domini.SeientEnRepresentacio;
import Domini.Sessio;


public class Main {
	/*
	 * Per fer proves
	 */
	private static Session session;

	private static void creaEspec() throws Exception{
		/*System.out.println("entrooooooooooo");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		
		SeientEnRepresentacio s1 = new SeientEnRepresentacio();
		s1.setSessio("nit");
		s1.setNomLocal("Local1");
		s1.setNomLocalSeient("Local1");
		s1.setFila(1);
		s1.setColumna(1);
		s1.setEstat(0);
		session.beginTransaction();
		session.save(s1);
		session.getTransaction().commit();
		
		s1 = new SeientEnRepresentacio();
		s1.setSessio("nit");
		s1.setNomLocal("Local1");
		s1.setNomLocalSeient("Local1");
		s1.setFila(1);
		s1.setColumna(2);
		s1.setEstat(0);
		session.beginTransaction();
		session.save(s1);
		session.getTransaction().commit();
		
		s1 = new SeientEnRepresentacio();
		s1.setSessio("nit");
		s1.setNomLocal("Local1");
		s1.setNomLocalSeient("Local1");
		s1.setFila(1);
		s1.setColumna(3);
		s1.setEstat(0);
		session.beginTransaction();
		session.save(s1);
		session.getTransaction().commit();
	
		
		session.close();
		factory.close();
		System.out.println("surtooooooooooo");*/
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
