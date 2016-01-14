package Presentacio;

import java.awt.EventQueue;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
		//System.out.println("entrooooooooooo");
		//SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//session = factory.openSession();
		
		
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
