package ReservacionHabitaciones;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import Recepcion.PanelImagen;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import java.awt.Color;

public class Reservaciones implements ActionListener{
	 public JFrame frame= new JFrame();
	private PanelImagen contentPane, pane;
	private JTextField NIT;
	private JTextField Nombre;
	private JFormattedTextField Fecha;
	private JTextField Torre;
	private JTextField Habitacion;
	private JTextField Referencia;
	JButton btnReservar = new JButton("Reservar");
	JButton btnBuscar = new JButton("Buscar");
	JButton btnCancelar = new JButton("Cancelar");
	JButton btnTotal = new JButton("Dias");
	Lista reservaciones = new Lista();
	private JFormattedTextField FechaS;
	JComboBox comboBox = new JComboBox();
	JComboBox comboBox_1 = new JComboBox();
	private JTextField noCancelacion;
	private JTextField Total;
	DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	Date entrada,salida;
	int noReservacion,nit,habitacion, total, contador,dias, NoEdificio; 
	JLabel lblCodigo = new JLabel(Integer.toString(contador));
	String referencia,tipoHabitacion, nombre, edificio;
	private JTextField Dias;
	
	
	public Reservaciones() {
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 702, 478);
		contentPane = new PanelImagen("/Imagenes/Reservaciones.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		frame.setVisible(false);
		
		
		JLabel lblReservacionesHotelDe = new JLabel("RESERVACIONES");
		lblReservacionesHotelDe.setForeground(new Color(245, 255, 250));
		lblReservacionesHotelDe.setFont(new Font("Tekton Pro", Font.PLAIN, 30));
		lblReservacionesHotelDe.setBounds(144, 14, 287, 36);
		contentPane.add(lblReservacionesHotelDe);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setForeground(new Color(255, 255, 240));
		lblNombre.setBounds(44, 304, 72, 14);
		contentPane.add(lblNombre);
		
		NIT = new JTextField();
		NIT.setBounds(126, 273, 86, 20);
		contentPane.add(NIT);
		NIT.setColumns(10);
		
		JLabel lblId = new JLabel("NIT");
		lblId.setForeground(new Color(255, 255, 240));
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblId.setBounds(67, 273, 36, 14);
		contentPane.add(lblId);
		
		JLabel lblNoReservacion = new JLabel("No. Reservacion");
		lblNoReservacion.setForeground(new Color(255, 255, 240));
		lblNoReservacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNoReservacion.setBounds(360, 256, 112, 14);
		contentPane.add(lblNoReservacion);
		
		Nombre = new JTextField();
		Nombre.setBounds(126, 298, 286, 20);
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		contador=0;
		JLabel lblCodigo = new JLabel(Integer.toString(contador));
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodigo.setForeground(new Color(255, 255, 255));
		lblCodigo.setBounds(426, 273, 46, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblTipoDeHabitacion = new JLabel("Tipo de Habitacion");
		lblTipoDeHabitacion.setForeground(new Color(250, 235, 215));
		lblTipoDeHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipoDeHabitacion.setBounds(21, 64, 148, 17);
		contentPane.add(lblTipoDeHabitacion);
		
		
		comboBox.setBounds(179, 61, 140, 20);
		comboBox.addItem("Sencilla");
		comboBox.addItem("Regular");
		comboBox.addItem("Exclusiva");
		contentPane.add(comboBox);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBuscar.setForeground(new Color(128, 0, 0));
		
		
		btnBuscar.setBounds(329, 64, 86, 36);
		btnBuscar.addActionListener(this);
		contentPane.add(btnBuscar);
		
		JLabel lblTorre = new JLabel("Edificio");
		lblTorre.setForeground(new Color(255, 255, 240));
		lblTorre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTorre.setBounds(32, 211, 61, 14);
		contentPane.add(lblTorre);
		
		JLabel lblFecha = new JLabel("Fecha de Entrada");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFecha.setForeground(new Color(250, 235, 215));
		lblFecha.setBounds(31, 98, 148, 14);
		contentPane.add(lblFecha);
		
		Fecha = new JFormattedTextField (format);
		Fecha.setBounds(179, 98, 140, 20);
		contentPane.add(Fecha);
		Fecha.setColumns(10);
		
		Torre = new JTextField(null);
		Torre.setBounds(291, 211, 36, 20);
		contentPane.add(Torre);
		Torre.setColumns(10);
		
		JLabel lblHabitacion = new JLabel("Habitaci\u00F3n");
		lblHabitacion.setForeground(new Color(255, 255, 240));
		lblHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHabitacion.setBounds(345, 211, 86, 14);
		contentPane.add(lblHabitacion);
		
		Habitacion = new JTextField();
		Habitacion.setBounds(436, 211, 36, 20);
		contentPane.add(Habitacion);
		Habitacion.setColumns(10);
		btnReservar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReservar.setForeground(new Color(128, 0, 0));
		
		btnReservar.setBounds(291, 350, 124, 34);
		contentPane.add(btnReservar);
		btnReservar.addActionListener(this);
		
		JLabel lblReferencia = new JLabel("Referencia");
		lblReferencia.setForeground(new Color(255, 255, 240));
		lblReferencia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblReferencia.setBounds(37, 360, 89, 14);
		contentPane.add(lblReferencia);
		
		Referencia = new JTextField();
		Referencia.setBounds(126, 357, 119, 20);
		contentPane.add(Referencia);
		Referencia.setColumns(10);
		
		JLabel lblFechaDeSalida = new JLabel("Fecha de Salida");
		lblFechaDeSalida.setForeground(new Color(255, 255, 224));
		lblFechaDeSalida.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFechaDeSalida.setBounds(44, 138, 133, 14);
		contentPane.add(lblFechaDeSalida);
		
		FechaS= new JFormattedTextField (format);
		FechaS.setBounds(179, 132, 140, 20);
		contentPane.add(FechaS);
		FechaS.setColumns(10);
		
		JLabel lblNoACancelar = new JLabel("No. A Cancelar");
		lblNoACancelar.setForeground(new Color(255, 255, 255));
		lblNoACancelar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNoACancelar.setBounds(529, 239, 119, 14);
		contentPane.add(lblNoACancelar);
		
		noCancelacion = new JTextField();
		noCancelacion.setBounds(550, 273, 61, 20);
		contentPane.add(noCancelacion);
		noCancelacion.setColumns(10);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancelar.setForeground(new Color(128, 0, 0));
		
		
		btnCancelar.setBounds(540, 304, 94, 34);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(this);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotal.setForeground(new Color(255, 255, 240));
		lblTotal.setBounds(70, 335, 46, 14);
		contentPane.add(lblTotal);
		
		Total = new JTextField();
		Total.setEditable(false);
		Total.setBounds(126, 329, 86, 20);
		contentPane.add(Total);
		Total.setColumns(10);
		
		JLabel lblDiasTotales = new JLabel("Dias Totales");
		lblDiasTotales.setForeground(new Color(255, 255, 240));
		lblDiasTotales.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDiasTotales.setBounds(67, 167, 102, 14);
		contentPane.add(lblDiasTotales);
		
		Dias = new JTextField();
		Dias.setBounds(179, 163, 46, 20);
		contentPane.add(Dias);
		Dias.setColumns(10);
		
		btnTotal.setForeground(new Color(139, 0, 0));
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTotal.setBounds(235, 163, 56, 23);
		contentPane.add(btnTotal);
		
		
		JLabel lblHotelDeCentro = new JLabel("HOTEL DE CENTRO AMERICA");
		lblHotelDeCentro.setForeground(new Color(128, 0, 0));
		lblHotelDeCentro.setFont(new Font("Tunga", Font.PLAIN, 30));
		lblHotelDeCentro.setBounds(126, 395, 346, 34);
		contentPane.add(lblHotelDeCentro);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(37, 239, 435, 14);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(502, 239, 19, 118);
		contentPane.add(separator_1);
		
		JLabel lblNoEdificio = new JLabel("No. Edificio");
		lblNoEdificio.setForeground(new Color(255, 255, 240));
		lblNoEdificio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNoEdificio.setBounds(197, 214, 95, 14);
		contentPane.add(lblNoEdificio);
		
		
		comboBox_1.setBounds(101, 211, 76, 20);
		comboBox_1.addItem("Torre");
		comboBox_1.addItem("Modulo");
		contentPane.add(comboBox_1);
		
		JButton btnTotal_1 = new JButton("Total");
		btnTotal_1.setBounds(208, 329, 61, 20);
		contentPane.add(btnTotal_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(436, 51, 19, 118);
		contentPane.add(separator_2);
		
		JButton btnCola = new JButton("Agregar a Cola");
		btnCola.setForeground(new Color(128, 0, 0));
		btnCola.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCola.setBounds(452, 64, 140, 36);
		contentPane.add(btnCola);
		
		JButton btnListarCola = new JButton("Listar Cola");
		btnListarCola.setForeground(new Color(128, 0, 0));
		btnListarCola.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnListarCola.setBounds(452, 115, 140, 37);
		contentPane.add(btnListarCola);
		btnListarCola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	JFrame frame2=new JFrame();
            	frame2.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        		frame2.setBounds(100, 100, 702, 478);
        		pane= new PanelImagen("/Imagenes/Reservaciones.jpg");
        		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
        		frame2.setContentPane(pane);
        		pane.setLayout(null);
        		JTextArea textPane = new JTextArea();
        		textPane.setEditable(false);
        		textPane.setLineWrap(true);
        		textPane.setBounds(5,5, 465, 300);
        		JScrollPane scroll = new JScrollPane (textPane);
        		scroll.setBounds(5,5, 490, 300);
        		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        		pane.add(scroll);
        		habitacion=Integer.parseInt(Habitacion.getText());
        		edificio= (String) comboBox_1.getSelectedItem();
        		NoEdificio=Integer.parseInt(Torre.getText());
        		String texto=reservaciones.ListarCola(habitacion,edificio,NoEdificio);
        		textPane.setText(" ");
            }
        });
		
		
		btnTotal_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	total();
    			Total.setText(Integer.toString(total));
            }
        });
		
		btnTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	entrada=(Date) Fecha.getValue();
        		salida=(Date) FechaS.getValue();
            	final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000;
    			long diferencia = ( salida.getTime()-entrada.getTime())/MILLSECS_PER_DAY ; 
    			Dias.setText(""+diferencia);
            }
        });
	}
	
	public void total(){
		tipoHabitacion=(String)comboBox.getSelectedItem();
		dias=Integer.parseInt(Dias.getText());
		if(tipoHabitacion=="Sencilla"){
			total=dias*200;
		}else if (tipoHabitacion=="Regular")
			total=dias*350;
		else if(tipoHabitacion=="Exclusiva")
			total=dias*500;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		habitacion=Integer.parseInt(Habitacion.getText());
		nit=Integer.parseInt(NIT.getText());
		NoEdificio=nit=Integer.parseInt(Torre.getText());
		nombre= Nombre.getText();
		referencia=Referencia.getText();
		noReservacion= contador;
		salida=(Date) FechaS.getValue();
		entrada=(Date) Fecha.getValue();
		// TODO Auto-generated method stub
		if(e.getSource()==btnTotal){
			total();
			Total.setText(Integer.toString(total));
					
		
		}else if (e.getSource()==btnReservar){
		
		reservaciones.insertar(noReservacion,entrada,salida,dias,tipoHabitacion,edificio,NoEdificio,habitacion,nombre,nit,referencia);
	JOptionPane.showMessageDialog(null,"Se ha realizado la Reservación No."+contador);		
		contador++;
		lblCodigo.setText(Integer.toString(contador));
		Fecha.setText(null);
		FechaS.setText(" ");
		Torre.setText(" ");
		Habitacion.setText(" ");
		NIT.setText(" ");
		Nombre.setText(" ");
		Referencia.setText(" ");
		
		}else if(e.getSource()==btnCancelar){
			reservaciones.eliminarNoReservacion(Integer.parseInt(noCancelacion.getText()));
			noCancelacion.setText(" ");
		}else if (e.getSource()==btnBuscar){
			reservaciones.Buscar(entrada,dias,edificio,NoEdificio,habitacion);
		}
	}
}
