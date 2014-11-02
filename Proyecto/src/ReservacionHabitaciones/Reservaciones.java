package ReservacionHabitaciones;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Reservaciones implements ActionListener{
	 public JFrame frame= new JFrame();
	private JPanel contentPane;
	private JTextField NIT;
	private JTextField Nombre;
	private JFormattedTextField Fecha;
	private JTextField Torre;
	private JTextField Modulo;
	private JTextField Habitacion;
	private JTextField Referencia;
	JButton btnReservar = new JButton("Reservar");
	JButton btnBuscar = new JButton("Buscar");
	JButton btnCancelar = new JButton("Cancelar");
	JButton btnTotal = new JButton("Total");
	Lista reservaciones = new Lista();
	private JFormattedTextField FechaS;
	JComboBox comboBox = new JComboBox();
	private JTextField noCancelacion;
	private JTextField Total;
	DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	Date fecha,fechaS;
	int noReservacion,nit, modulo, torre,habitacion, total;
	int contador,dias; 
	JLabel lblCodigo = new JLabel(Integer.toString(contador));
	String referencia,tipoHabitacion, nombre;
	private JTextField Dias;
	
	
	public Reservaciones() {
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 416, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		frame.setVisible(false);
		
		JLabel lblReservacionesHotelDe = new JLabel("RESERVACIONES HOTEL DE CENTRO AMERICA");
		lblReservacionesHotelDe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblReservacionesHotelDe.setBounds(21, 11, 351, 14);
		contentPane.add(lblReservacionesHotelDe);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(21, 245, 46, 14);
		contentPane.add(lblNombre);
		
		NIT = new JTextField();
		NIT.setBounds(86, 211, 86, 20);
		contentPane.add(NIT);
		NIT.setColumns(10);
		
		JLabel lblId = new JLabel("NIT");
		lblId.setBounds(41, 214, 26, 14);
		contentPane.add(lblId);
		
		JLabel lblNoReservacion = new JLabel("No. Reservacion");
		lblNoReservacion.setBounds(286, 189, 86, 14);
		contentPane.add(lblNoReservacion);
		
		Nombre = new JTextField();
		Nombre.setBounds(86, 242, 286, 20);
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		contador=0;
		JLabel lblCodigo = new JLabel(Integer.toString(contador));
		lblCodigo.setBounds(286, 214, 76, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblTipoDeHabitacion = new JLabel("Tipo de Habitacion");
		lblTipoDeHabitacion.setBounds(21, 47, 98, 14);
		contentPane.add(lblTipoDeHabitacion);
		
		
		comboBox.setBounds(129, 44, 140, 20);
		comboBox.addItem("Sencilla");
		comboBox.addItem("Regular");
		comboBox.addItem("Exclusiva");
		contentPane.add(comboBox);
		
		
		btnBuscar.setBounds(286, 47, 76, 48);
		contentPane.add(btnBuscar);
		
		JLabel lblTorre = new JLabel("Torre");
		lblTorre.setBounds(21, 161, 26, 14);
		contentPane.add(lblTorre);
		
		JLabel lblFecha = new JLabel("Fecha de Entrada");
		lblFecha.setBounds(21, 82, 98, 14);
		contentPane.add(lblFecha);
		
		Fecha = new JFormattedTextField (format);
		Fecha.setBounds(129, 79, 140, 20);
		contentPane.add(Fecha);
		Fecha.setColumns(10);
		
		Torre = new JTextField(null);
		Torre.setBounds(57, 158, 36, 20);
		contentPane.add(Torre);
		Torre.setColumns(10);
		
		JLabel lblModulo = new JLabel("Modulo");
		lblModulo.setBounds(126, 161, 46, 14);
		contentPane.add(lblModulo);
		
		Modulo = new JTextField(null);
		Modulo.setBounds(182, 158, 36, 20);
		contentPane.add(Modulo);
		Modulo.setColumns(10);
		
		JLabel lblHabitacion = new JLabel("Habitaci\u00F3n");
		lblHabitacion.setBounds(228, 161, 56, 14);
		contentPane.add(lblHabitacion);
		
		Habitacion = new JTextField();
		Habitacion.setBounds(286, 158, 36, 20);
		contentPane.add(Habitacion);
		Habitacion.setColumns(10);
		
		btnReservar.setBounds(264, 294, 98, 34);
		contentPane.add(btnReservar);
		btnReservar.addActionListener(this);
		
		JLabel lblReferencia = new JLabel("Referencia");
		lblReferencia.setBounds(20, 304, 56, 14);
		contentPane.add(lblReferencia);
		
		Referencia = new JTextField();
		Referencia.setBounds(86, 301, 119, 20);
		contentPane.add(Referencia);
		Referencia.setColumns(10);
		
		JLabel lblFechaDeSalida = new JLabel("Fecha de Salida");
		lblFechaDeSalida.setBounds(21, 107, 98, 14);
		contentPane.add(lblFechaDeSalida);
		
		FechaS= new JFormattedTextField (format);
		FechaS.setBounds(129, 104, 140, 20);
		contentPane.add(FechaS);
		FechaS.setColumns(10);
		
		JLabel lblNoACancelar = new JLabel("No. A Cancelar");
		lblNoACancelar.setBounds(21, 357, 76, 14);
		contentPane.add(lblNoACancelar);
		
		noCancelacion = new JTextField();
		noCancelacion.setBounds(100, 354, 36, 20);
		contentPane.add(noCancelacion);
		noCancelacion.setColumns(10);
		
		
		btnCancelar.setBounds(164, 347, 94, 34);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(this);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(47, 279, 46, 14);
		contentPane.add(lblTotal);
		
		Total = new JTextField();
		Total.setEditable(false);
		Total.setBounds(86, 270, 86, 20);
		contentPane.add(Total);
		Total.setColumns(10);
		
		JLabel lblDiasTotales = new JLabel("Dias Totales");
		lblDiasTotales.setBounds(47, 132, 72, 14);
		contentPane.add(lblDiasTotales);
		
		Dias = new JTextField();
		Dias.setBounds(129, 130, 43, 20);
		contentPane.add(Dias);
		Dias.setColumns(10);
		
		
		btnTotal.setBounds(182, 127, 56, 23);
		contentPane.add(btnTotal);
		btnTotal.addActionListener(this);

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
		// TODO Auto-generated method stub
		if(e.getSource()==btnTotal){
			total();
			Total.setText(Integer.toString(total));
					
		
		}
	else if (e.getSource()==btnReservar){
		
		torre=Integer.parseInt(Torre.getText());
		modulo=Integer.parseInt(Modulo.getText());
		habitacion=Integer.parseInt(Habitacion.getText());
		nit=Integer.parseInt(NIT.getText());
		nombre= Nombre.getText();
		referencia=Referencia.getText();
		noReservacion= contador;
		fechaS=(Date) FechaS.getValue();
		fecha=(Date) Fecha.getValue();
		
		reservaciones.insertar(noReservacion,fecha,fechaS,tipoHabitacion,torre,modulo,habitacion,nombre,nit,referencia);
	JOptionPane.showMessageDialog(null,"Se ha realizado la Reservación No."+contador);		
		contador++;
		lblCodigo.setText(Integer.toString(contador));
		Fecha.setText(null);
		FechaS.setText(" ");
		Torre.setText(" ");
		Modulo.setText(" ");
		Habitacion.setText(" ");
		NIT.setText(" ");
		Nombre.setText(" ");
		Referencia.setText(" ");
		
		}
		
		else if(e.getSource()==btnCancelar){
			reservaciones.eliminarNoReservacion(Integer.parseInt(noCancelacion.getText()));
			noCancelacion.setText(" ");
		}
	}
	
	
}
