package ReservacionHabitaciones;

import java.util.Date;

import javax.swing.JOptionPane;

import Clientes.Clientes;

public class Lista {

	Nodo inicio;
	Nodo fin;
	String nl = System.getProperty("line.separator");
	public Lista (){
		inicio=null;
		fin=null;
	}
	public void insertar(int noReservacion, Date fechaI, Date fechaF,int dias,String tipoHabitacion, String edificio, int NoEdificio, int habitacion, String nombre, 
			int nit,String referencia){
		Nodo nuevo= new Nodo(noReservacion, fechaI, fechaF,dias,tipoHabitacion, edificio, NoEdificio, habitacion,nombre, 
				nit,referencia,inicio);
		inicio= nuevo;
		if (fin==null)
			fin=inicio;
		}

	public void eliminarNoReservacion( int noReservacion){
		Nodo temp=inicio;
		int cont=1;
		 while (noReservacion!= temp.getNoReservacion()){
			 temp=temp.siguiente;
			 cont++;
		 }
		 if(temp.cola!=null){
			 JOptionPane.showMessageDialog(null,"La habitacion tiene una cola."+temp.getNoReservacion());
			 temp.cola.eliminarNoReservacion(noReservacion);
			 
		 }else{
			 JOptionPane.showMessageDialog(null,"Se ha eliminado la Reservación No."+temp.getNoReservacion());
		 
			 if (cont==1){
				 inicio=temp.siguiente;
			 }else{
				 temp=inicio;
				 for (int i =1; i==cont-1; i++){
					 temp=temp.siguiente; 
				 }
				 temp.setSiguiente(temp.siguiente.siguiente);
			 }
			if (temp.siguiente==null){
					 fin=temp;
				 }
		 }
	}
	public void Buscar(Date fecha,int dias, String edificio, int NoEdificio, int habitacion){
		Nodo temp =inicio;
		while (temp!=null){
			if (fecha== temp.getFechaInicio()){
				if(edificio==temp.getEdificio()){
					if(NoEdificio==temp.getNoEdificio()){
						if (habitacion==temp.getHabitacion()){
								JOptionPane.showMessageDialog(null,"Existe una reserva con las mismas indicaciones."+
							nl+" Para crear la reservación necesita ir a colas");
								break;
						}
					}
					
				}
			}temp=temp.siguiente;
		}
		if(temp==null){
			JOptionPane.showMessageDialog(null,"No hay coincidencias");
		}
	}
	public void Colas(int noReservacion, Date fechaI, Date fechaF,int dias,String tipoHabitacion, String edificio, int NoEdificio, int habitacion, String nombre, 
			int nit,String referencia){
		Nodo temp =inicio;
		boolean igual=true;
		String nl = System.getProperty("line.separator");
		while (igual){
		if (fechaI== temp.getFechaInicio()){
			if(edificio==temp.getEdificio()){
				if(NoEdificio==temp.getNoEdificio()){
					if (habitacion==temp.getHabitacion()){
						if (dias >= temp.getDias()){
							JOptionPane.showMessageDialog(null,"Habitacion encontrada");
							igual=false;
						}
					}
				}
				
			}
		}temp=temp.siguiente;
		temp.cola.insertar(noReservacion, fechaI,fechaF,dias, tipoHabitacion, edificio, NoEdificio, habitacion, nombre, 
			nit, referencia);
		JOptionPane.showMessageDialog(null,"Reservacion agregada en cola a la habitacion:"+
				nl+"Edificio: "+edificio+" "+NoEdificio+
				nl+"Habitacion: "+habitacion);
		}
	}
	public String ListarCola(int habitacion, String edificio, int NoEdificio){
		Nodo temp=inicio;
		String texto =" ";
		while (temp!=null){
			if (edificio== temp.getEdificio()){
					if(NoEdificio==temp.getNoEdificio()){
						if (habitacion==temp.getHabitacion()){
								texto+=temp.cola.Listar();
						}
					}
			}temp=temp.siguiente;
		}
		return texto;
	}
	
	public String Listar(){
		Nodo temp=inicio;
		String texto=" ";
		do{
		texto+="Reservacion: "+temp.getNoReservacion()+"Fecha de Entrada: "+temp.getFechaInicio()+
				"Fecha de Salida: "+temp.getFechaFin()+"Edificio: "+temp.getEdificio()+temp.getNoEdificio()+
				"Habitacion: "+temp.getTipoHabitacion()+temp.getHabitacion()+Clientes.clientes.ObtenerString(temp.getNIT())+nl;
		temp=temp.siguiente;
		}while(temp!=null);
		return texto;
	}
	
	public int contar(){
		int cont = 0;
		Nodo temp=inicio;
		while (temp!= null){
			cont++;
			temp=temp.siguiente;
		}
		return cont;
	}
	}

