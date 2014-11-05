package ControlHabitaciones;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import Recepcion.PanelImagen;
import java.awt.Color;



public class SalidasEntradas extends JFrame implements ActionListener{

	private PanelImagen contentPane;
	private JTextField NoEdificio;
	private JTextField NoHabitacion;
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
	JButton btnDias = new JButton("Dias");
	JButton btnEspecificaciones = new JButton("Especificaciones");
	
	public static Torre torre= new Torre();
	public static Modulo modulo= new Modulo();
	
	DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	int noEdificio, habitacion, nit,nivel,dias;
	String nombre,edificio;
	Date entrada, salida;
	
	

	public SalidasEntradas() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 671, 421);
		contentPane = new PanelImagen("/Imagenes/EntradaSalidas.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRecepcionDeHabitaciones = new JLabel("RECEPCION DE HABITACIONES ");
		lblRecepcionDeHabitaciones.setForeground(new Color(0, 255, 0));
		lblRecepcionDeHabitaciones.setFont(new Font("Tekton Pro", Font.BOLD, 30));
		lblRecepcionDeHabitaciones.setBounds(110, 11, 422, 32);
		contentPane.add(lblRecepcionDeHabitaciones);
		
		JLabel lblEdificio = new JLabel("Edificio");
		lblEdificio.setForeground(new Color(250, 240, 230));
		lblEdificio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEdificio.setBounds(35, 63, 75, 14);
		contentPane.add(lblEdificio);
		comboBox.setForeground(new Color(47, 79, 79));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		comboBox.setBounds(120, 60, 85, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Torre");
		comboBox.addItem("Modulo");
		
		JLabel lblNoEdificio = new JLabel("No. Edificio");
		lblNoEdificio.setForeground(new Color(245, 255, 250));
		lblNoEdificio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNoEdificio.setBounds(238, 66, 93, 14);
		contentPane.add(lblNoEdificio);
		
		NoEdificio = new JTextField();
		NoEdificio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		NoEdificio.setBounds(344, 63, 36, 23);
		contentPane.add(NoEdificio);
		NoEdificio.setColumns(10);
		
		JLabel lblNoHabitacion = new JLabel("No. Habitacion");
		lblNoHabitacion.setForeground(new Color(248, 248, 255));
		lblNoHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNoHabitacion.setBounds(35, 117, 131, 14);
		contentPane.add(lblNoHabitacion);
		
		NoHabitacion = new JTextField();
		NoHabitacion.setBounds(159, 117, 46, 20);
		contentPane.add(NoHabitacion);
		NoHabitacion.setColumns(10);
		
		JLabel lblNit = new JLabel("NIT");
		lblNit.setForeground(new Color(255, 255, 255));
		lblNit.setFont(new Font("Tekton Pro", Font.PLAIN, 27));
		lblNit.setBounds(444, 60, 57, 23);
		contentPane.add(lblNit);
		
		Nit = new JTextField();
		Nit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Nit.setBounds(473, 85, 143, 20);
		contentPane.add(Nit);
		Nit.setColumns(10);
		
		JLabel lblFechaDeEntrada = new JLabel("Fecha de Entrada");
		lblFechaDeEntrada.setForeground(new Color(245, 255, 250));
		lblFechaDeEntrada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFechaDeEntrada.setBounds(25, 171, 159, 14);
		contentPane.add(lblFechaDeEntrada);
		
		Entrada =new JFormattedTextField (format);
		Entrada.setBounds(180, 171, 111, 20);
		contentPane.add(Entrada);
		Entrada.setColumns(10);
		
		JLabel lblFechaDeSalida = new JLabel("Fecha de Salida");
		lblFechaDeSalida.setForeground(new Color(255, 250, 250));
		lblFechaDeSalida.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFechaDeSalida.setBounds(29, 196, 137, 14);
		contentPane.add(lblFechaDeSalida);
		
		Salida = new JFormattedTextField (format);
		Salida.setBounds(180, 196, 111, 20);
		contentPane.add(Salida);
		Salida.setColumns(10);
		btnEstado.setForeground(new Color(47, 79, 79));
		
		btnEstado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEstado.setBounds(57, 258, 141, 35);
		btnEstado.addActionListener(this);
		contentPane.add(btnEstado);
		btnCuenta.setForeground(new Color(47, 79, 79));
		
		btnCuenta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCuenta.setBounds(57, 304, 142, 35);
		btnCuenta.addActionListener(this);
		contentPane.add(btnCuenta);
		btnCheckIn.setForeground(new Color(47, 79, 79));
		
		btnCheckIn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCheckIn.setBounds(462, 259, 142, 33);
		btnCheckIn.addActionListener(this);
		contentPane.add(btnCheckIn);
		btnCheckOut.setForeground(new Color(47, 79, 79));
		
		btnCheckOut.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCheckOut.setBounds(462, 304, 142, 35);
		btnCheckOut.addActionListener(this);
		contentPane.add(btnCheckOut);
		
		Nivel = new JTextField();
		Nivel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Nivel.setBounds(344, 112, 36, 25);
		contentPane.add(Nivel);
		Nivel.setColumns(10);
		btnNivel.setHorizontalAlignment(SwingConstants.LEFT);
		btnNivel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNivel.setForeground(new Color(47, 79, 79));
		
		
		btnNivel.setBounds(267, 110, 64, 31);
		btnNivel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	edificio=(String)comboBox.getSelectedItem();
        		noEdificio=Integer.parseInt(NoEdificio.getText());
            	if (edificio=="Torre"){
    				Nivel.setText(Integer.toString(torre.Nivel(habitacion,noEdificio)));
    			}else if(edificio=="Modulo"){
    				Nivel.setText(Integer.toString(modulo.Nivel(habitacion,noEdificio)));
    			}
                    }
        });
		contentPane.add(btnNivel);
		btnEspecificaciones.setForeground(new Color(47, 79, 79));
		
		
		btnEspecificaciones.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEspecificaciones.setBounds(238, 259, 142, 35);
		btnEspecificaciones.addActionListener(this);
		contentPane.add(btnEspecificaciones);
		
		Dias = new JTextField();
		Dias.setBounds(323, 195, 57, 23);
		contentPane.add(Dias);
		Dias.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 235, 591, 32);
		contentPane.add(separator);
		
		JLabel lblhotelDeCentro = new JLabel("--HOTEL DE CENTRO AMERICA--");
		lblhotelDeCentro.setForeground(new Color(0, 255, 127));
		lblhotelDeCentro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblhotelDeCentro.setBounds(180, 358, 304, 20);
		contentPane.add(lblhotelDeCentro);
		
		JButton btnBuscar = new JButton("Buscar por Huesped");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBuscar.setForeground(new Color(47, 79, 79));
		btnBuscar.setBounds(431, 128, 201, 32);
		contentPane.add(btnBuscar);
		
		
		btnDias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	entrada=(Date) Entrada.getValue();
        		salida=(Date) Salida.getValue();
            	final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000;
    			long diferencia = ( salida.getTime()-entrada.getTime())/MILLSECS_PER_DAY ; 
    			Dias.setText(""+diferencia);
                    }
        });
		btnDias.setHorizontalAlignment(SwingConstants.LEFT);
		btnDias.setForeground(new Color(47, 79, 79));
		btnDias.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDias.setBounds(316, 168, 64, 23);
		contentPane.add(btnDias);
		
		setVisible(false);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		habitacion=Integer.parseInt(NoHabitacion.getText());
		nit=Integer.parseInt(Nit.getText());
		dias=Integer.parseInt(Dias.getText());
		
		if (e.getSource()==btnNivel){
			
		
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
				torre.CheckIn(noEdificio,habitacion, nit, dias, entrada, salida);
			}else if(edificio=="Modulo"){
				modulo.CheckIn(noEdificio,habitacion, nit, dias, entrada, salida);
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
