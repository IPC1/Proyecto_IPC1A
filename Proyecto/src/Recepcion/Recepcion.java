package Recepcion;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ReservacionHabitaciones.Reservaciones;
import Clientes.Clientes;
import ControlHabitaciones.SalidasEntradas;
import Servicios.Servicios;

import java.awt.Color;

public class Recepcion extends JFrame implements ActionListener {

	private JPanel contentPane;
	JLabel lblRecepcionHotel = new JLabel("RECEPCION HOTEL DE CENTRO AMERICA");
	JButton Recepciones = new JButton("Reservaciones");
	JButton Check= new JButton("Entrada/Salida");
	JButton Servicios = new JButton("Servicios");
	JButton btnClientes = new JButton("Clientes");
	
	Reservaciones R= new Reservaciones();
	SalidasEntradas SE = new SalidasEntradas ();
	Servicios S = new Servicios();
	static Clientes c=new Clientes();
	public static String nombreHotel;
	public Recepcion(String nombreHotel) {
		this.nombreHotel=nombreHotel;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 567, 417);
		contentPane = new PanelImagen("/Imagenes/Recepcion.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblRecepcionHotel.setForeground(new Color(255, 255, 255));
		
		lblRecepcionHotel.setFont(new Font("Trajan Pro", Font.BOLD, 20));
		lblRecepcionHotel.setBounds(42, 28, 471, 42);
		contentPane.add(lblRecepcionHotel);
	    Recepciones.setForeground(new Color(65, 105, 225));
		
		
	    Recepciones.setFont(new Font("Tunga", Font.BOLD, 20));
		Recepciones.setBounds(87, 117, 171, 56);
		contentPane.add(Recepciones);
		Recepciones.addActionListener(this);
		Check.setForeground(new Color(65, 105, 225));
		
		Check.setFont(new Font("Tahoma", Font.BOLD, 15));
		Check.setBounds(87, 213, 177, 51);
		contentPane.add(Check);
		Check.addActionListener(this);
		Servicios.setForeground(new Color(65, 105, 225));
		
		Servicios.setFont(new Font("Tahoma", Font.BOLD, 18));
		Servicios.setBounds(323, 117, 177, 51);
		contentPane.add(Servicios);
		Servicios.addActionListener(this);
		
		btnClientes.setFont(new Font("Tunga", Font.BOLD, 20));
		btnClientes.setForeground(new Color(65, 105, 225));
		btnClientes.setBounds(323, 215, 177, 51);
		contentPane.add(btnClientes);
		btnClientes.addActionListener(this);
		
		setVisible(false);
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
				
				}else if (e.getSource()==btnClientes){
				c.setVisible(true);	
				}
				
			}
	}


