package Servicios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class Servicios extends JFrame implements ActionListener{

	private JPanel contentPane, pane;
	
	JButton btnGimnasio = new JButton("Gimnasio");
	JButton btnRestaurante = new JButton("Restaurante");
	JButton btnCentroDeConvenciones = new JButton("C. Convenciones");
	JButton btnBar = new JButton("Bar");
	JButton btnPolideportivo = new JButton("Polideportivo");
	JButton btnMasterSnack = new JButton("Master Snack");
	JButton btnClubDeNios = new JButton("Club de Ni\u00F1os");
	JButton btnEnfermeria = new JButton("Enfermeria");
	JButton btnDiscoteca = new JButton("Discoteca");
	JButton btnRegresar= new JButton("Menu Anterior");
	JTextField txtMonto, textField, textField_1;
	JComboBox comboBox;
	private final JButton btnCuenta = new JButton("A\u00F1adir a Cuenta");
	
	public Servicios() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 361, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnRestaurante.setBounds(10, 11, 115, 36);
		contentPane.add(btnRestaurante);
		btnRestaurante.addActionListener(this);
		
		btnGimnasio.setBounds(10, 53, 115, 34);
		contentPane.add(btnGimnasio);
		btnGimnasio.addActionListener(this);
		
		btnCentroDeConvenciones.setBounds(10, 98, 115, 36);
		contentPane.add(btnCentroDeConvenciones);
		btnCentroDeConvenciones.addActionListener(this);
		
		btnBar.setBounds(10, 147, 115, 36);
		contentPane.add(btnBar);
		btnBar.addActionListener(this);
		
		btnPolideportivo.setBounds(174, 11, 115, 36);
		contentPane.add(btnPolideportivo);
		btnPolideportivo.addActionListener(this);
		
		btnMasterSnack.setBounds(174, 52, 115, 36);
		contentPane.add(btnMasterSnack);
		btnMasterSnack.addActionListener(this);
		
		btnClubDeNios.setBounds(174, 98, 115, 36);
		contentPane.add(btnClubDeNios);
		btnClubDeNios.addActionListener(this);
		
		btnEnfermeria.setBounds(174, 147, 115, 36);
		contentPane.add(btnEnfermeria);
		btnEnfermeria.addActionListener(this);
		
		btnDiscoteca.setBounds(93, 194, 115, 36);
		contentPane.add(btnDiscoteca);
		btnDiscoteca.addActionListener(this);
		
		JLabel lblHotelDeCentro = new JLabel("HOTEL DE CENTRO AMERICA");
		lblHotelDeCentro.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelDeCentro.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblHotelDeCentro.setBounds(33, 237, 256, 14);
		contentPane.add(lblHotelDeCentro);
		
		JLabel lblServicios = new JLabel("S\r\n");
		lblServicios.setHorizontalAlignment(SwingConstants.TRAILING);
		lblServicios.setToolTipText("");
		lblServicios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblServicios.setBounds(299, 15, 29, 22);
		contentPane.add(lblServicios);
		
		JLabel lblE = new JLabel("E");
		lblE.setToolTipText("");
		lblE.setHorizontalAlignment(SwingConstants.TRAILING);
		lblE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblE.setBounds(299, 36, 29, 22);
		contentPane.add(lblE);
		
		JLabel lblR = new JLabel("R");
		lblR.setToolTipText("");
		lblR.setHorizontalAlignment(SwingConstants.TRAILING);
		lblR.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblR.setBounds(299, 56, 29, 22);
		contentPane.add(lblR);
		
		JLabel lblV = new JLabel("V");
		lblV.setToolTipText("");
		lblV.setHorizontalAlignment(SwingConstants.TRAILING);
		lblV.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblV.setBounds(299, 79, 29, 22);
		contentPane.add(lblV);
		
		JLabel lblI = new JLabel("I");
		lblI.setToolTipText("");
		lblI.setHorizontalAlignment(SwingConstants.TRAILING);
		lblI.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblI.setBounds(299, 98, 29, 22);
		contentPane.add(lblI);
		
		JLabel lblC = new JLabel("C");
		lblC.setToolTipText("");
		lblC.setHorizontalAlignment(SwingConstants.TRAILING);
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblC.setBounds(299, 112, 29, 22);
		contentPane.add(lblC);
		
		JLabel lblI_1 = new JLabel("I");
		lblI_1.setToolTipText("");
		lblI_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblI_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblI_1.setBounds(299, 135, 29, 22);
		contentPane.add(lblI_1);
		
		JLabel lblO = new JLabel("O");
		lblO.setToolTipText("");
		lblO.setHorizontalAlignment(SwingConstants.TRAILING);
		lblO.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblO.setBounds(299, 151, 29, 22);
		contentPane.add(lblO);
		
		JLabel lblS = new JLabel("S");
		lblS.setToolTipText("");
		lblS.setHorizontalAlignment(SwingConstants.TRAILING);
		lblS.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblS.setBounds(299, 168, 29, 22);
		contentPane.add(lblS);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		pane= new JPanel();
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane);
		pane.setLayout(null);
		
		JTextArea textPane = new JTextArea();
		textPane.setEditable(false);
		textPane.setLineWrap(true);
		textPane.setBounds(5,5, 330, 125);
		JScrollPane scroll = new JScrollPane (textPane);
		scroll.setBounds(5,5, 335, 125);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    pane.add(scroll);
		
		btnCuenta.setBounds(9, 194, 130, 36);
		pane.add(btnCuenta);
		btnCuenta.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e){
            	String edificio=(String)comboBox.getSelectedItem();
        		int noEdificio=Integer.parseInt(textField_1.getText());
        		int habitacion= Integer.parseInt(textField.getText());
        		
               
            }
        });
		
		btnRegresar.setBounds(215, 194, 118,36);
		pane.add(btnRegresar);
		btnRegresar.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
               setContentPane(contentPane);
            }
        });      
		
		txtMonto = new JTextField();
		txtMonto.setBounds(83, 163, 75, 20);
		pane.add(txtMonto);
		txtMonto.setColumns(10);
		
		JLabel lblMontoTotal = new JLabel("Monto Total");
		lblMontoTotal.setBounds(10, 169, 74, 14);
		pane.add(lblMontoTotal);
		
		JLabel lblHabitacion = new JLabel("Habitacion");
		lblHabitacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHabitacion.setBounds(183, 169, 60, 14);
		pane.add(lblHabitacion);
		
		textField = new JTextField();
		textField.setBounds(253, 163, 53, 20);
		pane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEdificio = new JLabel("Edificio");
		lblEdificio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEdificio.setBounds(42, 135, 46, 22);
		pane.add(lblEdificio);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(98, 135, 66, 20);
		comboBox.addItem("Torre");
		comboBox.addItem("Modulo");
		pane.add(comboBox);
		
		JLabel lblNoEdificio = new JLabel("No.Edificio");
		lblNoEdificio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNoEdificio.setBounds(184, 135, 79, 14);
		pane.add(lblNoEdificio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(273, 131, 37, 20);
		pane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblHotelDeCentro = new JLabel();
		lblHotelDeCentro.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelDeCentro.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblHotelDeCentro.setBounds(0, 241, 351, 14);
		pane.add(lblHotelDeCentro);
		
		String nl = System.getProperty("line.separator");
		if(e.getSource()==btnBar){
			lblHotelDeCentro.setText("Bar");
			textPane.setText("1. Bar ''Playa Fria''"+
						nl+"   Ubicado a un costado de la piscina salada, al extremo  norte."+
						nl+"   Horaio: 5.00pm-1.30am, de jueves a domingos."+
						nl+"   Precios a partir de Q50.00"+
						nl+"   Capacidad para 130 Personas"+
					nl+"2.Bar ''Mirador''"+
						nl+"Ubicado en la playa luego del restaurante 'Mayan Grill',  extremo sur de la piscina salada."+
						nl+"   Horaio: 11.00am-0.00am, todos los dias."+
						nl+"   Precios a partir de Q30.00"+
						nl+"   Capacidad para 150 Personas"+
					nl+"3. Lobby Bar"+
						nl+"   Ubicado en el loby del hotel."+
						nl+"   Horaio: 7.00am-11pm, todos los días."+
						nl+"   Precios a partir de Q70.00"+
						nl+"   Capacidad para 100 Personas"+
					nl+"4. Disco Bar"+
						nl+"   Ubicado a la par de la Discoteca."+
						nl+"   Horaio: 5.00pm-1.30am, de jueves a domingos."+
						nl+"   Precios a partir de Q50.00"+
						nl+"   Capacidad para 130 Personas");
		}else if(e.getSource()==btnGimnasio){
			lblHotelDeCentro.setText("Gimnasio");
			textPane.setText("1. Bar ''Playa Fria''"+
						nl+"   Ubicado en medio de las dos torres."+
						nl+"   Horaio: 5.00am-10.00pm, de lunes a domingo"+
						nl+"   Precio de Entrada Q20.00."+
						nl+"   Precio de Clases a partir de Q70.00"+
						nl+"   Capacidad para 50 Personas");
		}
		
		
	}
}
