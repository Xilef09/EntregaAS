package Presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Vector;

public class CompraEntradaOfficialView {

	private JPanel contentPane;
	private static CompraEntradaController ctrlPresentacion;
	private JTextField textField;
	private JFrame frame;
	private JLabel lblNewLabel;
	private JComboBox<String> comboBox;
	
	/**
	 * Create the frame.
	 */
	public CompraEntradaOfficialView(CompraEntradaController ce) {
		ctrlPresentacion = ce;
		inicializa();
		
	}
	
	private void inicializa() {
		frame = new JFrame();
		lblNewLabel = new JLabel("Sin errores");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("89px"),
				ColumnSpec.decode("56px"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("28px:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("23px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("6px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("47px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("65px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("1px"),},
			new RowSpec[] {
				FormFactory.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		String [] s = {"a", "b", "c"};
		
		JLabel lblEspectacles = new JLabel();
		lblEspectacles.setText("Espectacles");
		contentPane.add(lblEspectacles, "2, 2, 4, 1, default, center");
	
		comboBox = new JComboBox<String>();
		contentPane.add(comboBox, "6, 2, 4, 1, fill, default");
		comboBox.setSelectedItem(0);
		
		JLabel lblDate = new JLabel("Data");
		contentPane.add(lblDate, "2, 6, right, center");
		
		textField = new JTextField();
		contentPane.add(textField, "6, 6, 4, 1, fill, default");
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sin errores");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, "2, 16, 10, 1");
		
		JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					//llegim els dos parametres titol i data
				
					String titol = comboBox.getSelectedItem().toString();
				    String data = textField.getText();
				    //System.out.println(titol + " " + data);
					ctrlPresentacion.PrOkobteRepresentacions(titol, data);
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//lblNewLabel.setText("No hay Representaciones para Esa Data y ese Espectaculo");
					lblNewLabel.setText(e.toString());
				} // CAMBIAR
			}
			
		});
		contentPane.add(okButton, "6, 12, left, top");
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
			
		});
		contentPane.add(cancelButton, "8, 12, left, top");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, "2, 16, 10, 1");

		
	}
	
	public void mostra() {
		frame.setVisible(true);
	}
	
	public void assignaEspectacles(ArrayList<String> listTitolsEspec){
		if(listTitolsEspec.size()==0)
			lblNewLabel.setText("No hi ha cap espectacle");
		//System.out.println(listTitolsEspec.get(0));
		//System.out.println(listTitolsEspec.get(1));
		//System.out.println(listTitolsEspec.get(2));
		for (String l : listTitolsEspec){
			comboBox.addItem(l);
		}
	}

}
