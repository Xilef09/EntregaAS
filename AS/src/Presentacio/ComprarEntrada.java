package Presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class ComprarEntrada {

	private JPanel contentPane;
	private JFrame frame;
	private static CompraEntradaController ctrlPresentacion;
	private JTextField textField;
	private JLabel lblCodiBanc;
	private JTextField textField_1;
	private JLabel lblNumeroDeCompte;
	private JTextField textField_2;
	private JButton btnOk;
	private JButton btnCancelar;
	private JLabel lblSinErrores;
	private JRadioButton radioButton;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblPreu;
	private JLabel label;
	

	/**
	 * Create the frame.
	 */
	public ComprarEntrada(CompraEntradaController ce) {
		ctrlPresentacion = ce;
		inicializa();
	}
	
	private void inicializa() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblPreu = new JLabel("Preu:");
		GridBagConstraints gbc_lblPreu = new GridBagConstraints();
		gbc_lblPreu.insets = new Insets(0, 0, 5, 5);
		gbc_lblPreu.gridx = 3;
		gbc_lblPreu.gridy = 1;
		contentPane.add(lblPreu, gbc_lblPreu);
		
		label = new JLabel("0\u20AC");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 4;
		gbc_label.gridy = 1;
		contentPane.add(label, gbc_label);
		
		JLabel lblNewLabel = new JLabel("DNI");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 8;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 9;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		radioButton = new JRadioButton("EUR");
		GridBagConstraints gbc_radioButton = new GridBagConstraints();
		gbc_radioButton.insets = new Insets(0, 0, 5, 5);
		gbc_radioButton.gridx = 4;
		gbc_radioButton.gridy = 2;
		contentPane.add(radioButton, gbc_radioButton);
		
		lblCodiBanc = new JLabel("Codi Banc");
		lblCodiBanc.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblCodiBanc = new GridBagConstraints();
		gbc_lblCodiBanc.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodiBanc.gridx = 8;
		gbc_lblCodiBanc.gridy = 3;
		contentPane.add(lblCodiBanc, gbc_lblCodiBanc);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 9;
		gbc_textField_1.gridy = 3;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		rdbtnNewRadioButton = new JRadioButton("USD");
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 4;
		gbc_rdbtnNewRadioButton.gridy = 4;
		contentPane.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		lblNumeroDeCompte = new JLabel("Numero de compte");
		lblNumeroDeCompte.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNumeroDeCompte = new GridBagConstraints();
		gbc_lblNumeroDeCompte.gridwidth = 2;
		gbc_lblNumeroDeCompte.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroDeCompte.gridx = 7;
		gbc_lblNumeroDeCompte.gridy = 5;
		contentPane.add(lblNumeroDeCompte, gbc_lblNumeroDeCompte);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 9;
		gbc_textField_2.gridy = 5;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		rdbtnNewRadioButton_1 = new JRadioButton("GBP");
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 4;
		gbc_rdbtnNewRadioButton_1.gridy = 6;
		contentPane.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		btnOk = new JButton("Ok");
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.insets = new Insets(0, 0, 5, 5);
		gbc_btnOk.gridx = 8;
		gbc_btnOk.gridy = 7;
		contentPane.add(btnOk, gbc_btnOk);
		
		btnOk.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ctrlPresentacion.PrOkFinalitza();
			}
		});
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 9;
		gbc_btnCancelar.gridy = 7;
		contentPane.add(btnCancelar, gbc_btnCancelar);
		
		btnCancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
		
		lblSinErrores = new JLabel("Sin errores");
		GridBagConstraints gbc_lblSinErrores = new GridBagConstraints();
		gbc_lblSinErrores.gridwidth = 14;
		gbc_lblSinErrores.insets = new Insets(0, 0, 0, 5);
		gbc_lblSinErrores.gridx = 0;
		gbc_lblSinErrores.gridy = 8;
		contentPane.add(lblSinErrores, gbc_lblSinErrores);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton_1);
		bg.add(radioButton);
		bg.add(rdbtnNewRadioButton);
	}
	
	public void mostra() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
