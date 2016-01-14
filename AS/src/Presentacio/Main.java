package Presentacio;

import java.awt.EventQueue;


public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    System.out.println("Main");
                    CompraEntradaController ctrlPresentacio = new CompraEntradaController();
                    ctrlPresentacio.inicializar();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	
}
