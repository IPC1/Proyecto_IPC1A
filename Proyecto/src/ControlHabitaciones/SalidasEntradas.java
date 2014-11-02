package ControlHabitaciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SalidasEntradas extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField NoEdificio;
	private JTextField NoHabitacion;
	private JTextField Nombre;
	private JTextField Nit;
	private JFormattedTextField Entrada;
	private JFormattedTextField Salida;
	private JTextField Nivel;
	private JTextField Dias;
	JComboBox comboBox = new JComboBox();
	JButton btnEstado = new JButton("Estado");
	JButton btnCuenta = new JButton("Cuenta");
	JButton btnCheckIn = new JButton("Check-In");
	JButton btnCheckOut = new JButton("Check-Out");
	JButton btnNivel = new JButton("Nivel");
	JButton btnEspecificaciones = new JButton("Especificaciones");
	
	Torre torre= new Torre();
	Modulo modulo= new Modulo();
	
	DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	int noEdificio, habitacion, nit,nivel,dias;
	String nombre,edificio;
	Date entrada, salida;
	
	

	public SalidasEntradas() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 483, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRecepcionDeHabitaciones = new JLabel("RECEPCION DE HABITACIONES HOTEL DE CENTRO AMERICA");
		lblRecepcionDeHabitaciones.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRecepcionDeHabitaciones.setBounds(25, 11, 385, 14);
		contentPane.add(lblRecepcionDeHabitaciones);
		
		JLabel lblEdificio = new JLabel("Edificio");
		lblEdificio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEdificio.setBounds(25, 36, 46, 14);
		contentPane.add(lblEdificio);
		
		comboBox.setBounds(25, 61, 85, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Torre");
		comboBox.addItem("Modulo");
		
		JLabel lblNoEdificio = new JLabel("No. Edificio");
		lblNoEdificio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNoEdificio.setBounds(140, 36, 77, 14);
		contentPane.add(lblNoEdificio);
		
		NoEdificio = new JTextField();
		NoEdificio.setBounds(144, 61, 36, 20);
		contentPane.add(NoEdificio);
		NoEdificio.setColumns(10);
		
		JLabel lblNoHabitacion = new JLabel("No. Habitacion");
		lblNoHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNoHabitacion.setBounds(25, 92, 93, 14);
		contentPane.add(lblNoHabitacion);
		
		NoHabitacion = new JTextField();
		NoHabitacion.setBounds(25, 117, 46, 20);
		contentPane.add(NoHabitacion);
		NoHabitacion.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNombre.setBounds(271, 37, 46, 14);
		contentPane.add(lblNombre);
		
		Nombre = new JTextField();
		Nombre.setBounds(252, 61, 205, 20);
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		JLabel lblNit = new JLabel("NIT");
		lblNit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNit.setBounds(271, 96, 46, 14);
		contentPane.add(lblNit);
		
		Nit = new JTextField();
		Nit.setBounds(327, 94, 128, 20);
		contentPane.add(Nit);
		Nit.setColumns(10);
		
		JLabel lblFechaDeEntrada = new JLabel("Fecha de Entrada");
		lblFechaDeEntrada.setBounds(25, 147, 85, 14);
		contentPane.add(lblFechaDeEntrada);
		
		Entrada =new JFormattedTextField (format);
		Entrada.setBounds(25, 165, 86, 20);
		contentPane.add(Entrada);
		Entrada.setColumns(10);
		
		JLabel lblFechaDeSalida = new JLabel("Fecha de Salida");
		lblFechaDeSalida.setBounds(145, 147, 81, 14);
		contentPane.add(lblFechaDeSalida);
		
		Salida = new JFormattedTextField (format);
		Salida.setBounds(145, 165, 86, 20);
		contentPane.add(Salida);
		Salida.setColumns(10);
		
		btnEstado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEstado.setBounds(362, 134, 93, 20);
		btnEstado.addActionListener(this);
		contentPane.add(btnEstado);
		
		btnCuenta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCuenta.setBounds(358, 165, 99, 19);
		btnCuenta.addActionListener(this);
		contentPane.add(btnCuenta);
		
		btnCheckIn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCheckIn.setBounds(37, 244, 108, 56);
		btnCheckIn.addActionListener(this);
		contentPane.add(btnCheckIn);
		
		btnCheckOut.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCheckOut.setBounds(206, 244, 111, 56);
		btnCheckOut.addActionListener(this);
		contentPane.add(btnCheckOut);
		
		JLabel lblNivel = new JLabel("Nivel");
		lblNivel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNivel.setBounds(145, 92, 46, 14);
		contentPane.add(lblNivel);
		
		Nivel = new JTextField();
		Nivel.setBounds(201, 109, 36, 20);
		contentPane.add(Nivel);
		Nivel.setColumns(10);
		
		
		btnNivel.setBounds(140, 108, 62, 23);
		btnNivel.addActionListener(this);
		contentPane.add(btnNivel);
		
		
		btnEspecificaciones.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEspecificaciones.setBounds(329, 193, 128, 25);
		btnEspecificaciones.addActionListener(this);
		contentPane.add(btnEspecificaciones);
		
		JLabel lblDias = new JLabel("Dias ");
		lblDias.setBounds(25, 196, 46, 14);
		contentPane.add(lblDias);
		
		Dias = new JTextField();
		Dias.setBounds(52, 196, 57, 20);
		contentPane.add(Dias);
		Dias.setColumns(10);
		
		setVisible(false);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		habitacion=Integer.parseInt(NoHabitacion.getText());
		nit=Integer.parseInt(Nit.getText());
		nombre= Nombre.getText();
		entrada=(Date) Entrada.getValue();
		salida=(Date) Salida.getValue();
		edificio=(String)comboBox.getSelectedItem();
		noEdificio=Integer.parseInt(NoEdificio.getText());
		dias=Integer.parseInt(Dias.getText());
		
		if (e.getSource()==btnNivel){
			if (edificio=="Torre"){
				Nivel.setText(Integer.toString(torre.Nivel(habitacion,noEdificio)));
			}else if(edificio=="Modulo"){
				Nivel.setText(Integer.toString(modulo.Nivel(habitacion,noEdificio)));
			}
		
		}else if(e.getSource()==btnCuenta){
			if (edificio=="Torre"){
				JOptionPane.showMessageDialog (null,"Cuenta:"+torre.Cuenta(habitacion,noEdificio));
			}else if(edificio=="Modulo"){
				JOptionPane.showMessageDialog (null,"Cuenta:"+modulo.Cuenta(habitacion,noEdificio));
			}
		
		}else if(e.getSource()==btnEstado){
			if (edificio=="Torre"){
				JOptionPane.showMessageDialog (null,"La Habitación esta:"+torre.Estado(habitacion,noEdificio));
			}else if(edificio=="Modulo"){
				JOptionPane.showMessageDialog (null,"La Habitación esta:"+modulo.Estado(habitacion,noEdificio));
			}
		}else if (e.getSource()==btnCheckIn){
			if (edificio=="Torre"){
				torre.CheckIn(noEdificio,habitacion, nombre, nit, dias, entrada, salida);
			}else if(edificio=="Modulo"){
				modulo.CheckIn(noEdificio,habitacion, nombre, nit, dias, entrada, salida);
			}
			
		}else if(e.getSource()==btnCheckOut){
			if (edificio=="Torre"){
				torre.CheckOut(noEdificio,habitacion);
			}else if(edificio=="Modulo"){
				modulo.CheckOut(noEdificio,habitacion);
			}
			
		}else if (e.getSource()==btnEspecificaciones){
			if (edificio=="Torre"){
				torre.Especificaciones(noEdificio,habitacion);
			}else if(edificio=="Modulo"){
				modulo.Especificaciones(noEdificio,habitacion);
			}
		}
	}

}
