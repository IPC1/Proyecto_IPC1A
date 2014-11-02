package ReservacionHabitaciones;

import java.util.Date;

import javax.swing.JOptionPane;

public class Lista {

	Nodo inicio;
	Nodo fin;
	
	public Lista (){
		inicio=null;
		fin=null;
	}
	public void insertar(int noReservacion, Date fechaI, Date fechaF,String tipoHabitacion, int torre, int modulo, int habitacion, String nombre, 
			int nit,String referencia){
		Nodo nuevo= new Nodo(noReservacion,fechaI,fechaF, tipoHabitacion,torre,modulo,habitacion, nombre, 
				nit, referencia, inicio);
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
	public void Buscar(Date fecha, String tipoHabitacion){
		Nodo temp =inicio;
		while (temp!=null){
			if (fecha== temp.getFecha()){
				if(tipoHabitacion==temp.getTipoHabitacion()){
					
				}
			}
		}
	}
	public void Listar(){
		Nodo temp=inicio;
		int Torre,Modulo, Habitacion;
		while (temp!= null){
			Torre=temp.getTorre();
			Modulo=temp.getModulo();
			Habitacion=temp.getHabitacion();
			System.out.println ("Habitacion: "+Habitacion+", Torre:"+Torre+", Modulo:"+Modulo);
			temp=temp.siguiente;
		}
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

