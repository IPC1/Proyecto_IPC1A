package ControlHabitaciones;

import java.util.Date;

import javax.swing.JOptionPane;

public class Modulo {
	Nodo inicio;
	Nodo Fin;
	Modulo(){
		for(int j=1; j<18; j++){
			for (int i=1;i<8;i++){
				Nodo temp= new Nodo (null, null, "Sencilla", j, i, null, 0,1, "Hotel de Centro America", inicio);
				inicio= temp;
			}
			for (int i=8;i<15;i++){
				Nodo temp= new Nodo (null, null, "Sencilla", j, i, null, 0,2, "Hotel de Centro America", inicio);
				inicio= temp;
			}
			for (int i=15;i<22;i++){
				Nodo temp= new Nodo (null, null, "Sencilla", j, i, null, 0,3, "Hotel de Centro America", inicio);
				inicio= temp;
			}
		}
	}
	
	public void CheckIn(int torre,int NoHabitacion, String Nombre, int Nit, int dias, Date fechaE, Date fechaS){
		Nodo temp=inicio;
		while(torre!=temp.getTorre()){
			temp=temp.siguiente;
		}
		while (NoHabitacion!=temp.getHabitacion()){
			temp=temp.siguiente;
		}
		if (torre==temp.getTorre()){
			if(NoHabitacion==temp.getHabitacion()){
				temp.setNombre(Nombre);
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
				temp.setNombre(null);
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
		}else JOptionPane.showMessageDialog (null,"Error al buscar Nivel");
		
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
							nl+"Ubicada en el modulo: "+temp.getTorre()+" Nivel:   "+temp.getNivel()+
							nl+"Con un costo de: "+temp.getMonto());
				else{
					JOptionPane.showMessageDialog (null,"Habitacion del Hotel "+temp.getReferencia()+
							nl+"Ocupada por"+temp.getNombre()+ " con NIT "+temp.getNIT()+
							nl+"Tipo de Habitacion"+temp.getTipoHabitacion()+
							nl+"Ubicada en el modulo: "+temp.getTorre()+" Nivel: "+temp.getNivel()+
							nl+"Con un monto en la cuenta total de: "+temp.getMonto());
				}
			}		
		}
		
	}
}

