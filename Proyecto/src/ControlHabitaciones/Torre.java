package ControlHabitaciones;

import java.util.Date;

import javax.swing.JOptionPane;

import Clientes.Clientes;
import Recepcion.Recepcion;

public class Torre {
Nodo inicio;
Nodo Fin;

	Torre(){
		inicio=new Nodo (null, null, "Sencilla", 1, 1, 0,1, Recepcion.nombreHotel, inicio);
		for (int i=2;i<12; i++){
			Nodo temp= new Nodo (null, null, "Sencilla", 1, i, 0,1,  Recepcion.nombreHotel, inicio);
			inicio= temp;
		}
		for (int i=12;i<24;i++){
			Nodo temp= new Nodo (null, null, "Sencilla", 1, i, 0,1,  Recepcion.nombreHotel, inicio);
			inicio= temp;
		}
		for (int i=24;i<38;i++){
			Nodo temp= new Nodo (null, null, "Regular", 1, i, 0,3, Recepcion.nombreHotel, inicio);
			inicio= temp;
		}
		for (int i=38;i<50;i++){
			Nodo temp= new Nodo (null, null, "Regular", 1, i, 0,4, Recepcion.nombreHotel, inicio);
			inicio= temp;
		}
		for (int i=50;i<62;i++){
			Nodo temp= new Nodo (null, null, "Exclusiva", 1, i, 0,5,  Recepcion.nombreHotel, inicio);
			inicio= temp;
		}for (int i=62;i<73;i++){
			Nodo temp= new Nodo (null, null, "Exclusiva", 1, i, 0,5,  Recepcion.nombreHotel, inicio);
			inicio= temp;
		}
		
		for (int i=1;i<18;i++){
			Nodo temp= new Nodo (null, null, "Sencilla", 2, i, 0,1,  Recepcion.nombreHotel, inicio);
			inicio= temp;
		}
		for (int i=18;i<37;i++){
			Nodo temp= new Nodo (null, null, "Regular", 2, i, 0,2,  Recepcion.nombreHotel,  inicio);
			inicio= temp;
		}
		for (int i=37;i<54;i++){
			Nodo temp= new Nodo (null, null, "Exclusiva", 2, i, 0,3,  Recepcion.nombreHotel, inicio);
			inicio= temp;
		}
		for (int i=54;i<72;i++){
			Nodo temp= new Nodo (null, null, "Exclusiva", 2, i, 0,3,  Recepcion.nombreHotel, inicio);
			inicio= temp;
		}
	}
	public void CheckIn(int torre,int NoHabitacion, int Nit, int dias, Date fechaE, Date fechaS){
		Nodo temp=inicio;
		while(torre!=temp.getTorre()){
			temp=temp.siguiente;
		}
		while (NoHabitacion!=temp.getHabitacion()){
			temp=temp.siguiente;
		}
		if (torre==temp.getTorre()){
			if(NoHabitacion==temp.getHabitacion()){
				temp.setNIT(Nit);
				temp.setFechaInicio(fechaE);
				temp.setFechaFin(fechaS);
				temp.setMonto(temp.getMonto()*dias);
				JOptionPane.showMessageDialog (null,"Habitacion Asignada");
			}
		}else JOptionPane.showMessageDialog (null,"Hubo erro al asignar habitacion");
	}	
	
	public void CheckOut(int torre,int NoHabitacion ){
		Nodo temp=inicio;
		while(torre!=temp.getTorre()){
			temp=temp.siguiente;
		}
		while (NoHabitacion!=temp.getHabitacion()){
			temp=temp.siguiente;
		}
		if (torre==temp.getTorre()){
			if(NoHabitacion==temp.getHabitacion()){
				
				JOptionPane.showMessageDialog (null,"Cuenta:"+temp.getMonto());
				temp.setNIT(0);
				temp.setFechaInicio(null);
				temp.setFechaFin(null);
				if (temp.getTipoHabitacion()=="Sencilla")
					temp.setMonto(200);
				else if (temp.getTipoHabitacion()=="Regular")
					temp.setMonto(350);
				else if (temp.getTipoHabitacion()=="Exclusiva")
					temp.setMonto(500);
				JOptionPane.showMessageDialog (null,"Habitacion Desasignada");
			}
		}else JOptionPane.showMessageDialog (null,"Hubo erro al desasignar habitacion");
		
	}
	
	public int Nivel(int NoHabitacion, int torre){
		Nodo temp=inicio;
		int nivel=0;
		while(torre!=temp.getTorre()){
			temp=temp.siguiente;
		}
		while (NoHabitacion!=temp.getHabitacion()){
			temp=temp.siguiente;
		}
		if (torre==temp.getTorre()){
			if(NoHabitacion==temp.getHabitacion()){
				nivel=temp.getNivel();
			}
		}else JOptionPane.showMessageDialog (null,"Error al buscar Nivel");
		
		return nivel;
	}
	
	public float Cuenta(int NoHabitacion, int torre){
		Nodo temp=inicio;
		float nivel=0;
		while(torre!=temp.getTorre()){
			temp=temp.siguiente;
		}
		while (NoHabitacion!=temp.getHabitacion()){
			temp=temp.siguiente;
		}
		if (torre==temp.getTorre()){
			if(NoHabitacion==temp.getHabitacion()){
				nivel=temp.getMonto();
			}
		}else JOptionPane.showMessageDialog (null,"Error al buscar Cuenta");
		
		return nivel;
	}
	
	public String Estado(int NoHabitacion, int torre){
		Nodo temp=inicio;
		String nivel=null;
		while(torre!=temp.getTorre()){
			temp=temp.siguiente;
		}
		while (NoHabitacion!=temp.getHabitacion()){
			temp=temp.siguiente;
		}
		if (torre==temp.getTorre()){
			if(NoHabitacion==temp.getHabitacion()){
				if(temp.getNIT()==0)
					nivel="desocupada";
				else nivel="ocupada";	
				}
			}else JOptionPane.showMessageDialog (null,"Error al buscar Estado");
		
		return nivel;
	}
	
	public void Especificaciones(int NoHabitacion, int torre){
		Nodo temp=inicio;
		String nivel=null;
		String nl = System.getProperty("line.separator");
		while(torre!=temp.getTorre()){
			temp=temp.siguiente;
		}
		while (NoHabitacion!=temp.getHabitacion()){
			temp=temp.siguiente;
		}
		if (torre==temp.getTorre()){
			if(NoHabitacion==temp.getHabitacion()){
				if(temp.getNIT()==0)
					JOptionPane.showMessageDialog (null,"Habitacion del Hotel "+temp.getReferencia()+
							nl+"Habitacion desocupada"+nl+
							"Tipo de Habitacion"+temp.getTipoHabitacion()+
							nl+"Ubicada en la torre "+temp.getTorre()+" Nivel:   "+temp.getNivel()+
							nl+"Con un costo de: "+temp.getMonto());
				else{
					JOptionPane.showMessageDialog (null,"Habitacion del Hotel "+temp.getReferencia()+
							nl+"Tipo de Habitacion"+temp.getTipoHabitacion()+
							nl+"Ubicada en el modulo: "+temp.getTorre()+" Nivel: "+temp.getNivel()+
							nl+"Con un monto en la cuenta total de: "+temp.getMonto());
					Clientes.clientes.Obtener(temp.getNIT());
				}
			}		
		}
		
	}
}
