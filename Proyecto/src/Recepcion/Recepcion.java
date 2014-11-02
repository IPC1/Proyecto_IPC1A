package Recepcion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ReservacionHabitaciones.Reservaciones;
import ControlHabitaciones.SalidasEntradas;
import Servicios.Servicios;

public class Recepcion extends JFrame implements ActionListener{

	private JPanel contentPane;
	JLabel lblRecepcionHotel = new JLabel("RECEPCION HOTEL DE CENTRO AMERICA");
	JButton Recepciones = new JButton("Reservaciones");
	JButton Check= new JButton("Entrada/Salida");
	JButton Servicios = new JButton("Servicios");
	Reservaciones R= new Reservaciones();
	SalidasEntradas SE = new SalidasEntradas ();
	Servicios S = new Servicios();
	
	public Recepcion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblRecepcionHotel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRecepcionHotel.setBounds(27, 27, 318, 14);
		contentPane.add(lblRecepcionHotel);
		
		
	    Recepciones.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Recepciones.setBounds(126, 72, 139, 31);
		contentPane.add(Recepciones);
		Recepciones.addActionListener(this);
		
		Check.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Check.setBounds(126, 209, 139, 31);
		contentPane.add(Check);
		Check.addActionListener(this);
		
		Servicios.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Servicios.setBounds(126, 140, 139, 31);
		contentPane.add(Servicios);
		Servicios.addActionListener(this);
		
		setVisible(true);
	}
	
		@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource()==Recepciones){
				R.frame.setVisible(true);
				
				}else if (e.getSource()==Check){
				SE.setVisible(true);
				
				}else if (e.getSource()==Servicios){
				S.setVisible(true);
				
				}
				
			}
			
		
	}


