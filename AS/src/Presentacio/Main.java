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
		System.out.println("entrooooooooooo");
		/*SessionFactory factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		
		Representacio e = new Representacio();
		
		e.setTitolEspectacle("Espe1");
		e.setSessio("mati");
		e.setNomLocal("Local1");
		e.setPreu((float)15.00);
		e.setData("01-01-16");
		e.setNombreSeientsLliures(100);
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		
		e = new Representacio();
		e.setTitolEspectacle("Espe1");
		e.setSessio("tarda");
		e.setNomLocal("Local1");
		e.setData("01-01-16");
		e.setPreu((float)15.00);
		e.setNombreSeientsLliures(100);
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		
		e = new Representacio();
		e.setPreu((float)15.00);
		e.setTitolEspectacle("Espe1");
		e.setSessio("nit");
		e.setNomLocal("Local2");
		e.setData("01-01-16");
		e.setNombreSeientsLliures(100);
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		
		e = new Representacio();
		e.setTitolEspectacle("Espe2");
		e.setSessio("mati");
		e.setPreu((float)15.00);
		e.setNomLocal("Local3");
		e.setData("01-01-15");
		e.setNombreSeientsLliures(100);
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		

		Estrena s1 = new Estrena();
		s1.setRecarrec(5);
		s1.setPreu((float)15.00);
		s1.setData("01-01-16");
		s1.setTitolEspectacle("Espe1");
		s1.setSessio("nit");
		s1.setNomLocal("Local1");
		session.beginTransaction();
		session.save(s1);
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
