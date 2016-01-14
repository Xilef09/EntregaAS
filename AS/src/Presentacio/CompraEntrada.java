package Presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CompraEntrada extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private static CompraEntradaController ctrlPresentacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompraEntradaController ctrlPresentacio = new CompraEntradaController();
                    ctrlPresentacio.prObteEspectacles();
					CompraEntrada frame = new CompraEntrada(ctrlPresentacio);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CompraEntrada(CompraEntradaController ce) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		ctrlPresentacion = ce;
		inicializa();
	}
	
	private void inicializa(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		
	}
	

}
